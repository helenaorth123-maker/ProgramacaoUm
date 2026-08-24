package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

     System.out.println("Escolha a categoria (1 - Informática 2 - Telefonia): ");
        int cat = leia.nextInt();
     
     System.out.println("Escolha o código do produto (1, 2 ou 3): ");
        int produto = leia.nextInt();

        switch (cat) {
            case 1: 
                switch (produto) {
                    case 1:
                        System.out.println("Categoria: Informática Produto: Notebook");
                        break;
                    case 2:
                        System.out.println("Categoria: Informática Produto: Mouse");
                        break;
                    case 3:
                        System.out.println("Categoria: Informática Produto: Teclado");
                        break;
                    default:
                        System.out.println("Produto inválido para a categoria Informática.");
                        break;
                }
                break;

            case 2: 
                switch (produto) {
                    case 1:
                        System.out.println("Categoria: Telefonia Produto: Smartphone");
                        break;
                    case 2:
                        System.out.println("Categoria: Telefonia Produto: Carregador");
                        break;
                    case 3:
                        System.out.println("Categoria: Telefonia Produto: Fone de ouvido");
                        break;
                    default:
                        System.out.println("Produto inválido para a categoria Telefonia.");
                        break;
                }
                break;

            default:
                System.out.println("Categoria inválida.");
                break;
        }
	}

}


