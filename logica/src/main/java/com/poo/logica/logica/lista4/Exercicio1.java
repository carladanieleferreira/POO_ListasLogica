package com.poo.logica.logica.lista4;

import java.util.Scanner;

public class Exercicio1 {
    /*1) Voce é gerente de um supermercado e sabe que os valores das
        vendas do dia são gravados em um vetor. Digite um código que faça o
        fechamento (soma) de vendas do dia de maneira automatizada. */

    public static void resolucao() {

        int numero_vendas;
        double soma = 0;
        double[] vendas;
        Scanner leia = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao sistema de vendas!\n");

        System.out.println("Por favor digite quantas vendas foram realizadas hoje: ");
        numero_vendas = leia.nextInt();

        vendas = new double[numero_vendas];

        for (int i = 0 ; i < numero_vendas ; i++) {
            System.out.print("Digite o valor da " + (i+1) + "° venda" + ": ");
            vendas[i] = leia.nextDouble();
            
        }
            for (double venda : vendas) {
            soma += venda;    
            }
        System.out.print("\nO total das vendas foi: R$" + soma+ "\n\n");

        System.out.println("Fechamento encerrado!");
        leia.close();
    }
}