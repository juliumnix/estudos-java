package testeDeJava;
import java.util.*;

public class Emprestimo {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe seu nome");
        String nome = s.next();
        System.out.println("informe seu salário");
        double salario = s.nextDouble();
        System.out.println("informe o valor do financiamento");
        double financiamento = s.nextDouble();

        if (financiamento <= (salario*5)){
            System.out.println(nome);
            System.out.println("Financiamento CONCEDIDO");
            System.out.println("Obrigado por nos consultar");
        } else{
            System.out.println(nome);
            System.out.println("Financiamento NEGADO");
            System.out.println("Obrigado por nos consultar");
        }
    }
    
}
