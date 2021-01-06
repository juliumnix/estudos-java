package lista7;
import java.util.*;

public class exercicio1 {

    private static void Soma_Pares(int[] valor) {
        int somatório = 0;

        for (int i = 0; i < valor.length; i++) {
            if (valor[i] % 2 == 0) {
                somatório+=valor[i];
            }
        }
        System.out.println("a soma de valores pares é de " + somatório);
        
    }

    private static void Conta_Negativos(int[] valor) {
        int somatorio = 0;
        for (int i = 0; i < valor.length; i++) {
            if (valor[i]<0) {
                somatorio += 1;
            }
        }
        System.out.println("o número de números negativos é de " + somatorio);
    }

    private static void Soma_intervalo(int[] valor) {
        int somatorio = 0;

        for (int i = 0; i < valor.length; i++) {
            if (valor[i]>=1 && valor[i]<=25) {
                somatorio += valor[i];
            }
        }
        System.out.println("a soma de valores entre 1 e 25 é de " + somatorio);
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("deseja iniciar o programa?");
       String resp = s.next();

       int[] listaNumeros = new int [10];
       int i = -1;

        while (!resp.equalsIgnoreCase("N")) {
            i++;
            if (i == 10) {
                break;
            }
            System.out.println("Informe um valor para o indice " + i);
            
            listaNumeros[i]= s.nextInt();
            

            System.out.println("deseja informar mais um valor?");
            resp = s.next(); 
            
        }
        if (i == 10) {
            System.out.println("o vetor está completamente preenchido");
        } else {
            System.out.println("o vetor foi preenchido até o valor " + (i -1));
        }

        Soma_Pares(listaNumeros);
        Conta_Negativos(listaNumeros);
        Soma_intervalo(listaNumeros);
       

    }
    
}
