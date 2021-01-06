package lista1;
import java.util.*;

public class exerciciolista6 {

    
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
       System.out.println("digite um número inteiro");
       double num = s.nextDouble();
       
       double resul = num % 2;
       System.out.println(resul);
    
       if (resul == 0){
       System.out.println("Seu número é par");
    }
       
       if (resul != 0){
       
       System.out.println("Seu número é impar");
           
       }
 }
    
    
}
