package com.poo.logica.logica.lista1;

import java.util.Scanner;

public class Exercicio8 {

    public static void resolucao(){

        /* Suponha que voce trabalhe em um laboratório e seu colega mediu a temperatura de um objeto em Fahrenheit.
        Escreva um programa capaz de converter em Celsius.*/

        Scanner leia = new Scanner(System.in);

    double Fahrenheit, Celsius;

    System.out.println("Digite a temperatura em Fahrenheit: ");
    Fahrenheit = leia.nextDouble();

    Celsius  = (Fahrenheit-32) / 1.8;

    System.out.println("A temperatura em Celsius é: "+(Celsius));

    leia.close();
    }
}