package lista1;

import java.util.*;


public class exerciciolista9 {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        System.out.println("informe o peso");
        
        double peso = s.nextDouble();
        double multa = peso - 500;
        double valor = multa * 4;
        
        if(peso <= 500){
        
            System.out.println("voce não vai pagar multa");
        
        }
        else
        System.out.println("sua multa está no valor de " + valor);
        
            
    
    }
    
}
