package Lista2Scanner;

import java.util.Scanner;

public class Exercicio13 {

    Scanner leia = new Scanner(System.in);

     System.out.print("Possui CNH? (true/false): ");
        boolean possuiCNH = leia.nextBoolean();

        System.out.print("Possui Carro? (true/false): ");
        boolean possuiCarro = leia.nextBoolean();

        System.out.print("Possui Dinheiro? (true/false): ");
        boolean possuiDinheiro = leia.nextBoolean();

        /* 
         * 1. possuiCNH && possuiCarro
         * O operador && (E) exige que AMBAS as condições sejam verdadeiras.
         * Se digitar true e false, o resultado será FALSE.
         */
        System.out.println("possuiCNH && possuiCarro           : " + (possuiCNH && possuiCarro));

        /* 
         * 2. possuiCarro || possuiDinheiro
         * O operador || (OU) exige que APENAS UMA das condições seja verdadeira.
         * Se digitar false e true, o resultado será TRUE.
         */
        System.out.println("possuiCarro || possuiDinheiro       : " + (possuiCarro || possuiDinheiro));

        /* 
         * 3. !possuiCNH
         * O operador ! (NÃO/NEGAÇÃO) inverte o estado lógico atual da variável.
         * Se possuiCNH for true, o resultado será FALSE.
         */
        System.out.println("!possuiCNH                          : " + (!possuiCNH));

        /* 
         * 4. possuiCNH && possuiDinheiro
         * Como ambas as variáveis são verdadeiras no enunciado (true && true),
         * o operador && (E) valida a expressão como TRUE.
         */
        System.out.println("possuiCNH && possuiDinheiro         : " + (possuiCNH && possuiDinheiro));

        /* 
         * 5. !(possuiCarro || possuiDinheiro)
         * Primeiro o Java resolve os parênteses: (false || true) que resulta em true.
         * Depois o operador ! (NEGAÇÃO) do lado de fora inverte esse true para FALSE.
         */
        System.out.println("!(possuiCarro || possuiDinheiro)    : " + (!(possuiCarro || possuiDinheiro)));
    

}
