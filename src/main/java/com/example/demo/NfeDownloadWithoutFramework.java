package com.example.demo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NfeDownloadWithoutFramework {
    public static void main(String[] args) {
        try {
            // URL da página de verificação
            String url = "https://nfe.prefeitura.sp.gov.br/publico/verificacao.aspx";

            // Dados do formulário
            String urlParameters = "ctl00_body_tbNota=4763890" +
                    "&ctl00_body_tbVerificacao=ABMP-7U6G" +
                    "&ctl00_body_tbCPFCNPJ=10.864.846/0033-00";

            // Abrir conexão HTTP para enviar a requisição POST
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setDoOutput(true);

            // Enviar os dados do formulário
            try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                wr.writeBytes(urlParameters);
                wr.flush();
            }

            // Ler a resposta do servidor
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Exibir o HTML da página retornada
            String htmlResponse = response.toString();
            System.out.println("HTML Retornado: " + htmlResponse);

            // Localizar o link do PDF na resposta (supondo que ele esteja no HTML como <a href="...pdf">)
            String pdfLink = extractPdfLink(htmlResponse);

            if (pdfLink != null) {
                System.out.println("Link do PDF encontrado: " + pdfLink);

                // Fazer download do PDF
                downloadFile(pdfLink, "nota_fiscal.pdf");
                System.out.println("PDF baixado com sucesso!");
            } else {
                System.out.println("Link do PDF não encontrado na resposta.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para extrair o link do PDF do HTML
    private static String extractPdfLink(String html) {
        String pdfLinkStart = "href=\"";
        String pdfLinkEnd = ".pdf\"";

        int startIndex = html.indexOf(pdfLinkStart);
        if (startIndex != -1) {
            startIndex += pdfLinkStart.length();
            int endIndex = html.indexOf(pdfLinkEnd, startIndex);
            if (endIndex != -1) {
                return html.substring(startIndex, endIndex + 4); // +4 para incluir ".pdf"
            }
        }
        return null;
    }

    // Método para fazer download de um arquivo
    private static void downloadFile(String fileURL, String savePath) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(fileURL).openConnection();
            connection.setRequestMethod("GET");

            // Ler os bytes do arquivo
            byte[] fileBytes = connection.getInputStream().readAllBytes();

            // Salvar no disco
            Files.write(Paths.get(savePath), fileBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
