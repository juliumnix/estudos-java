package lista6;
import java.util.*;


public class exercicio11 {

    private static double pesoMuie(double valor) {
        double pesoFinal = (62.1 * valor) - 44.7;
        return pesoFinal;
    }
    private static double pesoBoy(double valor) {
        double pesoFinal = (72.7 * valor) - 58;
        return pesoFinal;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe um valor de altura");
        double altura = s.nextDouble();
        System.out.println("se identifica como mulher ou homem?");
        String genero = s.next();
        if (genero.equalsIgnoreCase("mulher")) {
            double idealMulher = pesoMuie(altura);
            System.out.println("seu peso ideal é de "+ idealMulher);
        }
        if (genero.equalsIgnoreCase("homem")) {
            double idealHomem = pesoBoy(altura);
            System.out.println("seu peso ideal é de "+ idealHomem);
        }
        
    }
    
}
