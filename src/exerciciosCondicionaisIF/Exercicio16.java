package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a média do aluno:");
		double media = leia.nextDouble();

        if(media >= 9.5){

        System.out.println("Aluno aprovado com distinção!");
        }

        else if(media >= 7){

        System.out.println("Aluno Aprovado!");
        }

        else{
             System.out.println("Aluno Reprovado!");
        }
	}

}