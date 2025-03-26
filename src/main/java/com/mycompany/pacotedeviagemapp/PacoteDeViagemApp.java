package com.mycompany.pacotedeviagemapp;

import java.util.Scanner;

public class PacoteDeViagemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        System.out.print("Digite o destino da viagem: ");
        String destino = scanner.nextLine();

        System.out.print("Digite o tipo de transporte (Aéreo, Rodoviário, etc.): ");
        String tipoTransporte = scanner.nextLine();
        System.out.print("Digite o preço do transporte: ");
        double precoTransporte = scanner.nextDouble();

        System.out.print("Digite o tipo de hospedagem: ");
        scanner.nextLine(); // Consumir a quebra de linha
        String tipoHospedagem = scanner.nextLine();
        System.out.print("Digite o preço por noite da hospedagem: ");
        double precoNoite = scanner.nextDouble();

        System.out.print("Digite a quantidade de dias da hospedagem: ");
        int dias = scanner.nextInt();

        System.out.print("Digite a margem de lucro (em %): ");
        double margemLucro = scanner.nextDouble();

        System.out.print("Digite o valor das taxas adicionais: ");
        double taxaAdicional = scanner.nextDouble();

        // Criando os objetos
        Transporte transporte = new Transporte(tipoTransporte, precoTransporte);
        Hospedagem hospedagem = new Hospedagem(tipoHospedagem, precoNoite);
        PacoteViagem pacote = new PacoteViagem(transporte, hospedagem, destino, dias);

        // Calculando valores
        double totalHospedagem = pacote.calcularTotalHospedagem();
        double totalPacote = pacote.calcularTotalPacote(margemLucro, taxaAdicional);

        // Exibindo os detalhes do pacote
        System.out.println("\n--- Detalhes do Pacote de Viagem ---");
        System.out.println("Destino: " + pacote.getDestino());
        System.out.println("Tipo de transporte: " + transporte.getTipo());
        System.out.println("Preço do transporte: " + transporte.getPreco());
        System.out.println("Tipo de hospedagem: " + hospedagem.getTipo());
        System.out.println("Preço por noite: " + hospedagem.getPrecoPorNoite());
        System.out.println("Total de hospedagem: " + totalHospedagem);
        System.out.println("Total do pacote (dólar): " + totalPacote);

        // Registro da venda
        System.out.print("\nDigite o nome do cliente: ");
        scanner.nextLine(); // Consumir a quebra de linha
        String cliente = scanner.nextLine();
        
        System.out.print("Digite a forma de pagamento: ");
        String formaPagamento = scanner.nextLine();

        System.out.print("Digite a cotação atual do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        Venda venda = new Venda(cliente, formaPagamento, pacote);
        double totalReais = venda.converterParaReais(cotacaoDolar);

        // Exibindo os detalhes da venda
        System.out.println("\n--- Detalhes da Venda ---");
        System.out.println("Cliente: " + venda.getCliente());
        System.out.println("Forma de pagamento: " + venda.getFormaPagamento());
        System.out.println("Valor total do pacote em dólar: " + totalPacote);
        System.out.println("Valor total do pacote em reais: " + totalReais);

        scanner.close();
    }
}
