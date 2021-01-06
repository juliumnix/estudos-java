package testeDeJava;
import java.util.*;
import java.text.DecimalFormat;

public class FatorialRecursivo {

    public static double fatorial(int valor) {
        if(valor <= 1){
            return 1;
        }else{
            return fatorial(valor - 1) * valor;
        }
        
        
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0");
        System.out.println("informe um valor");
        int valor = s.nextInt();
        
        double fatorialFinal = fatorial(valor);
        System.out.println(d.format(fatorialFinal));

    }
    
}

