package lista3;
import java.util.*;

public class teste2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int contaPrimos = 0;
        System.out.println("informe um valor");
            int num = s.nextInt();
        

        for (int i = 1; i == 1; i++) {

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
        
        if (contaPrimos>=1) {
					
					
				for (int i = num-1; i >= 1; i--){
					
					num = num *i;
					
				}
				System.out.println("o numero é primo e seu fatorial é de " + num );

				}
				else{
					System.out.println("o seu valor não é primo");
				}
        
            
            
           
            
         
            
     }
        
 }
    
