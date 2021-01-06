package lista6;
import java.util.*;


public class exercicio8 {

    private static boolean sinal(int valor) {
        boolean bo = false;
        
        if (valor >= 0) {
            bo = true;
        }

        return bo;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe um valor");
        int valor = s.nextInt();

        boolean aaa = sinal(valor);

        System.out.println(aaa);
    }
    
}
