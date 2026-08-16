package Lista1Scanner;

import java.util.Scanner;

public class Exercicio12 {

    Scanner leia = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = leia.nextInt();

        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println("Resultado: " + resultado);
    
}
