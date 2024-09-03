package com.poo.logica.logica.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void resolucao(){

    /*) Escreva um programa que recebe um número digitado pelo usuário e responda se o número inserido é par ou ímpar ou 0 */

        Scanner leia = new Scanner(System.in);

        int numero, resto;

        System.out.println("Digite o número a ser avaliado: ");
        numero = leia.nextInt();

        resto = numero % 2 ;

        if (resto == 0){
        System.out.println("O número "+numero+ " é par!");
        }else{
        System.out.println("O número "+numero+ " é ímpar!");
        }
        leia.close();
    }
}