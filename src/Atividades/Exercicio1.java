package Atividades;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = leia.next();
		
		System.out.println("Informe sua idade:");
		int idade = leia.nextInt();
		
		System.out.println("Informe sua altura:");
		double alt = leia.nextDouble();
		
		System.out.println("Informe seu peso:");
		double peso = leia.nextDouble();
		
		
		System.out.println("Informe seu sexo (1-feminino  2-masculino):");
		int sexo = leia.nextInt();
		
		System.out.println("Informe sua situasção de matrícula(Ativa ou Inativa):");
		String mat = leia.next();
		
		System.out.println("Olá "+nome+" você tem "+idade+" anos, "+alt+" metros de altura, seu peso é "+peso+" kg, seu sexo é categoria "+sexo+" e sua matrícula está "+mat);
		
		
		
		

	}

}
