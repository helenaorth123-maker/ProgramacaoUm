package Lista1Scanner;

import java.util.Scanner;

public class Exercicio4 {
    
    Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno:");
		String aluno = leia.next();
		
		
		System.out.println("Informe a primeira nota:");
		double n1 = leia.nextDouble();
		
		System.out.println("Informe a segunda nota:");
		double n2 = leia.nextDouble();
		
		double media = (n1+n2)/2;
		
		System.out.println("Aluno: "+aluno);
		System.out.println("Nota 1: "+n1);
		System.out.println("Nota 2: "+n2);
		System.out.printf("Média: %.2f", media);
}
