package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

       System.out.println("Informe uma letra de A a E(minúsculo):");
	   char letra = leia.nextInt();

	   switch(letra){
		case a:
			System.out.println("A-Excelente!");
			break;

			case b:
			System.out.println("B-Bom!");
			break;

			case c:
			System.out.println("C-Regular!");
			break;

			case d:
			System.out.println("D-Insuficiente!");
			break;

			case e:
			System.out.println("E-Reprovado!");
			break;

			default:
                System.out.println("Mês Inválido!");
	   }
	}

}
