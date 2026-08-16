package Lista2Scanner;

import java.util.Scanner;

public class Exercicio1 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o nome do aluno: ");
        String nome = leia.nextLine();

        System.out.print("Digite a idade: ");
        int idade = leia.nextInt();

        System.out.print("Digite o curso: ");
        String curso = leia.nextLine();

        System.out.print("Digite a altura: ");
        double altura = leia.nextDouble();

        System.out.print("Digite a média final: ");
        double media = leia.nextDouble();

        System.out.print("Está matriculado? (true/false): ");
        boolean mat = leia.nextBoolean();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Curso: " + curso);
        System.out.println("Altura: " + altura + "m");
        System.out.println("Média Final: " + media);
        System.out.println("Está Matriculado: " + mat);
    
}
