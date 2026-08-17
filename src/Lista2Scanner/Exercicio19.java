package Lista2Scanner;

import java.util.Scanner;

public class Exercicio19 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o saldo da conta (R$): ");
        double saldo = leia.nextDouble();

        String situacao = (saldo > 0) ? "Saldo positivo" : "Saldo negativo";

        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Situação: " + situacao);
    
}
