package Lista2Scanner;

import java.util.Scanner;

public class Exercicio10 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o total de alunos: ");
        int total = leia.nextInt();

        System.out.print("Digite a quantidade de grupos: ");
        int grupos = leia.nextInt();

        int resultadoInt = total / grupos;

        double resultadoF = (double) total / grupos;

        System.out.println("Total de Alunos: " + total);
        System.out.println("Quantidade de Grupos: " + grupos);
        System.out.println("Divisão Inteira (Alunos por grupo): " + resultadoInt);
        System.out.println("Divisão Real com Casting: " + resultadoF);

     
}
