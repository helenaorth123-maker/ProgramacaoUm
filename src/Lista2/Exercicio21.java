package Lista2;

public class Exercicio21 {
    
    public static void main(String[] args) {
        
        String nome = "João Gomes";
        double sal = 2500.00;
        int horas = 8;

       
        double valorH = horas * 35.00;
        double salF = sal + valorH;

        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + sal);
        System.out.println("Valor das horas extras: R$ " + valorH);
        System.out.println("Salário final: R$ " + salF);
    }

}
