
package idade;

import java.util.Scanner;

public class Idade {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double idade, var1, var2, var3;
    int anos, meses, dias;
    
     System.out.println("Digite sua idade em anos?");
     anos = input.nextInt();
     
     var1 = anos * 365;
     
     System.out.println("Digite sua idade em meses?");
     meses = input.nextInt();
     
     var2 = meses * 12;
     
     System.out.println("Digite sua idade em dias?");
     dias = input.nextInt();
    
     var3 = dias * 30;
    
     idade = var1 + var2 + var3;
        System.out.println("Sua idade em dias é " +idade);
             }
    
}
