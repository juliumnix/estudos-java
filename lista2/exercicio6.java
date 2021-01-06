package lista2;

import java.util.*;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("digite um cateto");
        double v1 = s.nextDouble();
        System.out.println("digite outro cateto");
        double v2 = s.nextDouble();
        System.out.println("digite a hipotenusa");
        double v3 = s.nextDouble();

        double totalv1 = v1 * v1;
        double totalv2 = v2 * v2;
        double totalv3 = v3 * v3;
        double soma = totalv1 + totalv2; 

        if (soma == totalv3 ) {
            System.out.println("voce tem um triangulo retangulo");
        }
        else
        System.out.println("voce não tem um triangulo retangulo");
    }
    
}
