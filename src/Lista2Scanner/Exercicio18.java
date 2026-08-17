package Lista2Scanner;

import java.util.Scanner;

public class Exercicio18 {

    Scanner leia = new Scanner(System.in);

     System.out.print("Digite a média do aluno: ");
        double media = leia.nextDouble();

        String status = (media >= 7.0) ? "Aprovado" : "Reprovado";

        System.out.println("Média informada: " + media);
        System.out.println("Status final: " + status);
}
