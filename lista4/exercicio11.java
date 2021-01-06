package lista4;
import java.util.*;


public class exercicio11 {
    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 500) {
            int resul = numero % 5;
            int resul2 = numero %3;
            if (resul == 0 && resul2 ==0) {
                System.out.println(numero);
            }
            numero+=1;
        }
        
    }
    
}
