package Lista2Scanner;

import java.util.Scanner;

public class Exercicio20 {

    Scanner leia = new Scanner(System.in);

     System.out.print("Digite a idade: ");
        int idade = leia.nextInt();

        String tipoA = (idade >= 60) ? "Atendimento preferencial" : "Atendimento comum";

        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tipo de atendimento: " + tipoA);
    
}
