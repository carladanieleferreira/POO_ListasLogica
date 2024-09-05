package com.poo.logica.logica.lista3;

import java.util.Scanner;

public class Exercicio7 {

    public static void resolucao(){
    
/* Escreva um programa que seja capaz de desejar um retangulo */

int largura;
int altura;
Scanner leia = new Scanner(System.in);

System.out.println("Altura ");
altura = leia.nextInt();

System.out.println("Largura ");
largura = leia.nextInt();

for (int j = 0; j < altura; j++) {
    for (int i = 0; i < largura; i++) {
    System.out.println("*");
}
    System.out.println();
}
leia.close();
}

}
