package lista6;
import java.util.*;

public class exercicio9 {

    private static boolean isPar(int valor) {
        boolean sinal = false;

        if (valor % 2 == 0) {
            sinal = true;
        }

        return sinal;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe um valor");
        int valor = s.nextInt();

        boolean fim = isPar(valor);

        if (fim = true) {
            System.out.println("o seu valor é par");
        }else{
            System.out.println("o seu valor é impar");
        }

    }
    
}
