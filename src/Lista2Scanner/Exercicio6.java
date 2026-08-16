package Lista2Scanner;

import java.util.Scanner;

public class Exercicio6 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite a distância em quilômetros (km): ");
        double km = leia.nextDouble();

        double metros = km * 1000;

        System.out.println("Distância em metros: " + metros + " m");
    
}
