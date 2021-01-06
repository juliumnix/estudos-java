package lista6;
import java.util.*;

public class exercicio10 {

    private static String media(double valor) {
        String conceito = "";

        if (valor >= 0 && valor <= 4.9) {
            conceito = "D";
        }
        if (valor >= 5 && valor <= 6.9) {
            conceito = "C";
        }
        if (valor >= 7 && valor <= 8.9) {
            conceito = "B";
        }
        if (valor >= 9) {
            conceito = "A";
        }

        return conceito;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe a nota média do aluno");
        double nota = s.nextDouble();

        String conceitoFinal = media(nota);

        System.out.println("o conceito do aluno é de " + conceitoFinal);

    }
    
}
