package Lista2Scanner;

import java.util.Scanner;

public class Exercicio14 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Está chovendo? (true/false): ");
        boolean chovendo = leia.nextBoolean();

        System.out.print("Tem guarda-chuva? (true/false): ");
        boolean guardaChuva = leia.nextBoolean();

        System.out.print("Tem carro disponível? (true/false): ");
        boolean carroDisponivel = leia.nextBoolean();
        
        System.out.println("chovendo && guardaChuva                    : " + (chovendo && guardaChuva));
        System.out.println("guardaChuva || carroDisponivel             : " + (guardaChuva || carroDisponivel));
        System.out.println("!chovendo                                  : " + (!chovendo));
        System.out.println("chovendo && (guardaChuva || carroDisponivel): " + (chovendo && (guardaChuva || carroDisponivel)));
        System.out.println("!(chovendo && guardaChuva)                 : " + (!(chovendo && guardaChuva)));
        
    }

