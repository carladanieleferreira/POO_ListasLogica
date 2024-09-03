package com.poo.logica.logica.lista2;

import java.util.Scanner;

public class Exercicio6 {

    public static void resolucao(){

        /*Crie um programa que receba as notas de um aluno e informe se ele foi
aprovado ou reprovado. Se o aluno ficar com média acima de 6 nas 2 primeiras
provas ele passou. Senão o programa deverá perguntar a nota de recuperação
que irá substituir a menor nota. A pergunta de recuperação deverá aparecer
somente para os alunos que precisarem. */

        Scanner leia = new Scanner(System.in);

        // Solicita as duas notas do aluno

        double nota1 , nota2, media ;

        System.out.print("Digite a primeira nota: ");
        nota1 = leia.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = leia.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 6) {
        System.out.println("Aprovado com média: " + media);
        } else {
        double notaRecuperacao;

        System.out.println("Média insuficiente: " + media);
        System.out.print("Digite a nota de recuperação: ");
        notaRecuperacao = leia.nextDouble();

        if (nota1 < nota2) { nota1 = notaRecuperacao;
        } else {nota2 = notaRecuperacao;}

        media = (nota1 + nota2) / 2;

        if (media >= 6) {
        System.out.println("Aprovado após recuperação com média: " + media);
        } else {
        System.out.println("Reprovado mesmo após recuperação com média: " + media);
        }
        }

        leia.close();
    }
}