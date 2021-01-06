package lista3;
import java.util.*;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe um valor");
        int valor = s.nextInt();
        double valor2 = 0;
        double y = 1;

        for (int i = 0; i <= valor; i++) {            
            valor2 = valor * (valor - 1);
            y = y * valor2;
            valor = valor - 2;
            
            if (valor == i) {
                y = y * i; 
            }
            
        }      
        
        if (valor == 0){
            valor = 1 ;
        }

        System.out.println("o valor é de " + (y * valor));
   
    } 
}
