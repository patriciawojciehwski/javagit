
package exemplodowhile;

import java.util.Scanner;

public class ExemploDoWhile {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int opcao = 0;
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Iniciar jogo");
            System.out.println("2 - Ajuda");
            System.out.println("3 - Sair");
            System.out.println("Opção: ");
            opcao=input.nextInt();
            }while (opcao != 3);
    }
    
}
