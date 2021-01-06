package lista6;
import java.util.*;
import java.text.DecimalFormat;

public class exercicio13 {

    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0");
        System.out.println("informe um valor");
        int valor = s.nextInt();
        
        double fatorial = 1;
        for (double i = valor; i > 0; i--) {
            fatorial*=i;
        }

        System.out.println(d.format(fatorial));

    }
    
}
