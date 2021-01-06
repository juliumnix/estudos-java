package lista5;
import java.util.*;


public class exercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] listaNumeros = new int[12];
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Informe um valor para o indice " + i);
            listaNumeros[i]= s.nextInt();
        }
        System.out.println("informe um valor de x");
        int x = s.nextInt();
        x = listaNumeros[x];
        while (x <0 ||x>11) {
            System.out.println("Valor inválido informe um valor correspondente");
            x = s.nextInt();
        }
        System.out.println("informe um valor de y");
        int y = s.nextInt();
        y = listaNumeros[y];
        while (y <0 ||y>11) {
            System.out.println("Valor inválido informe um valor correspondente");
            y = s.nextInt();
        }
        int soma = y + x;

        System.out.println(soma);
    }
    
}
