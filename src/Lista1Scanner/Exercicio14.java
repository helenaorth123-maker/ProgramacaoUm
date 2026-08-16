package Lista1Scanner;

import java.util.Scanner;

public class Exercicio14 {

    Scanner leia = new Scanner(System.in);

    System.out.print("Possui ingresso? (true/false): ");
        boolean possuiIngresso = leia.nextBoolean();

        System.out.print("Possui documento? (true/false): ");
        boolean possuiDocumento = leia.nextBoolean();

        System.out.print("Acompanhante é maior de idade? (true/false): ");
        boolean acompanhanteMaiorIdade = leia.nextBoolean();

        boolean expressao1 = possuiIngresso && possuiDocumento;
        boolean expressao2 = possuiIngresso || possuiDocumento;
        boolean expressao3 = !possuiDocumento;
        boolean expressao4 = possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade);
        boolean expressao5 = !(possuiIngresso && possuiDocumento);

        
        System.out.println("1) possuiIngresso && possuiDocumento = " + expressao1);
        /* 
           SIGNIFICADO: Operador E (&&). Retorna true APENAS se TODAS as condições forem verdadeiras.
           No cenário do enunciado (true && false), o resultado é FALSE porque a pessoa não tem o documento.
        */

        System.out.println("2) possuiIngresso || possuiDocumento = " + expressao2);
        /* 
           SIGNIFICADO: Operador OU (||). Retorna true se PELO MENOS UMA das condições for verdadeira.
           No cenário do enunciado (true || false), o resultado é TRUE porque ela possui o ingresso.
        */

        System.out.println("3) !possuiDocumento = " + expressao3);
        /* 
           SIGNIFICADO: Operador NÃO (!). Inverte o valor lógico (Negação).
           Se possuiDocumento é false, !possuiDocumento vira TRUE (significa: 'é verdade que ela NÃO tem documento').
        */

        System.out.println("4) possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade) = " + expressao4);
        /* 
           SIGNIFICADO: Expressão mista. Primeiro resolve os parênteses: (false || true) que resulta em true.
           Depois resolve o resto: true && true, que resulta em TRUE. 
           Significa que a pessoa pode entrar porque tem o ingresso E cumpre pelo menos um dos requisitos de idade/documento.
        */

        System.out.println("5) !(possuiIngresso && possuiDocumento) = " + expressao5);
        /* 
           SIGNIFICADO: Negação do resultado de uma expressão. 
           Primeiro resolve os parênteses: (true && false) que resulta em false.
           Depois aplica o operador !, invertendo o false para TRUE.
        */
    
}
