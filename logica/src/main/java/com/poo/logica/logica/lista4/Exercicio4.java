package com.poo.logica.logica.lista4;
import java.util.Scanner;

public class Exercicio4 {
    /*4) Escreva um código que irá percorrer uma lista de números inteiros
        lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 } e irá contar a quantidade de
        números pares presente nela. */

        public static void resolucao(){
            Scanner leia = new Scanner(System.in);

            int lista[] = {3,5,6,7,8,10,22,55,110};
            int conta_Par = 0;

            for (int numeroPar : lista) {
                if (numeroPar % 2 == 0 ){
                conta_Par++;
                }
            }
            System.out.println("\n\n\n");
            System.out.println("A lista possui "+conta_Par+" números pares.");
            System.out.println("\n\n\n");

            leia.close();
        }

}