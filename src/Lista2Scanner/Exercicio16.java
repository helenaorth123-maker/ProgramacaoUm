package Lista2Scanner;

import java.util.Scanner;

public class Exercicio16 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o nome do funcionário: ");
        String nome = leia.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = leia.nextLine();

        System.out.print("Digite o salário (R$): ");
        double salario = leia.nextDouble();

        System.out.println("Funcionário: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    
}
