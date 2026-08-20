package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius:");
		int temp = leia.nextInt();

        if(temp >= 30){

        System.out.println("Está Calor");
        }

        else {
            System.out.println("A temperatura está agradavél");
        }
	}

}