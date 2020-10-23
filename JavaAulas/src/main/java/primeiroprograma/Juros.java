package primeiroprograma;

import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
 
        float capital, montante, juros, prazo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor a investir ");
        capital = teclado.nextInt();
        System.out.println("Qual a taxa de juros em %? ");
        juros = teclado.nextInt();
        System.out.println("Por quantos meses irá manter?");
          prazo = teclado.nextInt();
          montante = (float) (capital * Math.pow((1 + juros / 100), prazo));

          System.out.println("Investindo R$" + capital + " Você resgatará R$ " + montante + " após " + prazo + "meses");
  
          teclado.close();
      }
    
}
