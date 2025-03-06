package com.example.demo;

import java.util.Date;

public class ProfissionalDTO {

    private String codProfissionalSolicitante;
    private String nome;
    private String nomeConselho;
    private String siglaConselho;
    private String numeroConselho;
    private String nomeEspecialidade;
    private String descricaoEspecialidade;
    private String usuarioCriacao;
    private Date dataCriacao;
    private String usuarioAlteracao;
    private Date dataAlteracao;

    public String getCodProfissionalSolicitante() {
        return codProfissionalSolicitante;
    }

    public void setCodProfissionalSolicitante(String codProfissionalSolicitante) {
        this.codProfissionalSolicitante = codProfissionalSolicitante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeConselho() {
        return nomeConselho;
    }

    public void setNomeConselho(String nomeConselho) {
        this.nomeConselho = nomeConselho;
    }

    public String getSiglaConselho() {
        return siglaConselho;
    }

    public void setSiglaConselho(String siglaConselho) {
        this.siglaConselho = siglaConselho;
    }

    public String getNumeroConselho() {
        return numeroConselho;
    }

    public void setNumeroConselho(String numeroConselho) {
        this.numeroConselho = numeroConselho;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    public String getDescricaoEspecialidade() {
        return descricaoEspecialidade;
    }

    public void setDescricaoEspecialidade(String descricaoEspecialidade) {
        this.descricaoEspecialidade = descricaoEspecialidade;
    }

    public String getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public void setUsuarioCriacao(String usuarioCriacao) {
        this.usuarioCriacao = usuarioCriacao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getUsuarioAlteracao() {
        return usuarioAlteracao;
    }

    public void setUsuarioAlteracao(String usuarioAlteracao) {
        this.usuarioAlteracao = usuarioAlteracao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

}
