package Lista1Scanner;

import java.util.Scanner;

public class Exercicio14 {

    Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = leia.nextLine();

        System.out.print("Digite o salário atual (R$): ");
        double sal = leia.nextDouble();

        System.out.print("Digite o tempo de empresa (em anos): ");
        int tempo = leia.nextInt();

        double bonus = (tempoEmpresa >= 5) ? 500.00 : 0.00;

        double salF = sal + bonus;

        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + sal);
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário Final: R$ " + salF);
    
}
