package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

     System.out.println("Escolha o curso (1 - Informática  2 - Administração  3 - Engenharia): ");
        int curso = leia.nextInt();

        
        System.out.println("Escolha o código da disciplina (1, 2 ou 3): ");
        int disciplina = leia.nextInt();

       
        switch (curso) {
            case 1: 
                switch (disciplina) {
                    case 1:
                        System.out.println("Curso: Informática Disciplina: Programação");
                        break;
                    case 2:
                        System.out.println("Curso: Informática Disciplina: Banco de Dados");
                        break;
                    case 3:
                        System.out.println("Curso: Informática Disciplina: Redes");
                        break;
                    default:
                        System.out.println("Erro: Disciplina inválida para o curso de Informática.");
                        break;
                }
                break;

            case 2: 
                switch (disciplina) {
                    case 1:
                        System.out.println("Curso: Administração Disciplina: Marketing");
                        break;
                    case 2:
                        System.out.println("Curso: Administração Disciplina: Economia");
                        break;
                    case 3:
                        System.out.println("Curso: Administração Disciplina: Contabilidade");
                        break;
                    default:
                        System.out.println("Erro: Disciplina inválida para o curso de Administração.");
                        break;
                }
                break;

            case 3: 
                switch (disciplina) {
                    case 1:
                        System.out.println("Curso: Engenharia Disciplina: Cálculo");
                        break;
                    case 2:
                        System.out.println("Curso: Engenharia Disciplina: Física");
                        break;
                    case 3:
                        System.out.println("Curso: Engenharia Disciplina: Desenho Técnico");
                        break;
                    default:
                        System.out.println("Erro: Disciplina inválida para o curso de Engenharia.");
                        break;
                }
                break;

            default:
                System.out.println("Erro: Curso inválido.");
                break;
        }
	}

}



