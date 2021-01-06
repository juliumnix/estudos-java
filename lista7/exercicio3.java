package lista7;
import java.util.*;

public class exercicio3 {

    private static boolean ehPerfeito(int valor) {
        int soma = 0;
        for (int i = 1; i < valor; i++) 
            if (valor % i == 0) 
                soma+= i;
            
            if (soma == valor) 
                return true;
            
            return false;
        
    }
    
    private static int contaPerfeitos(int[]lista) {
        int cont = 0;
        for (int i = 0; i < lista.length; i++) 
            if (ehPerfeito(lista[i])) 
                cont++;
            
            return cont;
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int [30];
        int i = 0;

        System.out.println("deseja informar um valor?")
        String continua = s.next();
        while (continua.equalsIgnoreCase("s")) {
            System.out.println("informe o valor");
            numeros[i] = s.nextInt();
            i++;
            if (i> numeros.length -1) {
                System.out.println("voce não pode preencher mais");
                break;
            }
            System.out.println("deseja informar um valor?");
            continua = s.next();
        }
        System.out.println("perfeitos são " + contaPerfeitos(numeros));

    }
    
}
