package com.example.demo;

import java.util.Base64;

public class AnexoDTO {

    private String nomeAnexo;
    private String url;
    private boolean privado;
    private byte[] conteudo;

    public String getNomeAnexo() {
        return nomeAnexo;
    }

    public void setNomeAnexo(String nomeAnexo) {
        this.nomeAnexo = nomeAnexo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public byte[] getConteudo() {
        return conteudo;
    }

    public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudoBase64() {
        if(this.conteudo.length>0){
            return Base64.getEncoder().encodeToString(getConteudo());
        }
        return null;
    }
}
