package primeiroprograma;


import java.util.Scanner;


public class CalculaNota {
    public static void main(final String[] args) {
      int p1;
      int p2;
      String nome;

      final Scanner teclado = new Scanner(System.in);
      System.out.println("Insira seu nome: ");
      nome = teclado.nextLine();

      System.out.println("Insira a nota de p1: ");
      p1 = teclado.nextInt();

      System.out.println("Insira a nota de p2: ");
      p2 = teclado.nextInt();

      final int media = ((p1 + p2) / 2);
        System.out.println(nome + "," + " sua nota média é " + media);

        teclado.close();
        
    }
        
}