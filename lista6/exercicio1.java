package lista6;
import java.util.*;


public class exercicio1 {

    private static double raio1(double transforma) {
        
        double raio = transforma*transforma*transforma;
        
        double conta1 = 1.33 * 3.14;

        double conta2 = (conta1 * raio);

        return conta2;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o raio da esfera");
        double valor = s.nextInt();

        double resultado = raio1(valor);

        System.out.println(resultado);

    }
    
}
