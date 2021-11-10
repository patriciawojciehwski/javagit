
package projetolivre;

import java.util.Scanner;

public class ProjetoLivre {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       
        int numero;
      
        System.out.println("Insira um número inteiro");
        numero = input.nextInt();
        
        if(numero %2 == 0){
                                           
            System.out.println("PAR");
    }   
    
        else {
                                     
            System.out.println("IMPAR");
        }
        
    }
            
}

        
        

    
    


