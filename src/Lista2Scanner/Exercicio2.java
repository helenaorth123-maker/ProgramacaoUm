package Lista2Scanner;

public class Exercicio2 {
    
    System.out.print("Digite a marca do veículo: ");
        String marca = leia.nextLine();

        System.out.print("Digite o modelo do veículo: ");
        String modelo = leia.nextLine();

        System.out.print("Digite o ano de fabricação: ");
        int ano = leia.nextInt();

        System.out.print("Digite a cor do veículo: ");
        String cor = leia.nextLine();

        System.out.print("Digite o valor do veículo (R$): ");
        double valor = leia.nextDouble();

        System.out.print("O veículo é automático? (true/false): ");
        boolean aut = leia.nextBoolean();

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + valor);
        System.out.println("É Automático: " + aut);
    
}
