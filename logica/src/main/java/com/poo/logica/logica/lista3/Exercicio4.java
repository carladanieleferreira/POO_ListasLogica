package com.poo.logica.logica.lista3;

import java.util.Scanner;

public class Exercicio4 {
/*Jogo da adivinhação. Peça para alguém escolher um número. Depois peça para outra pessoa tentar adivinhar.
 O programa deverá retornar dicas como: "Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio". */


public static void resolucao(){
    
    Scanner leia = new Scanner(System.in);

    System.out.println("EScreva o número a ser adivinhado: ");
    int certo = leia.nextInt();

    System.out.println("Convide alguém e bora começar a brincadeira!!");

    System.out.println("Então vamos lá . Tente adivinhar o número: ");
    int tentativa = leia.nextInt();

    boolean acertou = false;

    while (acertou == false ) { 
        
        if (tentativa > (certo + 100 ) || tentativa < (certo - 100 )){
            System.out.println("ihhhhh... tá muito longe quase lá no polo norte ... Tente novamente: ");
            
        }else if (tentativa > (certo + 50 ) || tentativa < (certo - 50 )){
            System.out.println("Bora lá ... tá Frio ...  Tente novamente: ");
            
        }else if (tentativa > (certo + 30 ) || tentativa < (certo - 30 )){
            System.out.println("Não desanima ... tá esquentando ..ficando morninho.  Tente novamente: ");
        }else if(tentativa > (certo + 20 ) || tentativa < (certo - 20 )){
            System.out.println("Não desista ... tá morno, quase lá...  Tente novamente: ");
        }else if(tentativa > (certo + 10 ) || tentativa < (certo - 10 )){
            System.out.println("Não foi dessa vez ainda ... porém tá quente ...  Tente novamente: ");
        }else if (tentativa >= (certo + 1 ) || tentativa <= (certo - 1 )){
            System.out.println("Te contar um segredo: você está fervendo... Tente novamente: ");
        }else if (tentativa == certo ){
            acertou = true ;
            System.out.println("Parabéns , você acertou o número correto que é :" + certo);
    }
        tentativa = leia.nextInt();

        }
    

    leia.close();
    }
}
