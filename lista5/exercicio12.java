package lista5;
import java.util.*;

public class exercicio12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] lista = new int[5];
        int [] lista2 = new int[5];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("informe um valor");
            lista[i] = s.nextInt();
        }
        int x = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != 0) {
            lista2[x] = lista[i];
            x=x+1;
        }
        
    }
        for (int i = 0; i < lista.length; i++) {
            
            System.out.println(lista2[i]);
        }
    
 }
}
