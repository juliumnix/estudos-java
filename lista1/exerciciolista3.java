package lista1;
import java.util.*;


public class exerciciolista3 {

   
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Informa vossa idade");
        int idade = S.nextInt();
        
        if (idade < 16){
            System.out.println("Tu és não eleitor");
        
        
        }
        
        if (idade >= 18 & idade <= 65){
            System.out.println("Tu és eleitor obrigatório");
            
        }
        
        if (idade >= 16 & idade > 65){
            
            System.out.println("Tu és eleitor facultativo");
        
        }
    
    }
    
    
}
