package com.poo.logica.logica.lista2;

import java.util.Scanner;

public class Exercicio4 {

    /* Um cliente que promove eventos e solicitou um programa que seja capaz de
identificar se uma pessoa é maior de idade. Pessoas com menos de 16 anos não
podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos
responsáveis. Maiores de 18 podem entrar normalmente.
*/

    public static void resolucao(){

        Scanner leia = new Scanner(System.in);

        // Solicita a idade do usuário

        int idade;

        System.out.print("Digite a sua idade: ");
        idade = leia.nextInt();

        // Verifica as condições de entrada no evento

        if (idade < 16) {
        System.out.println("Entrada proibida. Motivo: Menor de 16 anos ");
        } else if (idade >= 16 && idade < 18) {
        System.out.println("Entrada permitida somente acompanhado pelos responsáveis.");
        } else {
        System.out.println("Entrada permitida. Aproveite o evento!");
        }

        leia.close();
    }

}