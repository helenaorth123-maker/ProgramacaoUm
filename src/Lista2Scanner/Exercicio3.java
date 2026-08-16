package Lista2Scanner;

import java.util.Scanner;

public class Exercicio3 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite a distância percorrida (km): ");
        double distancia = leia.nextDouble();

        System.out.print("Digite a quantidade de litros consumida: ");
        double litros = leia.nextDouble();

        double consumo = distancia / litros;
        double litro100 = 100 / consumo;

        System.out.println("Consumo médio: " + consumo + " km/l");
        System.out.println("Litros necessários para 100 km: " + litro100 + " L");

    
    
}
