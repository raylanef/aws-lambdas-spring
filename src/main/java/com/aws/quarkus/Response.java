package com.aws.quarkus;

import java.util.List;

public class Response {
    private int statusCode;
    private String idCliente;
    private int totalContratos;
    private String idParcelaMaisBaixa;
    private String idParcelaMaisAlta;
    private List<Contrato> baixaPorParcela;
    private double desconto;
    private double saldoDevedorMensal;
    private double saldoFaltante;
    private int parcelasAbatidas;

    public Response(int statusCode, String idCliente, int totalContratos, String idParcelaMaisBaixa, String idParcelaMaisAlta, List<Contrato> baixaPorParcela, double desconto, double saldoDevedorMensal, double saldoFaltante, int parcelasAbatidas) {
        this.statusCode = statusCode;
        this.idCliente = idCliente;
        this.totalContratos = totalContratos;
        this.idParcelaMaisBaixa = idParcelaMaisBaixa;
        this.idParcelaMaisAlta = idParcelaMaisAlta;
        this.baixaPorParcela = baixaPorParcela;
        this.desconto = desconto;
        this.saldoDevedorMensal = saldoDevedorMensal;
        this.saldoFaltante = saldoFaltante;
        this.parcelasAbatidas = parcelasAbatidas;
    }

    public Response() {
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getTotalContratos() {
        return totalContratos;
    }

    public void setTotalContratos(int totalContratos) {
        this.totalContratos = totalContratos;
    }

    public String getIdParcelaMaisBaixa() {
        return idParcelaMaisBaixa;
    }

    public void setIdParcelaMaisBaixa(String idParcelaMaisBaixa) {
        this.idParcelaMaisBaixa = idParcelaMaisBaixa;
    }

    public String getIdParcelaMaisAlta() {
        return idParcelaMaisAlta;
    }

    public void setIdParcelaMaisAlta(String idParcelaMaisAlta) {
        this.idParcelaMaisAlta = idParcelaMaisAlta;
    }

    public List<Contrato> getBaixaPorParcela() {
        return baixaPorParcela;
    }

    public void setBaixaPorParcela(List<Contrato> baixaPorParcela) {
        this.baixaPorParcela = baixaPorParcela;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getSaldoDevedorMensal() {
        return saldoDevedorMensal;
    }

    public void setSaldoDevedorMensal(double saldoDevedorMensal) {
        this.saldoDevedorMensal = saldoDevedorMensal;
    }

    public double getSaldoFaltante() {
        return saldoFaltante;
    }

    public void setSaldoFaltante(double saldoFaltante) {
        this.saldoFaltante = saldoFaltante;
    }

    public int getParcelasAbatidas() {
        return parcelasAbatidas;
    }

    public void setParcelasAbatidas(int parcelasAbatidas) {
        this.parcelasAbatidas = parcelasAbatidas;
    }
}
