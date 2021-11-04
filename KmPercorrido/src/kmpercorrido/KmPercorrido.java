
package kmpercorrido;

import java.util.Scanner;

public class KmPercorrido {
    
    public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);
         double kmInicial, kmFinal, kmTotal;
         double litros, consumo;
         
         System.out.println("Digite a Km inicial: ");
         kmInicial = input.nextDouble();
                 
         System.out.println("Digite a Km final: ");
         kmFinal = input.nextDouble();  
         
         kmTotal = kmFinal - kmInicial;
         System.out.println("Informe a quantidade de litros consumidos");
         litros = input.nextDouble();
         
         consumo = kmTotal / litros; 
         
         System.out.println("Você percorreu o total de " + kmTotal + "KM");
         System.out.println("A sua média é " + consumo);
         
    }
    
}
