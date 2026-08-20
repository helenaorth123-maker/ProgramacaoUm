package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a média:");
		double media = leia.nextDouble();

        System.out.println("Informe a frequência:");
		int freq = leia.nextInt();

        if(media >= 7 && freq >= 75){

        System.out.println("Aluno Aprovado");

        else if(media >= 9.5){
            System.out.println("Aluno Aprovado com mérito");
        }
        }
        else{
            System.out.println("Aluno Reprovado");
            }
        }
	}
