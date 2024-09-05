package com.poo.logica.logica.lista3;

import java.util.Scanner;

public class Exercicio7 {

    public static void resolucao(){
    
/* Escreva um programa que seja capaz de desenhar um retangulo */

        int largura;
        int altura;
        
        System.out.println("Digite a Altura desejada para o retângulo: ");
        Scanner leia = new Scanner(System.in);
        altura = leia.nextInt();

        System.out.println("Digite a Largura desejada para o retângulo: ");
        largura = leia.nextInt();
        
        for (int j = 0; j < altura; j++) {
            for (int i = 0; i < largura; i++) {
                System.out.print("*");
            }  
            System.out.println();
        }
        leia.close();
    }
    
    }