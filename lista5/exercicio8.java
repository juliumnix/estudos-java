package lista5;
import java.util.*;


public class exercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] lista = new int[5];
        int aux = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.println("informe um valor");
            lista[i] = s.nextInt();
        }
        aux = lista[0]+lista[1];
        for (int i = 2; i < lista.length; i++) {
            aux += lista[i];
        }
        System.out.println(aux);

    }
    
}
