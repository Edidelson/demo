package com.example.demo;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupFile {

    public static void main(String[] args) throws IOException {
        // Carregar a página para capturar os campos e os dados necessários
        Connection connect = Jsoup.connect("https://nfe.prefeitura.sp.gov.br/publico/verificacao.aspx");
        Document doc = connect.get();

        final 

        //Connection.Response response  = connect.method(Connection.Method.POST).execute();
        // Agora que os campos estão preenchidos, envie o formulário
        Connection.Response response = Jsoup.connect("https://nfe.prefeitura.sp.gov.br/publico/verificacao.aspx")
                .data("ctl00$body$tbCPFCNPJ", "10.864.846/0033-00")
                .data("ctl00$body$tbNota", "4763890") // Inclua todos os campos e seus valores
                .data("ctl00$body$tbVerificacao", "ABMP-7U6G") // Inclua todos os campos e seus valores
                .method(Connection.Method.POST)
                .followRedirects(false)
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36")
                .execute();
        Document post = connect.post();
        // A resposta pode ser usada para analisar a página retornada após o envio
        System.out.println("Resposta do servidor: " + response.body());
    }
}
