package com.poo.logica.logica.lista1;

import java.util.Scanner;

public class Exercicio4 {

    /*Construa um algoritmo que leia um número inteiro na tela e
responda o número antecessor e o sucessor*/

    public static void resolucao() {

        int num ;
 
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número: ");
        num = leia.nextInt();

        System.out.println("O número antecessor de "+num+" é: "+(num-1)+ " e o número sucessor é :"+(num+1));  
        leia.close();  
    }
}