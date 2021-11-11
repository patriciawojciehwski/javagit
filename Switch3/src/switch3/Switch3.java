
package switch3;

import java.util.Scanner;

public class Switch3 {
   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
     int mes;
        System.out.println("Digite o numero corespondente ao mês:");
        mes = input.nextInt();
        switch (mes){
        
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            default:
                System.out.println("Mês inválido");
                        
        }
    }
    
}
