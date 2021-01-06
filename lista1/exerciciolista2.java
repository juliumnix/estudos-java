package lista1;

import java.util.*;
        
public class exerciciolista2 {

    public static void main(String[] args) {
       
        Scanner S = new Scanner (System.in);
        System.out.println("Informe o seu saldo");
        double saldo = S.nextDouble();
        
        if (saldo <= 500) {
            System.out.println("Você não tem créditos pois seu saldo é " + saldo);
            
        }
        
        double taxa1 = saldo * 0.3;

        if(saldo > 501 & saldo <= 1000) {
        
            System.out.println("Você tem um saldo de " + saldo + " portanto, seu crédito é de " + taxa1 );
        
        }

        double taxa2 = saldo * 0.4;

        if (saldo > 1001 & saldo<= 3000) {

            System.out.println("Você tem um saldo de " + saldo + " portanto, seu crédito é de " + taxa2);


            
        }

        double taxa3 = saldo * 0.5;
        if (saldo > 3001) {
            System.out.println("Você tem um saldo de " + saldo + " portanto, seu crédito é de " + taxa3);
            
        }
        
        
    }
    
}
