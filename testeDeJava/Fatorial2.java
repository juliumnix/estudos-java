package testeDeJava;
import java.util.*;
import java.text.DecimalFormat;

public class Fatorial2 {

    public static long fatorial(int valor) {
        long valorFinal = 0;

        long fatorialConta = 1;
        for (double i = valor; i > 0; i--) {
            fatorialConta*=i;
        }

        valorFinal = fatorialConta;
        return valorFinal;
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0");
        System.out.println("informe um valor");
        int valor = s.nextInt();
        
        long fatorialFinal = fatorial(valor);
        System.out.println(d.format(fatorialFinal));

    }
    
}

