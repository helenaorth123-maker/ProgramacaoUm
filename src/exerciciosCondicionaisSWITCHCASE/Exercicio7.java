package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

       System.out.println("Escolha o setor (1 - Bebidas 2 - Lanches): ");
        int setor = leia.nextInt();

        System.out.println("Escolha o código do produto (1, 2 ou 3): ");
        int produto = leia.nextInt();

        switch (setor) {
            case 1: 
                switch (produto) {
                    case 1:
                        System.out.println("Setor: Bebidas  Item: Água");
                        break;
                    case 2:
                        System.out.println("Setor: Bebidas Item: Refrigerante");
                        break;
                    case 3:
                        System.out.println("Setor: Bebidas Item: Suco");
                        break;
                    default:
                        System.out.println("Produto inválido para o setor de Bebidas.");
                        break;
                }
                break;

            case 2: 
                switch (produto) {
                    case 1:
                        System.out.println("Setor: Lanches  Item: Cachorro-quente");
                        break;
                    case 2:
                        System.out.println("Setor: Lanches  Item: Hambúrguer");
                        break;
                    case 3:
                        System.out.println("Setor: Lanches  Item: Pizza");
                        break;
                    default:
                        System.out.println("Produto inválido para o setor de Lanches.");
                        break;
                }
                break;

            default:
                System.out.println("Setor inválido.");
                break;
        }
	}

}

