package com.poo.logica.logica.lista3;

import java.util.Scanner;

import java.io.Console; 

public class Exercicio5 {

/*5) Crie um algoritmo que receba login e senha e verifique as credenciais. Caso
algum deles estiver errado o programa deve retornar ao usuário quais das
opções está errada, se é o login ou a senha. O programa deve bloquear o
acesso após 3 tentativas erradas. Quando for a última tentativa ele deve emitir
um alerta: "Última tentativa, mais um erro seu acesso será bloqueado!"*/

        public static void resolucao() {
            
                Scanner leia = new Scanner(System.in);

                Console console = System.console(); 

                String cad_login; 
                String cad_senha;
                int chances = 3;

                System.out.println(">>>>>>>Criando uma nova conta<<<<<<<");

                System.out.println("Login: ");
                cad_login = leia.nextLine();

                System.out.println("Senha: ");
                cad_senha = leia.nextLine();

                System.out.println("Seja bem-vindo!");

                boolean loginCorreto = false;

                while (!loginCorreto) {
                
                String login, senha;

                System.out.println("Login: ");
                login = leia.nextLine();

                System.out.println("Senha: ");
                char [] senhaArray2 = console.readPassword();
                senha = new String(senhaArray2);

                if (cad_login.equals(login) && cad_senha.equals(senha)) {
                        System.out.println("Login realizado com sucesso.");
                        loginCorreto = true;

                } else if (!cad_login.equals(login)){
                        System.out.println("O login informado não está correto, tente novamente.");
                        chances--;

                } else if (!cad_senha.equals(senha)){
                        System.out.println("A senha informada não está correta, tente novamente.");
                        chances--;

                        }if(chances ==1){
                        System.out.println("Última tentativa! Mais um erro e seu acesso será bloqueado!");
                        }else{
                        }if(chances == 0){
                        System.out.println("Seu acesso foi bloqueado.");
                        break;
                        }else{
                        }
                leia.close();        
                }
        }
}