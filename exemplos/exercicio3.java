package exemplos;

import java.util.*;

public class exercicio3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        System.out.println("Informe 1 número");
        int valor = s.nextInt();
        int resto1 = valor % 10;

        if (resto1 == 0) {
            System.out.println("É divisível por 10");
            
        }
            else
            System.out.println("Seu número não é divisível por 10");

        int resto2 = valor % 5;

            if (resto2 == 0) {
                System.out.println("É divisível por 5");
        
            }
                else
                System.out.println("Seu número não é divisível por 5");

            int resto3 = valor % 2;

                if (resto3 == 0) {
                    System.out.println("É divisível por 2"); 
                 
                }
                    else
                    System.out.println("Seu número não é divisível por 2");
    }
}