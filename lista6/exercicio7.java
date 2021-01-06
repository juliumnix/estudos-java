package lista6;
import java.util.*;

public class exercicio7 {

    private static String idadeFinal(int valor) {
        String letra = "";
        if (valor >=5 && valor <= 7) {
            letra = "infantil a";
        }
        if (valor >= 8 && valor <= 10) {
            letra = "infantil b";
        }
        if (valor >= 11 && valor <= 13) {
            letra = "juvenil a";
        }
        if (valor >= 14 && valor <=16) {
            letra = "juvenil b";
        }
        if (valor >= 17) {
            letra = "adulto";
        }

        return letra;
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe a idade do competidor");
        int idade = s.nextInt();

        String param = idadeFinal(idade);

        System.out.println(param);

    }
    
}
