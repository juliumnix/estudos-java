package lista5;
import java.util.*;

public class exercicio4 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] listaNumeros = new int[10];
        
            for (int i = 0; i < listaNumeros.length; i++) {
                System.out.println("informe um valor qualquer");
                listaNumeros[i] = s.nextInt();
        }
        System.out.println("informe um valor para o indice");
        int valorProcurado = s.nextInt();

        int index = -1;
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i]== valorProcurado) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("o valor n existe");
        }else{
            System.out.println("o valor esta na posição "+ index);
        }
    }
    
}
