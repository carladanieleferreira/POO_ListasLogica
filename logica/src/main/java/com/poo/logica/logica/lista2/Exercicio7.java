package com.poo.logica.logica.lista2;
import java.util.Scanner;

public class Exercicio7 {

    public static void resolucao(){


        /*Escreva um programa Identificador de Divisibilidade, isto é, que identifique se
um determinado número informado pelo usuário é divisível por X (Que também
deve ser informado pelo usuário) */

        Scanner leia = new Scanner(System.in);

        int numero , divisor ;

        System.out.print("Digite um número: ");
        numero= leia.nextInt();

        System.out.print("Digite o divisor (OBS:O número zero é proibido) : ");
        divisor = leia.nextInt();

        if (divisor == 0) {
        System.out.println("Erro: Não é possível dividir por zero.");
        } else {
        
        if (numero % divisor == 0) {
        System.out.println(numero + " é divisível por " + divisor + ".");
        } else {
        System.out.println(numero + " não é divisível por " + divisor + ".");
        }
        }

        leia.close();
    }

}