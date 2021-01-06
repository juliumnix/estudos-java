package lista3;
import java.util.*;

public class exercicio02 {


    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double negativos = 0;
        for(double x=1;x<=5;x++){
            System.out.println("Informe um valor");
            double valor = s.nextInt();
            if (valor < 0 ) {
                negativos = negativos + 1;  
            }
        }
        System.out.println("Os valores negativos são "+ negativos);
    }
    
}
