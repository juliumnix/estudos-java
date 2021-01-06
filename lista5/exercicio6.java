package lista5;
import java.util.*;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] lista = new int [40];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("informe um valor para o indice "+ i);
            lista[i] = s.nextInt();
        }
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < 0) {
                lista[i] = 0;
            }
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + "");
        }
    }
    
}
