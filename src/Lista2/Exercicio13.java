package Lista2;

public class Exercicio13 {

	public static void main(String[] args) {
		
		boolean possuiCNH = true;
        boolean possuiCarro = false;
        boolean possuiDi= true;

        // true && false -> O operador E (&&) exige que AMBOS sejam verdadeiros.
        System.out.println(possuiCNH && possuiCarro); // Resultado: false

        // false || true -> O operador OU (||) exige que pelo menos UM seja verdadeiro.
        System.out.println(possuiCarro || possuiDi); // Resultado: true

        // !true -> O operador NÃO (!) inverte o valor booleano.
        System.out.println(!possuiCNH); // Resultado: false

        // true && true -> Como ambos os lados são verdadeiros, o resultado é verdadeiro.
        System.out.println(possuiCNH && possuiDi); // Resultado: true

        // !(false || true) -> Resolve o OU primeiro (true) e depois o NÃO (!) inverte para false.
        System.out.println(!(possuiCarro || possuiDi)); // Resultado: false
	}

}