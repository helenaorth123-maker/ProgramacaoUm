package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe sua idade:");
		int idade  = leia.nextInt();

        if(idade >= 60){

        System.out.println("Cliente tem direito de desconto!!");
        }

        else {
            System.out.println("---------");
        }
	}

}