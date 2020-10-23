package primeiroprograma;

import java.util.Scanner;

public class PesquisaCidade {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!"); 
       float alunosPG, alunosSV, alunosStos, alunosMong, entrevistados;
       Scanner teclado = new Scanner(System.in);
         System.out.println("Insira a quantidade de alunos em Praia Grande:");
         alunosPG = teclado.nextInt();
         System.out.println("Insira a quantidade de alunos em São Vicente:");
         alunosSV = teclado.nextInt();
         System.out.println("Insira a quantidade de alunos em Santos:");
         alunosStos = teclado.nextInt();
         System.out.println("Insira a quantidade de alunos em Mongaguá:");
         alunosMong = teclado.nextInt();

        entrevistados = alunosPG + alunosSV + alunosStos + alunosMong;
        System.out.println("O total de alunos entrevistados é de " + entrevistados + " alunos. ");
        
        System.out.println(String.format("Praia Grande possui %.2f %% dos entrevistados",(alunosPG/entrevistados*100)));
        System.out.println(String.format("São Vicente possui %.2f %% dos entrevistados",(alunosSV/entrevistados*100)));
        System.out.println(String.format("Santos possui %.2f %% dos entrevistados",(alunosStos/entrevistados*100)));
        System.out.println(String.format("Santos possui %.2f %% dos entrevistados",(alunosMong/entrevistados*100)));
        
        
         teclado.close();
         
     }
}
