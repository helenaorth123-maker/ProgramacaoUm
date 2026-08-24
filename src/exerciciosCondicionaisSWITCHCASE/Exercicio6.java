package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

       System.out.println("Escolha o turno (1 - Manhã 2 - Tarde): ");
        int turno = leia.nextInt();

        System.out.println("Escolha o código da disciplina (1, 2 ou 3): ");
        int disciplina = leia.nextInt();

        switch (turno) {
            case 1: 
                switch (disciplina) {
                    case 1:
                        System.out.println("Turno: Manhã | Disciplina: Matemática");
                        break;
                    case 2:
                        System.out.println("Turno: Manhã | Disciplina: Português");
                        break;
                    case 3:
                        System.out.println("Turno: Manhã | Disciplina: Física");
                        break;
                    default:
                        System.out.println("Disciplina inválida para o turno da Manhã.");
                        break;
                }
                break;

            case 2: 
                switch (disciplina) {
                    case 1:
                        System.out.println("Turno: Tarde | Disciplina: História");
                        break;
                    case 2:
                        System.out.println("Turno: Tarde | Disciplina: Geografia");
                        break;
                    case 3:
                        System.out.println("Turno: Tarde | Disciplina: Biologia");
                        break;
                    default:
                        System.out.println("Disciplina inválida para o turno da Tarde.");
                        break;
                }
                break;

            default:
                System.out.println("Turno inválido.");
                break;
        }
	}

}
