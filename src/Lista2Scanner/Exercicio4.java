package Lista2Scanner;

import java.util.Scanner;

public class Exercicio4 {

    Scanner leia = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leia.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = leia.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = leia.nextDouble();

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média final obtida: " + media);
    
}
