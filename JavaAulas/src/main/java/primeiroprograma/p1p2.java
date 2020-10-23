package primeiroprograma;

import java.util.Scanner;

public class p1p2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota de p1: ");
        float p1 = teclado.nextFloat();
        System.out.println("Digite a nota de p2: ");
        float p2 = teclado.nextFloat();

        float media = (p1 + p2) / 2;

        if (media >= 6) {
            System.out.println("Aluno aprovado diretamente.");
        }

        else if (media >= 2 && media < 6) {
            System.out.println("informe o valor da p3: ");
            float p3 = teclado.nextFloat();
            float novamedia = (media + p3) / 2;
            if (novamedia >= 6) {
                System.out.println("Aluno aprovado na p3.");
            } else {
                System.out.println("Aluno reprovado na p3.");
            }
        }

        else {
            System.out.println("Aluno reprovado diretamente.");

        }
        teclado.close();
    }

}
