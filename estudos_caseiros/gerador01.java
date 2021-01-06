package estudos_caseiros;
import java.util.*;



public class gerador01 {
    public static void main(String[] args) {
        int[] valores = new int[3];
        

        valores [0] = 1;
        valores [1] = 0;
        valores [2] = 1;

        for (int i = 0; i < 50; i++) {
            
            if (valores[0] ==1) {
                valores[0] = 0;
                
                System.out.print("  ");
                 
            } else{
                valores[0] = 1;
                
                System.out.println(" ");
            }
            if (valores[1] ==1) {
                valores[1] = 0; 
                
                System.out.print("  ");
            }else{
                valores[1] = 1;
                System.out.println("  ");
                
            }
            if (valores[2] ==1) {
                valores[2] = 0;
                
                System.out.print("  "); 
            }else{
                valores[2] = 1;
                System.out.print("  ");
                
            }
         
            
            System.out.print(valores[0]);
            System.out.print(valores[1]);
            System.out.print(valores[2]);
        
            
           
            
        }
        


        
        
    }
    
    
}
