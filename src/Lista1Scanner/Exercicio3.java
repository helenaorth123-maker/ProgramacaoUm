package Lista1Scanner;

import java.util.Scanner;

public class Exercicio3 {
    
    Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int n1 = leia.nextInt();
		
		System.out.println("Informe o segundo número:");
		int n2 = leia.nextInt();
		
		int soma = n1+n2;
		int sub = n1-n2;
		int mult = n1*n2;
		double div = n1/n2;
		double res = n1%n2;
		
		System.out.println("Soma= "+soma);
		System.out.println("Subtração= "+sub);
		System.out.println("Multiplicação= "+mult);
		System.out.println("Divisão= "+div);
		System.out.println("Resto da Divisão= "+res);
}
