package primeiroprograma;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {

       
      Scanner teclado = new Scanner(System.in);
      // configura o objeto Scanner para fazer leitura de dados do usuário
      
        
       System.out.println("Escolha o primeiro número ");
        int num1 = teclado.nextInt();
        
        System.out.println("Escolha o segundo número ");
        int num2 = teclado.nextInt();
        System.out.println("A soma de " + num1 + " com " + num2 + "é " + (num1+num2));
         System.out.println("A subtração de " + num1 + " com " + num2 + "é " + (num1-num2));
           System.out.println("A multiplicação de " + num1 + " com " + num2 + "é " + (num1*num2));
           System.out.println("A divisão de " + num1 + " com " + num2 + "é " + (num1/num2));
        teclado.close();
    }   

    }