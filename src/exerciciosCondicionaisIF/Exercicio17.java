package exerciciosCondicionaisIF;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        String usuario = "admin";
        String senha = "1234";
		
		System.out.println("Informe o usuário:");
		String usu = leia.next();

        if(usu =! usuario){

        System.out.println("Usuário Inexistente!");
        }

        else if(usu == usuario){

        System.out.println("Informe a senha:");
        String sen = leia.next();

        if(sen == senha){
             System.out.println("Acesso Permitido!");
            }

        else{
            System.out.println("Senha Incorreta!");
            }
        }
	}

}