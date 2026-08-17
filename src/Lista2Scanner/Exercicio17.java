package Lista2Scanner;

import java.util.Scanner;

public class Exercicio17 {

    Scanner leia = new Scanner(System.in);

     System.out.print("Digite a quantidade atual em estoque: ");
        int estoque = leia.nextInt();

        String situacao = (estoque < 5) ? "Estoque baixo" : "Estoque suficiente";

        System.out.println("Quantidade digitada: " + estoque);
        System.out.println("Situação do estoque: " + situacao);
    
}
