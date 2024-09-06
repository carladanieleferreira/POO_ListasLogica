package com.poo.logica.logica.lista4;

import java.util.Scanner;

public class Exercicio3 {
    /*3) Ainda utilizando o exercício do mercado, calcule o ticket médio de
        vendas do dia */
    public static void resolucao() {

        int numero_vendas;
        double soma = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao sistema de vendas!\n");

        System.out.println("Por favor digite quantas vendas foram realizadas hoje: ");
        numero_vendas = leia.nextInt();

        double[] vendas = new double[numero_vendas];

        for (int i = 0 ; i < numero_vendas ; i++) {
            System.out.print("Digite o valor da " + (i+1) + "° venda" + ": ");
            vendas[i] = leia.nextDouble();
            
        }
        for (double venda : vendas) {
            soma += venda;    
        }
        System.out.print("\nO total das vendas foi: R$" + soma+ "\n\n");

        double ticketMedio = (soma/numero_vendas);

        System.out.println("O ticket médio de vendas do dia foi: R$"+ticketMedio);

        System.out.println("Fechamento encerrado!");
        leia.close();
    }
}
