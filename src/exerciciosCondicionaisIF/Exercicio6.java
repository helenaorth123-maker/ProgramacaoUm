package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		int num = leia.nextInt();

        if(num % 2 == 0){

        System.out.println("Número Par!");
        }

        else {
            System.out.println("Número Ímpar!");
        }
	}

}