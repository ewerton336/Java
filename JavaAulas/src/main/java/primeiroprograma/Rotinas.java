package primeiroprograma;

import java.util.Scanner;



public class Rotinas {

    
    public static void main(String[] args) {


       
      Scanner teclado = new Scanner(System.in);
      // configura o objeto Scanner para fazer leitura de dados do usuário
     
      System.out.println("Programa para cálculo de operações aritméticas");
      float v1 = recebeDados("Informe o primeiro valor: ");
      float v2 = recebeDados("Informe o segundo valor: ");
      float soma = somar(v1,v2);
      float subtr = subtrair (v1, v2);
      float mult = multiplicar (v1, v2);
      float div = dividir (v1, v2);
      exibirMensagem("Adição: " + soma);
      exibirMensagem("Subtração: " + subtr);
      exibirMensagem("Multiplicação: " + mult);
      exibirMensagem("Divisão: " + div);



      teclado.close();
    
    }   

    public static void exibirMensagem(String msg) {
        System.out.println(msg);
    }
   
    public static float somar(float valor1, float valor2) {
        float resultado;
        resultado = valor1 + valor2;
        return resultado;
    }

    public static float subtrair (float valor1, float valor2) {
        return valor1 - valor2;
            
    }

    public static float multiplicar (float valor1, float valor2) {
        return valor1 * valor2;
    }

    public static float dividir (float valor1, float valor2) {
        return valor1 / valor2;
    }

    public static float recebeDados(String msg) {
        float valorRecebido;    
        Scanner leitor = new Scanner(System.in);
       System.out.print(msg);
       valorRecebido = leitor.nextFloat();
       return valorRecebido;
    }


    }
    