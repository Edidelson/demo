package com.example.demo;

import java.util.Date;

public class PacienteDTO {

    private String codigoBeneficiario;
    private boolean custoOperacional;
    private Date dataAlteracao;
    private Date dataCriacao;
    private Date dataNascimento;
    private Long id;
    private String nome;
    private String razaoSocial;
    private boolean regulamentacaoIntercambio;
    private String usuarioAlteracao;
    private String usuarioCriacao;
    private String codigoPaciente;

    public String getCodigoBeneficiario() {
        return codigoBeneficiario;
    }

    public void setCodigoBeneficiario(String codigoBeneficiario) {
        this.codigoBeneficiario = codigoBeneficiario;
    }

    public boolean isCustoOperacional() {
        return custoOperacional;
    }

    public void setCustoOperacional(boolean custoOperacional) {
        this.custoOperacional = custoOperacional;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public boolean isRegulamentacaoIntercambio() {
        return regulamentacaoIntercambio;
    }

    public void setRegulamentacaoIntercambio(boolean regulamentacaoIntercambio) {
        this.regulamentacaoIntercambio = regulamentacaoIntercambio;
    }

    public String getUsuarioAlteracao() {
        return usuarioAlteracao;
    }

    public void setUsuarioAlteracao(String usuarioAlteracao) {
        this.usuarioAlteracao = usuarioAlteracao;
    }

    public String getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public void setUsuarioCriacao(String usuarioCriacao) {
        this.usuarioCriacao = usuarioCriacao;
    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    @Override
    public String toString() {
        return "PacienteDTO{" +
            "codigoBeneficiario='" + codigoBeneficiario + '\'' +
            ", custoOperacional=" + custoOperacional +
            ", dataAlteracao=" + dataAlteracao +
            ", dataCriacao=" + dataCriacao +
            ", dataNascimento=" + dataNascimento +
            ", id=" + id +
            ", nome='" + nome + '\'' +
            ", razaoSocial='" + razaoSocial + '\'' +
            ", regulamentacaoIntercambio=" + regulamentacaoIntercambio +
            ", usuarioAlteracao='" + usuarioAlteracao + '\'' +
            ", usuarioCriacao='" + usuarioCriacao + '\'' +
            ", codigoPaciente='" + codigoPaciente + '\'' +
            '}';
    }
}
