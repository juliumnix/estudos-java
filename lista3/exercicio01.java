
package lista3;
import java.util.*;

public class exercicio01 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("escreva um valor para a sua tabuada");
        int tipo = s.nextInt();
       
        for(int i = 1; i <= 10; i++){
            
            System.out.println("o valor de "+ tipo + " X " + i + " é: " + (i * tipo) );
        
        }
    }
    
}
