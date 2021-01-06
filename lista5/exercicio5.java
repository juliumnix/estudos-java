package lista5;
import java.util.*;


public class exercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] lista = new int [20];
        int pares = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.println("informe um valor");
            lista[i] = s.nextInt();
        }

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 ==0) {
                pares+=1;
            }
        }
        System.out.println(pares);
    }
    
}
