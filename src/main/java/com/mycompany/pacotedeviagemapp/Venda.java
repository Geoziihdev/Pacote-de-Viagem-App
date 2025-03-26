package com.mycompany.pacotedeviagemapp;

public class Venda {
    private String cliente;
    private String formaPagamento;
    private PacoteViagem pacote;

    public Venda(String cliente, String formaPagamento, PacoteViagem pacote) {
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public double converterParaReais(double cotacaoDolar) {
        return pacote.calcularTotalPacote(0, 0) * cotacaoDolar;
    }
}
