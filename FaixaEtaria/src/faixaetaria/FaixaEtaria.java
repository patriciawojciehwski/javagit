
package faixaetaria;

import java.util.Scanner;

public class FaixaEtaria {
  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String nome;
    int idade;
    
        System.out.println("Qual é o seu nome?");
        nome = input.nextLine();
        
        System.out.println("Qual é a sua idade?");
        idade = input.nextInt();
        
        if(idade<=17){
            System.out.println("Olá " +nome+ ".Você tem " +idade+  
                    " anos e é considerado jovem");    
       }
        else if(idade<=59){
            System.out.println("Olá " +nome+ ".Você tem " +idade+  
                    " anos e é considerado adulto");    
       }
        else if(idade<=100){
            System.out.println("Olá " +nome+ ".Você tem " +idade+  
                    " anos e é considerado idoso");    
        }
        else{
            System.out.println("Olá " +nome + " ,sua idade é inválida");    
       }
    }
    
}
