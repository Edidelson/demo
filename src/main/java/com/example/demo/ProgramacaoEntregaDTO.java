package com.example.demo;

import java.util.Date;

public class ProgramacaoEntregaDTO {

    private Date data;
    private String quantidade;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}
