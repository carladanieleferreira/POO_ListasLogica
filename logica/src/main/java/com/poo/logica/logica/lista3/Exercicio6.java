package com.poo.logica.logica.lista3;

import java.util.Scanner;

public class Exercicio6 {
/* piramide  */


public static void resolucao(){
    Scanner leia = new Scanner(System.in);

    int quantidade_andares;
    System.out.println("Informe o número de andares da pirâmide: ");
    quantidade_andares = leia.nextInt();

    for (int i = 1 ; i <= quantidade_andares; i++) {
        for (int j = 0; j < quantidade_andares - i; j++) {
            System.out.println(" ");
            for (int j2 = 0; j2 < (2 * i - 1); j2++) {
                System.out.println("*"); 
            }
            System.out.println(); 
        }
        leia.close();        
    }





    leia.close();
}

}
