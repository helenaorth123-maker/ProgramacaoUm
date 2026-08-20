package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe sua idade:");
		int idade = leia.nextInt();

        if(idade >= 18){

        System.out.println("Maior de Idade");
        }

        else {
            System.out.println("Menor de Idade");
        }
	}

}