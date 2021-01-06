package lista3;
import java.util.*;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int contaPrimos = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("informe um valor");
            int num = s.nextInt();

            if (num >= 2) {
                int contaDivisores = 0;
                for (int x = 2; x < (num/2)+1; x++) {
                    int resto = num % x;
                    if (resto == 0) 
                        contaDivisores+=1;
                        
                    
                }
                    if (contaDivisores == 0) {
                        contaPrimos +=1;
                        
                    
                    
                }
                
            }
        }
        
        
        
            
            
           
            
         System.out.println("o numero de valores primos é de " + contaPrimos);
            
        }
        
 }
    
