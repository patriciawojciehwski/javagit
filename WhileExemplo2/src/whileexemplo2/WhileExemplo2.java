
package whileexemplo2;

import java.util.Scanner;

public class WhileExemplo2 {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int contador1, contador2;
         
         System.out.println("--Contagem de um número até outro--");
         System.out.println("O primeiro número deve ser menor que o segundo");
         System.out.println("Digite um número inicial:");
         contador1 = input.nextInt();
         System.out.println("Digite um número final");
         contador2 = input.nextInt();
         
         if(contador1 <= contador2){
         while (contador1 <= contador2) {      
             System.out.println("Numero " + contador1);
             contador1++;
         }
         }else
         {
             System.out.println("Segundo número menor que o primeiro!");
    }
    }
    
}
