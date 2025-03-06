package com.example.demo;

import org.htmlunit.WebClient;
import org.htmlunit.html.HtmlPage;
import org.htmlunit.html.HtmlSubmitInput;
import org.htmlunit.html.HtmlTextInput;

public class HtmUnit {

    public static void main(String[] args) {
        try (WebClient webClient = new WebClient()) {
            // Desativar o suporte ao JavaScript se necessário
            webClient.getOptions().setJavaScriptEnabled(false);
            webClient.getOptions().setCssEnabled(false);

            // Acessar a página
            HtmlPage page = webClient.getPage("https://nfe.prefeitura.sp.gov.br/publico/verificacao.aspx");

            // Preencher os campos
            HtmlTextInput numeroNota = page.getHtmlElementById("ctl00_body_tbNota");
            numeroNota.setValue("4763890");

            HtmlTextInput codigoVerificacao = page.getHtmlElementById("ctl00_body_tbVerificacao");
            codigoVerificacao.setValue("ABMP-7U6G");

            HtmlTextInput cnpj = page.getHtmlElementById("ctl00_body_tbCPFCNPJ");
            cnpj.setValue("10.864.846/0033-00");

            // Clicar no botão
            HtmlSubmitInput botao = page.getHtmlElementById("ctl00_body_btVerificar");
            HtmlPage resultPage = botao.click();

            // Capturar o resultado
            System.out.println(resultPage.getBaseURL());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
