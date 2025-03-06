package com.example.demo;

import java.util.Date;

public class LoteProdutoDTO {

    private String codigoLote;
    private Date dataValidade;
    private String descMarcaFabricante;
    private String quantidadeEntrada;

    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDescMarcaFabricante() {
        return descMarcaFabricante;
    }

    public void setDescMarcaFabricante(String descMarcaFabricante) {
        this.descMarcaFabricante = descMarcaFabricante;
    }

    public String getQuantidadeEntrada() {
        return quantidadeEntrada;
    }

    public void setQuantidadeEntrada(String quantidadeEntrada) {
        this.quantidadeEntrada = quantidadeEntrada;
    }
}
