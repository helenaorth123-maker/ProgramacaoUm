package Lista1Scanner;

import java.util.Scanner;

public class Exercicio2 {
    
    Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o nome do produto:");
		String nome = leia.next();
		
		System.out.println("Informe o código do produto");
		int cod = leia.nextInt();
		
		System.out.println("Informe o preço do produto:");
		double preco = leia.nextDouble();
		
		System.out.println("Informe a quantidade em estoque:");
		int quant = leia.nextInt();
		
		
		System.out.println("Produto: "+nome);
		System.out.println("Código: "+cod);
		System.out.println("Preço: "+preco);
		System.out.println("Quantidade em estoque: "+quant);
}
