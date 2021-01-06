package lista1;
import java.util.*;

public class exerciciolista5 {

   
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);
        System.out.println("informe um número de 1 a 7");
        int valor = S.nextInt();
        
        if(valor == 1){
            
            System.out.println("Você escolheu o domingão");
            
        }
        if(valor == 2) {
            System.out.println("Você escolheu a segundona");
        }
        
        if(valor == 3) {
            System.out.println("Você escolheu a terçona");
        
        }
        
        if(valor == 4){
            System.out.println("Você escolheu a quartona");
        
        
        }
        
        if(valor == 5){
        
            System.out.println("Você escolheu a quintona");
            
        
        }
        
        if(valor == 6){
        
            System.out.println("Você escolheu a sextou");
            
        }
        
        if(valor == 7){
        
            System.out.println("Você escolheu a sabadeira");
        }
        
        if(valor < 1 | valor > 7){
            
            System.out.println("Ta me tirando parça?");
        
        
        }
    }
        
    
}
