package Lista2Scanner;

import java.util.Scanner;

public class Exercicio11 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o valor da temperatura: ");
        int temp = leia.nextInt();

        System.out.println("temperatura > 25  : " + (temp > 25));
        System.out.println("temperatura <= 30 : " + (temp <= 30));
        System.out.println("temperatura == 20 : " + (temp == 20));
        System.out.println("temperatura != 30 : " + (temp != 30));
    
}
