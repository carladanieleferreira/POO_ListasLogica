package com.poo.logica.logica.lista2;
import java.util.Scanner;

public class Exercicio8 {

    public static void resolucao(){

        /*Crie um joguinho de perguntas e respostas múltipla escolha. O programa
deverá fazer 5 perguntas (Uma por vez). Se ele errar 3 vezes ele perde o jogo. Se
o usuário chegar até o final o programa deve exibir o número de acertos. */

        Scanner leia = new Scanner(System.in);

        int erros = 0; 
        int acertos = 0; 

        
        String[] perguntas = {
        "1. Qual é a capital do Brasil?\n(a) Santarem \n(b) Rio de Janeiro\n(c) São Paulo \n(d) Brasilia",
        "2. Quanto é 2 + 2?\n(a) 3\n(b) 4\n(c) 5\n(d) 6",
        "3. Qual é o maior planeta do sistema solar?\n(a) Terra\n(b) Marte\n(c) Júpiter\n(d) Saturno",
        "4. Quem canta seus males ?\n(a) Ganha\n(b) Espanta\n(c) Brinca\n(d) Espanca",
        "5. Qual é a cor da pedra esmeralda?\n(a) Branca\n(b) Rosa\n(c) Verde\n(d) Prata"
        };


        char[] respostasCorretas = {'d', 'b', 'c', 'b', 'c'};

        // Itera sobre as perguntas
        for (int i = 0; i < perguntas.length; i++) {
        System.out.println(perguntas[i]);
        System.out.print("Sua resposta: ");
        char resposta = leia.next().toLowerCase().charAt(0);

        // Verifica se a resposta está correta
        if (resposta == respostasCorretas[i]) {
        System.out.println("Resposta correta!\n");
        acertos++;
        } else {
        System.out.println("Resposta incorreta.\n");
        erros++;
        }

        if (erros == 3) {
        System.out.println("Você errou 3 vezes. Fim de jogo!");
        break;
        }
        }

        if (erros < 3) {
        System.out.println("Você terminou o jogo com " + acertos + " acertos!");
        }

        leia.close();

    }


}