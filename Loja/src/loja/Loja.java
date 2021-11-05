
package loja;

import java.util.Scanner;

public class Loja {

        public static void main(String[] args) {
        
             Scanner input = new Scanner(System.in);
             int prestacoes = 5;
             double produto, valorPrestacao;
             
            System.out.println("Valor do produto: ");
            produto = input.nextDouble();
            
            valorPrestacao = produto / prestacoes; 
            
            System.out.println("O valor da prestacao é R$ " + valorPrestacao);
    }
    
}
