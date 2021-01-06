package lista1;
import java.util.*;

public class exerciciolista7 {

   
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);
        System.out.println("Bem vindo ao sistemas de nota.");
        System.out.println("Digite a primeira nota");
        double nota1 = S.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2 = S.nextDouble();
        System.out.println("Digite a terceira nota");
        double nota3 = S.nextDouble();
        System.out.println("Digite a quarta nota");
        double nota4 = S.nextDouble();

        double soma = nota1 + nota2 + nota3 + nota4;

        double divisao = soma/4;

        if (divisao >= 7) {
            System.out.println("parabéns você foi aprovado!");

            }
            else
            if (divisao < 7) {
                System.out.println("informe a nota do exame");
                double exame = S.nextDouble();
                double soma2 = soma + exame;
                double divisao2 = soma2 / 5;

                if (divisao2 >= 5 ) {
                    System.out.println("voce foi aprovado em exame");
                    
                }

                if(divisao2 < 5){
                    System.out.println("voce reprovou");


                }
                
            }

            
           

        
    }
        
    
}
