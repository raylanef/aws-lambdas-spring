package com.aws.lambda;

public class Contrato {
    private String id;
    private double valor;

    public Contrato(String id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public Contrato() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
