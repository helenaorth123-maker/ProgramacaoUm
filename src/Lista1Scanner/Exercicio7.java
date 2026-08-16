package Lista1Scanner;

import java.util.Scanner;

public class Exercicio7 {
    
    Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double sal = leia.nextDouble();

        int salInt = (int) sal;

        double salConv= salInt;

        System.out.println("Salário original: " + sal);
        System.out.println("Parte inteira: " + salInt);
        System.out.println("Convertido novamente: " + salConv);

}
