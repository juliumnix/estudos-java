package lista6;
import java.util.*;


public class exercicio6 {

    private static int ano(int valor) {
        int anos = 365 * valor;
        return anos;
    }
    private static int mes(int valor) {
        int meses = 30 * valor;
        return meses;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe sua idade em anos");
        int anos = s.nextInt();
        System.out.println("infome sua idade em meses");
        int meses = s.nextInt();
        System.out.println("informe sua idade em dias");
        int dias = s.nextInt();

        int valorAno = ano(anos);
        int valorMes = mes(meses);

        int total = valorAno+valorMes+dias;

        System.out.println("sua idade em dias totais é de " + total );

    }
    
}
