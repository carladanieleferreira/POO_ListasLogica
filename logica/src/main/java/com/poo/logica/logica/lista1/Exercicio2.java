package com.poo.logica.logica.lista1;

import java.util.Scanner;

public class Exercicio2 {

    /*Escreva um programa que pergunte o nome e o
sobrenome do usuário e escreva na tela: "Olá, -usuário-". */

    public static void resolucao(){

        String usuario;
        String sobrenome;

        System.out.println("Digite o nome do usuario: ");
        Scanner leia = new Scanner(System.in); 
        usuario = leia.nextLine();

        System.out.println("Digite o sobrenome do usuario: ");
        sobrenome = leia.nextLine();

        System.out.println("Olá " +usuario+sobrenome);

        leia.close();
    }
}

