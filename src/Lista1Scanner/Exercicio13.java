package Lista1Scanner;

import java.util.Scanner;

public class Exercicio13 {

    Scanner leia = new Scanner(System.in);

        System.out.print("Digite a temperatura atual: ");
        double temp = leia.nextDouble();

        String sit = (temperatura > 25) ? "Dia quente" : "Dia agradável";

        System.out.println("\n- Temperatura: " + temp + "°C");
        System.out.println("- Situação: " + sit);
    

}
