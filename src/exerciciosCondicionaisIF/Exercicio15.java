package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu peso:");
		double peso = leia.nextDouble();

        System.out.println("Informe sua altura:");
		double alt = leia.nextDouble();

        double imc = peso / (altura*altura);

        if(imc > 18.5){

        System.out.println("Magreza/Abaixo do peso!");
        }

        else if(imc >= 24.9){

        System.out.println("Peso normal/Saudável!");
        }

        else if (imc >= 29.9){

        System.out.println("Sobrepeso(Pré-Obesidade)!");
        }

        else if (imc >= 34.9){
            System.out.println("Obesidade Grau I");
        }

        else if (imc >= 39.9){
            System.out.println("Obesidade Grau II");
        }

        else{
            System.out.println("Obesidade Grau III (Grave)");
        }
	}

}