
package primeiroprograma;

import java.util.Scanner;


public class SaibaSuaIdade {
    public static void main(String[] args) {
 
      int idade;
      Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        idade = teclado.nextInt();
        System.out.println("Você tem " + idade + " Anos.");

        teclado.close();
    }
        
}