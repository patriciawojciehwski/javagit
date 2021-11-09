
package brasileiro;

import java.util.Scanner;

public class Brasileiro {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     String nome, pais;
        //if (pais == "Brasil") para
        // || quer dizer OU
        //&& quer dizer E
        
        System.out.println("Qual é o seu nome?");
        nome = input.nextLine();
        
        System.out.println("De qual País você é?");
        pais = input.nextLine();
        
        if(pais.equals("brasil")){
            System.out.println("Você é brasileiro");
        }
        else{
            System.out.println("Você é estrangeiro");     
             
    }
    }
}
