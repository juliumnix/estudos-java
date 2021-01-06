package lista6;
import java.util.*;

public class exercicio2 {

    private static double result(String abc, double valor1, double valor2, double valor3) {
        
        double finaliza = 0;
        
        if (abc.equalsIgnoreCase("p")) {
            double conta1 = (valor1*5) + (valor2*3)+ (valor3*2);
            double conta2 = conta1 / 10;
            finaliza = conta2;
        }
        if (abc.equalsIgnoreCase("a")) {
            double conta1 = (valor1+valor2+valor3)/3;
            finaliza = conta1;
        }

        return finaliza;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe qual tipo de calculo deve ser executado");
        String letra = s.next();

        System.out.println("Informe qual a primeira nota");
        double nota1 = s.nextDouble();

        System.out.println("Informe qual a segunda nota");
        double nota2 = s.nextDouble();

        System.out.println("Informe qual a terceira nota");
        double nota3 = s.nextDouble();

        double resultado = result(letra, nota1, nota2, nota3);

        System.out.println(resultado);
    }
    
}
