package com.poo.logica.logica.lista1;

    import java.util.Scanner;

public class Exercicio1 {

    public static void resolucao() {

        int n1; 
        int n2; 
    
        System.out.print("Digite o primeiro numero: "); 	
        
        
        Scanner scannerLeia = new Scanner(System.in); 			
        n1 = scannerLeia.nextInt(); 							
    
        System.out.print("O primeiro número é: "+n1+"\n");
    
        System.out.println("Digite o segundo número: ");
        n2 = scannerLeia.nextInt();
    System.out.println("O segundo número é: "+n2);
    
        System.out.println("A soma é: "+(n1+n2));
        scannerLeia.close();
}

}

