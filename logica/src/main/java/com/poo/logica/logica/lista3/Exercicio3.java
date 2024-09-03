package com.poo.logica.logica.lista3;

import java.util.Scanner;

public class Exercicio3 {

    /* Escreva um código que receba dois números inteiros e escreva todos os
números pares entre eles.
 */
public static void resolucao(){

Scanner leia = new Scanner(System.in);

int numero1 ;
int numero2;

System.out.print("Digite o primeiro número:");
numero1= leia.nextInt();

System.out.print("Digite o segundo número:");
numero2= leia.nextInt();

int maior =0;
int menor =0; 

if (numero1 < numero2){
    maior = numero2;
    menor = numero1;
}
if (numero2 < numero1){
maior = numero1;
menor = numero2;
}


for (int i= menor ; i <= maior; i ++) {
       int  resto ;
       resto = menor % 2;
        if (resto == 0){
            System.out.print(+menor+"-");
            
        }
        menor = menor + 1;
    } 
leia.close();

}


}



