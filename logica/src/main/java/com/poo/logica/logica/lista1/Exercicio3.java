package com.poo.logica.logica.lista1;

import java.util.Scanner;

public class Exercicio3 {

    public static void resolucao(){

        /*Escreva uma calculadora que receba um valor em reais e
        converta para dólar. Considere o valor do dólar a R$5,25.*/
        
        double valor_em_real;
        double conversao;

        System.out.print("Digite o valor(em reais) a ser convertido em dólar: "); 	
        Scanner leia = new Scanner(System.in); 			
        valor_em_real = leia.nextDouble(); 
        conversao = (valor_em_real * 5.25);

        System.out.print("O valor convertido em dólar é: " + conversao);
        leia.close();

    }

}
