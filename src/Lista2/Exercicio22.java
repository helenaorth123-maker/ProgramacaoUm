package Lista2;

public class Exercicio22 {
    
        String nome = "Notebook";
        double valorUn = 1250.00;
        int quant = 2;
        int parc = 5;

        double valorT = valorUn * quant;
        double valorP = valorT / parc;

        System.out.println("Nome do produto: " + nome);
        System.out.println("Valor unitário do produto: R$ " + valorUn);
        System.out.println("Quantidade de produtos comprados: " + quant);
        System.out.println("Valor total da compra: R$ " + valorT);
        System.out.println("Quantidade de parcelas: " + parc);
        System.out.println("Valor de cada parcela: R$ " + valorP);
}
