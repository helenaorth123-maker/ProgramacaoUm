package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		int num = leia.nextInt();

        if(num % 5 == 0){

        System.out.println("O número é múltiplo de 5!!");
        }

        else {
            System.out.println("---------");
        }
	}

}