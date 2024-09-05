package com.poo.logica.logica.lista3;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao(){
        
        Scanner leia = new Scanner(System.in);

        /*6) Escreva um programa que seja capaz de 
        desenhar uma pirâmide de asteriscos.
        O usuário deverá informar quantos andares 
        ele deseja que a pirâmide tenha.*/

        int quantidade_andares;
        System.out.println("Informe o número de andares da pirâmide: ");
        quantidade_andares = leia.nextInt();
        
        System.out.print("\n");
        
        for (int i = 0; i < quantidade_andares; i++) {
            
            for (int j = quantidade_andares - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            
            //asteriscos
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }  
        leia.close();
    }
}