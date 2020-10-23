package primeiroprograma;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
 
        float salario, aumento, salarioFinal;
        Scanner teclado = new Scanner(System.in);
          System.out.println("Programa para cálculo do aumento do salário ");
          System.out.println("Informe seu salário atual: ");
          salario = teclado.nextInt();
          System.out.println("Quantos % de aumento você deseja? (minimo 4% maximo 15%): ");
          aumento = teclado.nextInt();
          if (aumento >= 4 && aumento <=15 ){
            salarioFinal = (1 + (aumento/100)) * salario;
            System.out.println(String.format("Seu salário será de R$ %.2f", salarioFinal));
          }
          else {
            System.out.println("Quis muito aumento e nao vai ter porra nenhuma de aumento.");
          }
          
          teclado.close();
      }


}
