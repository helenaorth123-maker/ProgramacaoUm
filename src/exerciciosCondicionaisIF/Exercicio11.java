package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a média final do aluno:");
		double media = leia.nextDouble();

        if(media >= 9){

        System.out.println("A");
        }

        else if(media >= 7){

        System.out.println("B");
        }

        else if (media >= 5){

        System.out.println("C");
        }

        else{
            System.out.println("D");
        }
	}

}