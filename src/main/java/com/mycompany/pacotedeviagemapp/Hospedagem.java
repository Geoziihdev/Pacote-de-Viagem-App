package com.mycompany.pacotedeviagemapp;

public class Hospedagem {
    private String tipo;
    private double precoPorNoite;

    public Hospedagem(String tipo, double precoPorNoite) {
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }
}
