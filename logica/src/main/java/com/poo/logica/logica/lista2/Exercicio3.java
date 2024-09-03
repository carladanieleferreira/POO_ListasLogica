package com.poo.logica.logica.lista2;

import java.util.Scanner;

public class Exercicio3 {

    public static void resolucao(){

        Scanner leia = new Scanner(System.in);

        /*Um banco contratou você para que escreva um programa que será utilizado pelo usuário em um tablet. O programa irá fazer 3 perguntas e encaminhar o
        cliente para 2 filas. A fila comum e a fila preferencial. Se o cliente atender a uma das condições a seguir ele deve ser encaminhado para a fila preferencial. As
        condições são: Ter mais de 65 anos, se deficiente ou gestante.*/

        int idade;
        char deficiente, gestante;

        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        
        System.out.print("Você é deficiente? (s/n): ");
        deficiente = leia.next().toLowerCase().charAt(0);

        
        System.out.print("Você é gestante? (s/n): ");
        gestante = leia.next().toLowerCase().charAt(0);

        
        if (idade > 65 || deficiente == 's' || gestante == 's') {
        System.out.println("Você deve se dirigir à fila preferencial.");
        } else {
        System.out.println("Você deve se dirigir à fila comum.");
        }

        leia.close();
    }
}