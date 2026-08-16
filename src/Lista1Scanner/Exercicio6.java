package Lista1Scanner;

import java.util.Scanner;

public class Exercicio6 {

    Scanner leia = new Scanner(System.in);
    
    System.out.print("Digite o valor em dólares: ");
        double dolar = leia.nextDouble();

        cotDolar = 5.62;

        double real = dolar * cotDolar;

        System.out.printf("O monitor custa %.2f reais\n", real);
}
