package Lista2Scanner;

import java.util.Scanner;

public class Exercicio8 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite a temperatura inicial: ");
        double temp = leia.nextDouble();

        int tempInt = (int) temp;

        double tempD = (double) tempInt;

        System.out.println("Temperatura inicial indicada: " + temp + "°C");
        System.out.println("Valor convertido em int: " + tempInt + "°C");
        System.out.println("Valor convertido novamente em double: " + tempD + "°C");
    
}
