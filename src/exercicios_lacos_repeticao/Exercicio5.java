package exercicios_lacos_repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int tab = 1;
        int mult = 0;
		
		System.out.println("Informe um número para a tabuada:");
        int num = leia.nextInt();
		
		while(tab <= 10)
        {
            mult = num * tab;

            System.out.println(num+" X "+tab+" = "+mult);
            tab++;
        }

	}

}