package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int num1 = leia.nextInt();

        System.out.println("Informe o segundo número:");
		int num2 = leia.nextInt();

        if(num1 > num2){

        System.out.println("O primeiro número é maior!");
        }

        else {
            System.out.println("O segundo número é maior!");
        }
	}

}