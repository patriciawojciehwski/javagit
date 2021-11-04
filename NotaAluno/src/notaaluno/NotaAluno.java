
package notaaluno;

import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        String aluno;
        System.out.println("Digite seu nome: ");
        aluno = input.nextLine();
        
        Double nota1, nota2, nota3;
        double media;
        System.out.println("Digite a nota 1: ");
        nota1 = input.nextDouble(); 
        
        System.out.println("Digite a nota 2: ");
        nota2 = input.nextDouble(); 
        
        System.out.println("Digite a nota 3: ");
        nota3 = input.nextDouble(); 
        
        media = (nota1 + nota2 + nota3)/3;
                
        System.out.println("Sua média foi: " + media);
    }
    
    
}
