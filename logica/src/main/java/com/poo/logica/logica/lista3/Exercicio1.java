package com.poo.logica.logica.lista3;

import java.util.Scanner;

public class Exercicio1 {

    /*1) Escreva um programa que sirva como um cronômetro. O usuário deve
digitar um numero em segundos e o programa deve contabilizar os segundos
digitados. O programa deve receber somente números entre 1 e 59, do
contrário ele retornar um erro e solicitar que o usuário digite um número válido.
 */

    public static void resolucao(){

        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Digite o número pra iniciar o cronômetro (entre 1 e 59): ");
        numero= leia.nextInt();

        if((numero>= 60) ||(numero <=0) ){
        System.out.print("Erro. Digite um número válido  ");
        }else{
        for (int i =numero ; i > 0 ; i--) {
        System.out.println(i);
    }
        System.out.println("Programa encerrado");
        }
        
        leia.close();
        }
    }
