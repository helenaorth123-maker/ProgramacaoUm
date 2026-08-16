package Lista1Scanner;

import java.util.Scanner;

public class Exercicio8 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o primeiro número inteiro: ");
        int numA = leia.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numB = leia.nextInt();

        int divInt = numA / numB;

        double divF = (double) numA / numB;

        System.out.println("Divisão inteira: " + divInt);
        System.out.println("Divisão em ponto flutuante: " + divF);
    
}
