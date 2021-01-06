package lista5;
import java.util.*;


public class exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] lista1 = new int[5];
        int [] lista2 = new int[5];
        int [] lista3 = new int[5];


        for (int i = 0; i < lista1.length; i++) {
            System.out.println("informe um valor para a lista 1");
            lista1[i] = s.nextInt();
        }

        for (int i = 0; i < lista2.length; i++) {
            System.out.println("informe um valor para a lista 2");
            lista2[i] = s.nextInt();
        }

        for (int i = 0; i < lista3.length; i++) {
            if (i % 2 == 1) {
                lista3[i] = lista2[i];
            }
            if (i % 2 == 0) {
                lista3[i] = lista1[i];
            }
        }

        for (int i = 0; i < lista3.length; i++) {
            System.out.print(lista3[i] + "");
        }
    }
    
}
