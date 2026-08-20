package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a média do aluno:");
		double media = leia.nextDouble();

        if(media >= 7.0){

        System.out.println("Aluno Aprovado!!");
        }

        else {
            System.out.println("---------");
        }
	}

}