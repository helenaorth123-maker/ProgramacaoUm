package Lista2Scanner;

import java.util.Scanner;

public class Exercicio9 {

     Scanner leia = new Scanner(System.in);

     System.out.print("Digite o valor de X (inteiro): ");
        int x = leia.nextInt();

        System.out.print("Digite o valor de Y (inteiro): ");
        int y = leia.nextInt();

        int divInt = x / y;

        double divF = (double) x / y;

        System.out.println("Valor de X: " + x);
        System.out.println("Valor de Y: " + y);
        System.out.println("Divisão Inteira: " + divInt);
        System.out.println("Divisão em Ponto Flutuante: " + divF);
    
}
