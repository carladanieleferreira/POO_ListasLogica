package com.poo.logica.logica.lista1;

import java.util.Scanner;

public class Exercicio5 {

    /*Construa um algoritmo que calcule o valor de um terreno
baseado na sua área e valor por m2.
Considerando a area = largura * comprimento

 */

    public static void resolucao(){

        double valor_metro_quadrado ;

        double largura , comprimento ;

        System.out.print("Digite o valor do metro Quadrado do terreno: "); 	
        Scanner leia = new Scanner(System.in);
        valor_metro_quadrado = leia.nextDouble();


        System.out.print("Digite a largura do terreno desejado: ");
    
        largura = leia.nextDouble();

        System.out.print("Digite o comprimento do terreno desejado: ");
    
        comprimento = leia.nextDouble();
        
        System.out.print("O valor do terreno é de R$: "+(largura*comprimento*valor_metro_quadrado)); 

        leia.close();
    }
}