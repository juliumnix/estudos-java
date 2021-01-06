package lista6;
import java.util.*;

public class exercicio4 {

/*Se Δ < 0, a equação do segundo grau não possui raízes reais;

Se Δ = 0, a equação do segundo grau possui uma raiz real;

Se Δ > 0, a equação do segundo grau possui duas raízes reais.*/

    private static double transform(int num1, int num2, int num3, double delta1) {
        double resultadoFinal = 0;

        

        if (delta1 < 0) {
            resultadoFinal = 0;
        }
        if (delta1 == 0) {
            double conta1 = Math.sqrt(delta1);
            double conta2 = (-num2) + conta1 / 2*num1;
            resultadoFinal = conta2;
        }

        if (delta1>0) {
            double conta1 = Math.sqrt(delta1);
            double conta2 = (-num2) + conta1 / 2*num1;
            resultadoFinal = conta2;
        }
        
        return resultadoFinal;
    }
    private static double transform2(int num1, int num2, int num3, double delta1) {
        double resultadoFinal = 0;


        if (delta1>0) {
            double conta1 = Math.sqrt(delta1);
            double conta2 = (-num2) - conta1 / 2*num1;
            resultadoFinal = conta2;
        }
        
        return resultadoFinal;
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("informe o valor de A");
        int valor1 = s.nextInt();
        System.out.println("informe o valor de B");
        int valor2 = s.nextInt();
        System.out.println("informe o valor de C");
        int valor3 = s.nextInt();

        double delta = (valor2 * valor2) - (4 * valor1 * valor3);

        double result  = transform(valor1, valor2, valor3, delta);
        double result2  = transform2(valor1, valor2, valor3, delta);

        if (delta == 0 || delta < 0) {
            System.out.println(result);
        }
        
        if (delta > 0) {
            System.out.println(result);
            System.out.println(result2);
        }


    }

    
}
