
package primeiroprograma;


import java.util.Scanner;


public class IdadeComAno {
    public static void main(String[] args) {
        int ano1;
        int anoatual = 2020;
        
      
                
        Scanner teclado = new Scanner(System.in);
         System.out.println("Digite seu ano de nascimento: ");
        ano1 = teclado.nextInt();
        
        int resultado = (anoatual - ano1);
        System.out.println("Sua idade é " + resultado + " anos.");

        teclado.close();
        
    }
        
}