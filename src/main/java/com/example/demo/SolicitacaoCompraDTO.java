package com.example.demo;

import com.google.common.collect.Lists;

import java.util.List;

public class SolicitacaoCompraDTO {

    private String codigoSolicitacaoCompra;
    private String condicoes;
    private String dataHoraValidade;
    private String descMotivoSolic;
    private String identificador;
    private String observacao;
    private String operacao;
    private String titulo;
    private String codigoEstoque;
    private String compraUrgencia;
    private String setorSolicitante;
    private Long codigoEmpresa;
    private String numeroPregao;
    private String numeroProcesso;
    private String tipoOpme;
    private String descPaciente;
    private String custoOperacional;
    private String cnpjCustoOperacional;
    private String descMedico;
    private String cotacaoOpme;
    private Integer codigoTitularErp;
    private Integer categorizacaoErp;

    private List<AnexoDTO> listaAnexos = Lists.newArrayList();

    public String getCodigoSolicitacaoCompra() {
        return codigoSolicitacaoCompra;
    }

    public void setCodigoSolicitacaoCompra(String codigoSolicitacaoCompra) {
        this.codigoSolicitacaoCompra = codigoSolicitacaoCompra;
    }

    public String getCondicoes() {
        return condicoes;
    }

    public void setCondicoes(String condicoes) {
        this.condicoes = condicoes;
    }

    public String getDataHoraValidade() {
        return dataHoraValidade;
    }

    public void setDataHoraValidade(String dataHoraValidade) {
        this.dataHoraValidade = dataHoraValidade;
    }

    public String getDescMotivoSolic() {
        return descMotivoSolic;
    }

    public void setDescMotivoSolic(String descMotivoSolic) {
        this.descMotivoSolic = descMotivoSolic;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigoEstoque() {
        return codigoEstoque;
    }

    public void setCodigoEstoque(String codigoEstoque) {
        this.codigoEstoque = codigoEstoque;
    }

    public String getCompraUrgencia() {
        return compraUrgencia;
    }

    public void setCompraUrgencia(String compraUrgencia) {
        this.compraUrgencia = compraUrgencia;
    }

    public String getSetorSolicitante() {
        return setorSolicitante;
    }

    public void setSetorSolicitante(String setorSolicitante) {
        this.setorSolicitante = setorSolicitante;
    }

    public List<AnexoDTO> getListaAnexos() {
        return listaAnexos;
    }

    public void setListaAnexos(List<AnexoDTO> listaAnexos) {
        this.listaAnexos = listaAnexos;
    }

    public Long getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(Long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNumeroPregao() {
        return numeroPregao;
    }

    public void setNumeroPregao(String numeroPregao) {
        this.numeroPregao = numeroPregao;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getTipoOpme() {
        return tipoOpme;
    }

    public void setTipoOpme(String tipoOpme) {
        this.tipoOpme = tipoOpme;
    }

    public String getDescPaciente() {
        return descPaciente;
    }

    public void setDescPaciente(String descPaciente) {
        this.descPaciente = descPaciente;
    }

    public String getCustoOperacional() {
        return custoOperacional;
    }

    public void setCustoOperacional(String custoOperacional) {
        this.custoOperacional = custoOperacional;
    }

    public String getCnpjCustoOperacional() {
        return cnpjCustoOperacional;
    }

    public void setCnpjCustoOperacional(String cnpjCustoOperacional) {
        this.cnpjCustoOperacional = cnpjCustoOperacional;
    }

    public String getDescMedico() {
        return descMedico;
    }

    public void setDescMedico(String descMedico) {
        this.descMedico = descMedico;
    }

    public String getCotacaoOpme() {
        return cotacaoOpme;
    }

    public void setCotacaoOpme(String cotacaoOpme) {
        this.cotacaoOpme = cotacaoOpme;
    }

    public Integer getCodigoTitularErp() {
        return codigoTitularErp;
    }

    public void setCodigoTitularErp(Integer codigoTitularErp) {
        this.codigoTitularErp = codigoTitularErp;
    }

    public Integer getCategorizacaoErp() {
        return categorizacaoErp;
    }

    public void setCategorizacaoErp(Integer categorizacaoErp) {
        this.categorizacaoErp = categorizacaoErp;
    }

}
