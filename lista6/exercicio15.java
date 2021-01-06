package lista6;
import java.util.*;

public class exercicio15 {

    private static double calculaS(int n) {
        double s = 0;

        for (int denominador = 1; denominador <= n; denominador++) {
            s += 1.0 /(double)denominador;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("informe o valor de n");
        int n = s.nextInt();

        System.out.println(" o valor é de " + calculaS(n));


    }
    
}
