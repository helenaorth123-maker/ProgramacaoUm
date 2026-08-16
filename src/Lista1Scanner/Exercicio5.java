package Lista1Scanner;

import java.util.Scanner;

public class Exercicio5 {
    
    Scanner leia= new Scanner(System.in);

        System.out.print("Digite o valor do arroz: ");
        double arroz = leia.nextDouble();

        System.out.print("Digite o valor do feijão: ");
        double feijao = leia.nextDouble();

        System.out.print("Digite o valor do óleo: ");
        double oleo = leia.nextDouble();

        double total = arroz + feijao + oleo;
        double media = total / 3;

        System.out.printf("Valor total da compra: R$ %.2f\n", total);
        System.out.printf("Valor médio dos produtos: R$ %.2f\n", media);

}
