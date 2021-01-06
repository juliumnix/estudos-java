package lista5;
import java.util.*;

public class exercicio2 {

    public static void main(String[] args) {
        int [] listaNumeros = new int[20];
        for (int i = 1; i < listaNumeros.length; i=i+2) {
            System.out.println(i);
            
            listaNumeros[i]=i;
        }
    }
    
}
