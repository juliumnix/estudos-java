package lista2;
import java.util.*;


public class exercicio3 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Quantos anos você tem?");
        int ano = s.nextInt();
        System.out.println("Quantos meses você tem?");
        int meses = s.nextInt();
        System.out.println("Quantos dias você tem?");
        int dias = s.nextInt();
        
        int total = (ano * 365) + (meses * 30) + dias;

        System.out.println("Você tem " + total + " dias de vida.");
    }
    
}
