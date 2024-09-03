package com.poo.logica.logica.lista2;

import java.util.Scanner;

public class Exercicio5 {

    public static void resolucao(){

/*Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
algum deles estiver errado o programa deve retornar ao usuário quais das opções
está errada, se é o login ou a senha.
 */

        Scanner leia = new Scanner(System.in);

    
            String LOGIN_CORRETO = "carladanieleferreira";
            String SENHA_CORRETA = "281807";

    
        System.out.print("Digite seu login: ");
        String login = leia.nextLine();

    
        System.out.print("Digite sua senha: ");
        String senha = leia.nextLine();

        
        if (!login.equals(LOGIN_CORRETO) && !senha.equals(SENHA_CORRETA)) {
        System.out.println("Login e senha incorretos.");
        } else if (!login.equals(LOGIN_CORRETO)) {
        System.out.println("Login incorreto.");
        } else if (!senha.equals(SENHA_CORRETA)) {
        System.out.println("Senha incorreta.");
        } else {
        System.out.println("Login realizado com sucesso!");
        }

        leia.close();
    }
}