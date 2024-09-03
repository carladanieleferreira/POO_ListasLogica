package com.poo.logica.logica.lista1;

import java.util.Scanner;

public class Exercicio7 {

    public static void resolucao(){

        /* Escreva um programa que receba quatro notas de um aluno e calcule a média aritmética dessas notas.*/

        String aluno;

        float nota_1, nota_2, nota_3,nota_4;

    System.out.println("Digite o nome do aluno: "); 
    Scanner leia = new Scanner(System.in); 
    aluno = leia.nextLine(); 

    System.out.println("Digite a nota 1: ");
    nota_1 = leia.nextFloat();

    System.out.println("Digite a nota 2: ");
    nota_2 = leia.nextFloat();

    System.out.println("Digite a nota 3: ");
    nota_3 = leia.nextFloat();

    System.out.println("Digite a nota 4: ");
    nota_4 = leia.nextFloat();

    System.out.println("Media do(a) aluno(a) "+ aluno + " é "+ ((nota_1+nota_2+nota_3+nota_4)/4));
    leia.close();

    }
}
