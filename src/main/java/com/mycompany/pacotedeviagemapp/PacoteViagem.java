package com.mycompany.pacotedeviagemapp;

public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int dias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int dias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.dias = dias;
    }

    public String getDestino() {
        return destino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public double calcularTotalHospedagem() {
        return hospedagem.getPrecoPorNoite() * dias;
    }

    public double calcularTotalPacote(double margemLucro, double taxaAdicional) {
        double totalBase = transporte.getPreco() + calcularTotalHospedagem();
        double lucro = totalBase * (margemLucro / 100);
        return totalBase + lucro + taxaAdicional;
    }
}
