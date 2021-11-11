
package switchtimefutebol;

import java.util.Scanner;

public class SwitchTimeFutebol {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       String time,gremio,inter;
       
        System.out.println("Digite o time de futebol:");
         time = input.nextLine();
          switch (time){
         
           case "gremio":
                System.out.println("O ídolo é Renato Gaúcho");
                break;
            case "inter":
                System.out.println("O ídolo é Fernandão");
                break;
            default:
                System.out.println("Time inválido");
    }
    }
}
