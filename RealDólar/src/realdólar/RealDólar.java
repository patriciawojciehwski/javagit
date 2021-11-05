
package realdólar;

import java.util.Scanner;

public class RealDólar {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double dolar, real, cotação;
       
        
        System.out.println("Digite quantos dolares você tem: ");
        dolar = input.nextDouble();
         
        System.out.println("Digite a cotação do dolar hoje: ");
        cotação = input.nextDouble();
        
        real = dolar * cotação;
        
              
        System.out.println("Você tem R$ " + real);
        
    }
    
}
