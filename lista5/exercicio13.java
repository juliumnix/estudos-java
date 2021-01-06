package lista5;
import java.util.*;


public class exercicio13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] lista = new int[9];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("informe um valor");
            lista[i] = s.nextInt();
        }
        System.out.println("infome um indice de 0 a 9");
        int indice = s.nextInt();
        

        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[indice]+ ",");
            indice= lista[indice];
            indice = indice - 1;

        }

        
    }
    
}
