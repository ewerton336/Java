
package primeiroprograma;

import java.util.Scanner;


public class PrimeiroPrograma {
    public static void main(String[] args) {
       System.out.println("Olá Mundo!"); 
      String idade;
      Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        idade = teclado.nextLine();
        System.out.println("Você tem " + idade + " Anos");

        teclado.close();
    }
        
}