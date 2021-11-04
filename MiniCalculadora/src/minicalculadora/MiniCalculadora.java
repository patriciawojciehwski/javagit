
package minicalculadora;

import java.util.Scanner;

public class MiniCalculadora {
    
    public static void main(String[] args) {
   // declarando as variáveis 
   
   Scanner input = new Scanner(System.in);
       //Biblioteca que irá permitir a interação do usuário
        double num1, num2;
        double soma, sub, multi, divi;
        
        //Solicitar ao usuário os dois números
        System.out.println("Mini Calculadora");
        System.out.println("Digite um número:");
        
        num1 = input.nextDouble();
        
        System.out.println("Digite outro número:");
        num2 = input.nextDouble();
        
        //Especificar o que cada variável faz//
        
        soma = num1 + num2;
        sub = num1 - num2;
        multi = num1 * num2;
        divi = num1/num2;
        
        //Imprimir na tela os resultados//
                
          System.out.println("A soma dos números " + num1 + " e " + num2 + " é. " +soma);     
          System.out.println("A sub dos números " + num1 + " e " + num2 + " é. " +sub);
          System.out.println("A multi dos números " + num1 + " e " + num2 + " é. " +multi);
          System.out.println("A divi dos números " + num1 + " e " + num2 + " é. " +divi);
                
    }
    
}
