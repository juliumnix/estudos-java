package lista1;

import java.util.*;

public class exerciciolista1 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("passa o peso");
        double peso = S.nextDouble();
        System.out.println("passa a altura");
        double altura = S.nextDouble();
        
            double total = (peso) / (altura*altura);
            
        if (total < 20 ) { 
            System.out.println("o senhor está abaixo do peso, o seu IMC é " + total);
                   
             
        }
        
        if (total > 20 & total < 25) {
            System.out.println("o senhor está com peso normal, o seu IMC é " + total);
        
        
        }
        
        if (total > 25 & total < 30) {
            System.out.println("o senhor está com sobre peso, o seu IMC é " + total);
            
        }
        
        if (total > 30 & total < 40) {
            System.out.println("o senhor está com obeso, o seu IMC é " + total);
        
        
        }
        
        if (total > 40) {
            System.out.println("o senhor está com obesidade morbita, o seu IMC é " + total);
        
        
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
