package exercicios_lacos_repeticao;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int num = 1;
        int soma = 0;
		
		while(num <= 100)
        {
            soma += num;

            System.out.println("A soma é igual a: "+soma);
            num++;
        }

	}

}