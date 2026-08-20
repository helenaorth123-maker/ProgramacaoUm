package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe uma nota de 0 a 100:");
		int num = leia.nextInt();

        if(num >= 90){

        System.out.println("Excelente!");
        }

        else if(num >= 70){

        System.out.println("Bom!");
        }

        else if (num >= 50){

        System.out.println("Regular!");
        }

        else{
            System.out.println("Insuficiente!");
        }
	}

}