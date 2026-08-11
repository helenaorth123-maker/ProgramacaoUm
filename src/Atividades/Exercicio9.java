package Atividades;

public class Exercicio9 {

	public static void main(String[] args) {
		
		boolean possuiIngresso = true;
		boolean possuiDocumento = false;
		boolean acompanhanteMaior = true;
		
		//possuiIngresso && possuiDocumento 
		System.out.println("False!");//pois a pessoa precisa ter os dois para ser verdadeiro
		
		//possuiIngresso || possuiDocumento
		System.out.println("True!"); // pois a pessoa precisa ter um dos dois
		
		//!possuiDocumento
		System.out.println("True!"); // pois é diferente
		
		//possuiIngresso && (possuiDocumento || acompanhanteMaior)
		System.out.println("True!"); // pois a pessoa precisa ter ingresso E possuir documento OU ter um acompanhante Maior
		
		//!(possuiIngresso && possuiDocumento)
		System.out.println("True!"); // pois é diferente do primeiro
		
		

	}

}
