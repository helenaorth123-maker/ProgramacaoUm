package Lista1Scanner;

import java.util.Scanner;

public class Exercicio11 {

    Scanner leia = new scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = leia.nextLine();

        System.out.print("Digite a nota do aluno (0 a 10): ");
        int nota = leia.nextInt();

        System.out.print("Digite a frequência do aluno (0 a 100): ");
        int frequencia = leia.nextInt();

        String situacao = (nota >= 6 && frequencia >= 75) ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Resultado: " + situacao);
    
}
