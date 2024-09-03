package com.poo.logica.logica.lista1;

import java.util.Scanner;

public class Exercicio6 {

    /*Construa um algoritmo que leia 1- a distância percorrida
por um veículo em km 2- o total gasto em combustível em
litros. No final deverá ser respondido o consumo médio deste
veículo em km/l. */

    public static void resolucao(){

        float distancia_percorrida, gasolina ;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida em Quilometros(km): ");
        distancia_percorrida = leia.nextFloat();

        System.out.println("Digite o total gasto de combustível em Litros: ");
        gasolina = leia.nextFloat();

        System.out.println("O consumo médio em (Km/l) foi: "+ (distancia_percorrida/gasolina));

        leia.close();

    }

}
