package com.poo.logica.logica.lista4;


import java.util.Scanner;

public class Exercicio2 {
    /*2) Agora que voce sabe o fechamento do dia, monte um código que
        identifique a compra de menor valor e a compra de maior valor*/

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
    
            double maior = vendas[0];
            double menor = vendas[0];
        
            for (double venda : vendas) {
                soma += venda;    
                if (venda > maior) {
                    maior = venda;
                }
                if (venda < menor) {
                    menor = venda;
                }
            }
        
            System.out.println("O total das vendas foi: R$" + soma);
            System.out.println("O maior valor de venda foi: R$" + maior);
            System.out.println("O menor valor de venda foi: R$" + menor);
            System.out.println("Fechamento encerrado!");
        
            leia.close();
        }
    }