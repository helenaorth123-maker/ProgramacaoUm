package exerciciosCondicionaisSWITCHCASE;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

       System.out.println("Informe o código(de 1 a 5):");
	   int cod = leia.nextInt();

	   switch(cod){
		case 1:
			System.out.println("1-Cachorro-Quente!");
			break;

			case 2:
			System.out.println("2-Hambúrguer!");
			break;

			case 3:
			System.out.println("3-Pizza!");
			break;

			case 4:
			System.out.println("4-Refrigerente!");
			break;

			case 5:
			System.out.println("5-Suco!");
			break;

			default:
                System.out.println("Produto Inválido!");
	   }
	}

} 
    
