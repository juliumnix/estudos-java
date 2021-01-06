package lista5;
import java.util.*;


public class exercicio10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] lista1 = new String[5];
        String[] lista2 = new String[5];

        for (int i = 0; i < lista1.length; i++) {
            System.out.println("informe uma letra para a lista 1");
            lista1[i] = s.next();
        }
        for (int i = 0; i < lista2.length; i++) {
            System.out.println("informe uma letra para a lista 2");
            lista2[i] = s.next();
        }
        int verdade = 0;
        for (int i = 0; i < lista2.length; i++) {
            for (int j = 0; j < lista2.length; j++) {
                if (lista1[i].equals(lista2[j])) {
                    verdade +=1;
                }
            }
        }

        if (verdade == 5) {
            System.out.println("as duas listas são iguais");
        }else{
            System.out.println("as duas listas são diferentes");
        }
    }
    
}
