package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

      System.out.println("Escolha a sala (1 - Sala 1 2 - Sala 2): ");
        int sala = leia.nextInt();

        System.out.println("Escolha o código do filme (1, 2 ou 3): ");
        int filme = leia.nextInt();

        switch (sala) {
            case 1: 
                switch (filme) {
                    case 1:
                        System.out.println("Sala 1 Filme: Aventura");
                        break;
                    case 2:
                        System.out.println("Sala 1 Filme: Comédia");
                        break;
                    case 3:
                        System.out.println("Sala 1 Filme: Ficção Científica");
                        break;
                    default:
                        System.out.println("Código de filme inválido para a Sala 1.");
                        break;
                }
                break;

            case 2: 
                switch (filme) {
                    case 1:
                        System.out.println("Sala 2 Filme: Terror");
                        break;
                    case 2:
                        System.out.println("Sala 2 Filme: Romance");
                        break;
                    case 3:
                        System.out.println("Sala 2 Filme: Animação");
                        break;
                    default:
                        System.out.println("Código de filme inválido para a Sala 2.");
                        break;
                }
                break;

            default:
                System.out.println("Sala inválida.");
                break;
        }
	}

}

