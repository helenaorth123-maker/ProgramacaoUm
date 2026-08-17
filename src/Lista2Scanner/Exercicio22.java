package Lista2Scanner;

import java.util.Scanner;

public class Exercicio22 {

    Scanner leia = new Scanner(System.in);

     System.out.print("Digite o nome do produto: ");
        String nome = leia.nextLine();

        System.out.print("Digite o valor unitário do produto: ");
        double valor = leia.nextDouble();

        System.out.print("Digite a quantidade de produtos comprados: ");
        int quant = leia.nextInt();

        System.out.print("Digite a quantidade de parcelas: ");
        int parcelas = leia.nextInt();

        double valorTotal = valor * quant;
        double valorPar = valorTotal / parcelas;

        System.out.println("Nome do produto: " + nome);
        System.out.println("Valor unitário do produto: R$ " + valor);
        System.out.println("Quantidade de produtos comprados: " + quant);
        System.out.println("Valor total da compra: R$ " + valorTotal);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + valorPar);
    
}
