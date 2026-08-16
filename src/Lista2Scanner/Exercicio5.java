package Lista2Scanner;

import java.util.Scanner;

public class Exercicio5 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite a temperatura em Celsius (°C): ");
        double c = leia.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + f + "°F");
}
