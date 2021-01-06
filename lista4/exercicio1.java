package lista4;
import java.util.*;


public class exercicio1 {


    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        String continua = "";

        System.out.println("converter s/n");
        continua = s.next();

        while (continua.equalsIgnoreCase("s")) {
            
            System.out.println("informe um valor para ser convertido");
            int valor  = s.nextInt();


            String sequencia = "";
            while (valor > 1) {
                sequencia = (valor % 2) + sequencia;
                valor = valor/2;
            }
            sequencia = 1 + sequencia;
            System.out.println("a sequencia binária é " + sequencia);

            System.out.println("deseja converter mais um valor? s/n");
            continua = s.next();
        }
    }
    
}
