
package médiaprovas;

import java.util.Scanner;

public class MédiaProvas {

        public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         double media, nota1, nota2, nota3;
         
          System.out.println("Qual a sua nota1?");
          nota1 = input.nextDouble();
          
          System.out.println("Qual a sua nota2?");
          nota2 = input.nextDouble();
          
          System.out.println("Qual a sua nota3?");
          nota3 = input.nextDouble();
         
          media = (nota1 + nota2 + nota3)/3; 
            System.out.println("A média das três notas é: " + media);
        
        if(media>=6){
            System.out.println("Você está aprovado");
        }
        else //quando for só if e else não precisa colocar a condição no else// 
                {
            System.out.println("Você está reprovado");
        }     
        
                
    }
}
