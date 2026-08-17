package Lista2Scanner;

import java.util.Scanner;

public class Exercicio21 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o nome do funcionário: ");
        String nome = leia.nextLine();

        System.out.print("Digite o salário base: ");
        double sal = leia.nextDouble();

        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        int horas = leia.nextInt();

        double valorH = horas * 35.0;
        double salF = sal + valorH;

        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + sal);
        System.out.println("Valor das horas extras: R$ " + valorH);
        System.out.println("Salário final: R$ " + salF);
    
}
