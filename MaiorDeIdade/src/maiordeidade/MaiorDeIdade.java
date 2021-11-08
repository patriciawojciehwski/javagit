
package maiordeidade;

import java.util.Scanner;

public class MaiorDeIdade {
   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
               
        System.out.println("Qual é a sua idade?");
        int idade = input.nextInt();
        
        if(idade>=18){
            System.out.println("Você é maior de idade");
        }
        else if(idade<0){
            System.out.println("Idade inválida");
        }
        else {
            System.out.println("Você é menor de idade");
        }
         
    }
    
}
