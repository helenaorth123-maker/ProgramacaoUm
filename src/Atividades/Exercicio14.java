package Atividades;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome = "LenaDani";
		double sal = 3000;
		int anos = 7;
		
		double bonus = (anos >= 5) ? 500.0 : 0.0;
		
		double salF = sal + bonus;
		
		System.out.println("Nome: "+nome);
		System.out.println("Salário: "+sal);
		System.out.println("Bônus: "+bonus);
		System.out.println("Salário Final: "+salF);
		
		
	}

}
