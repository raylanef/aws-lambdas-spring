package com.aws.quarkus;

import java.util.List;

public class Request {
    private String idCliente;
    private List<Contrato> contratos;
    private double desconto;

    public Request(String idCliente, List<Contrato> contratos, double desconto) {
        this.idCliente = idCliente;
        this.contratos = contratos;
        this.desconto = desconto;
    }

    public Request() {
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
