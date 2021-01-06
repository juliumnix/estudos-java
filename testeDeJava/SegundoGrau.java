package testeDeJava;
import java.util.*;
import java.math.*;
import java.text.DecimalFormat;

public class SegundoGrau {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");

        System.out.println("informe o valor de A");
        double a = s.nextDouble();
        System.out.println("informe o valor de B");
        double b = s.nextDouble();
        System.out.println("informe o valor de C");
        double c = s.nextDouble();

        double raiz = (b*b) - 4*a*c;

        if (raiz == 0) {
            double conta1 = (Math.sqrt(raiz));
            double conta2 = -b + conta1;
            double conta3 = conta2/(2*a); 
            System.out.println(d.format(conta3));
        }
        if (raiz > 0) {
            double conta1 = (Math.sqrt(raiz));
            double conta2 = -b + conta1;
            double conta3 = conta2/(2*a);
            

            double conta4 = (Math.sqrt(raiz));
            double conta5 = -b - conta4;
            double conta6 = conta5/(2*a);
            System.out.println(d.format(conta3) + ";" + d.format(conta6) );

        }
        if (raiz < 0) {
            System.out.println("Sem raiz real");
        }

    }
    
}
