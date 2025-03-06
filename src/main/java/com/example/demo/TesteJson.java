package com.example.demo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.List;

/**
 * 
 */
public class TesteJson {
    public static void main(String[] args) {
        String filePath = "testeJson.json";

        try{
            String conteudo = Files.readString(Path.of(filePath));
            // Converte para um JSONArray
            // Instância do ObjectMapper
            ObjectMapper mapper = new ObjectMapper();
            List<SolicitacaoCompraDTO> solicitacaoCompraDTO = mapper.readValue(conteudo, new TypeReference<List<SolicitacaoCompraDTO>>() {});

            for (SolicitacaoCompraDTO compraDTO : solicitacaoCompraDTO) {
                for (AnexoDTO listaAnexo : compraDTO.getListaAnexos()) {
                    String base64 = Base64.getEncoder().encodeToString(listaAnexo.getConteudo());
                    System.out.println(base64);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
