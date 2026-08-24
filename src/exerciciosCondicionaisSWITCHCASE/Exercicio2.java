package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

       System.out.println("Informe o primeiro número:");
	   int n1 = leia.nextInt();

       System.out.println("Informe o segundo número:");
	   int n2 = leia.nextInt();

        System.out.println("O que você deseja fazer (1-Soma  2-Subtração  3-Multiplicação  4-Divisão):");
	   int op = leia.nextInt();



	   switch(op){
		case 1:
            double soma = n1+n2;
			System.out.println(n1+" + "+n2+" = "+soma);
			break;

			case 2:
			double menos = n1-n2;
			System.out.println(n1+" - "+n2+" = "+menos);
			break;

			case 3:
			double mult = n1*n2;
			System.out.println(n1+" X "+n2+" = "+mult);
			break;

			case 4:
			double div = n1/n2;
			System.out.println(n1+" / "+n2+" = "+div);
			break;

			default:
			System.out.println("Operação Inválida!");
			break;

            
	   }
	}

}