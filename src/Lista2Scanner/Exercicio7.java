package Lista2Scanner;

import java.util.Scanner;

public class Exercicio7 {

    Scanner leia = new Scanner(System.in);

        System.out.print("Digite a nota inicial: ");
        double nota = leia.nextDouble();

        int notaInt = (int) nota;

        double notaD = (double) notaInt;

        System.out.println("Valor inicial indicado: " + nota);
        System.out.println("Valor convertido em int (parte inteira): " + notaInt);
        System.out.println("Valor convertido novamente em double: " + notaD);

}
