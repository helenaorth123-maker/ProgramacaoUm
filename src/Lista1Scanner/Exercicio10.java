package Lista1Scanner;

import java.util.Scanner;

public class Exercicio10 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o nome do aluno: ");
        String nome = leia.nextLine();

        System.out.print("Digite o nome do curso: ");
        String curso = leia.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = leia.nextInt();

        System.out.println("==============================");
        System.out.println("Aluno: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("==============================");

}
