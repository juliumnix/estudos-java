package testeDeJava;
import java.util.*;
import java.math.*;
import java.text.DecimalFormat;

public class VolumeDaCaixaDagua {

 
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("0.##");
        Scanner s = new Scanner(System.in);
        System.out.println("informe um valor de raio");
        double raio = s.nextInt();
        System.out.println("informe um valor de altura");
        double altura = s.nextInt();

        double v = (Math.PI * (raio*raio) * altura);

        System.out.println(d.format(v));
    }
    
}
