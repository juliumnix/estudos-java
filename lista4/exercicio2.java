package lista4;
import java.text.DecimalFormat;
import java.util.*;


public class exercicio2 {

    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#0.00");

        Scanner s  = new Scanner (System.in);
        String continua = "";

        int far = 1;
        while (far <= 150) {
            double celcius = 5.0/9.0 * (far - 32);
            System.out.println(far + " graus farenheit = " + d.format(celcius) + " graus celcius");
            far++;
            
        }
        System.out.println("fim");
        
        
    
  }
}
