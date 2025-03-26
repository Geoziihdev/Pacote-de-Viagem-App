package com.mycompany.pacotedeviagemapp;

public class Transporte {
    private String tipo;
    private double preco;

    public Transporte(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }
}
