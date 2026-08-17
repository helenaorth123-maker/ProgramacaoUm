package Lista2Scanner;

import java.util.Scanner;

public class Exercicio15 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o nome do produto: ");
        String produto = leia.nextLine();

        System.out.print("Digite o preço do produto (R$): ");
        double preco = leia.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int estoque = leia.nextInt();

        System.out.println("Produto: " + produto);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque + " unidades");
    
}
