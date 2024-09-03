package com.poo.logica.logica.lista2;

import java.util.Scanner;

public class Exercicio2 {

    public static void resolucao(){

        /*Desenvolva um algoritmo que seja capaz de receber dois números digitados pelo usuário e diga qual deles é maior.*/

        Scanner leia = new Scanner(System.in);

        int numero1 , numero2 ;

        System.out.println("Digite o primeiro número");
        numero1 = leia.nextInt();

        System.out.println("Digite o segundo número");
        numero2 = leia.nextInt();

        if (numero1 >numero2) {
            System.out.println("O N° maior é : "+ numero1);
        } else {
            System.out.println("O N° maior é : "+ numero2);
        }

        leia.close();
    }
}