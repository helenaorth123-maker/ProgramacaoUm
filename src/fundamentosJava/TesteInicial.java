package fundamentosJava;

/*Classe de texte para demosntrar a soma de dois valores inteiros
 * 
 * @autor Helena
 * @version 1.0.0
 */

public class TesteInicial {
	
	/*
	 * Método que calcula a soma de dois valores inteiros
	 * @par numA primeiro valor da soma
	 * @par numB segundo valor da soma
	 * return resultado da soma
	 */
	
	public int somar (int numA, int numB) {
		return numA + numB;
	}
	
	/*
	 * Método principal da aplicação
	 * @param argumento de entrada da aplicação
	 */
	
	public static void main(String[] args) {
		
		TesteInicial resultado = new TesteInicial();	
		
		System.out.println(resultado.somar(2, 6));

	}

}
