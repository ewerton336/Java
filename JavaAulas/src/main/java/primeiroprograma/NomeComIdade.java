package primeiroprograma;

import java.util.Scanner;

public class NomeComIdade {
    public static void main(String[] args) {

        int idade;
        String nome;
      Scanner teclado = new Scanner(System.in);
      // configura o objeto Scanner para fazer leitura de dados do usuário
      
        System.out.println("Qual o seu nome?");
        nome = teclado.nextLine();
        System.out.println("Qual a sua idade?");
        idade = teclado.nextInt();
        System.out.println("Olá, " + nome + ", Você tem " + idade + " anos.");

        teclado.close();
    }   

    }
