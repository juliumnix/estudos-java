package lista7;
import java.util.*;

public class exercicio2 {

    private static void cubos(double valor) {
        double result = valor*valor*valor;

        System.out.println("o volume de seu cubo é de " + result);
    }
    private static void paralelepipedos(double valor1,double valor2, double valor3) {
        double result = valor1*valor2*valor3;

        System.out.println("o volume de seu paralelepipedo é de " + result);
    }
    private static void cilindros(double valor1,double valor2) {
        double result = ((valor1 * valor1)* valor2) * 3.14;

        System.out.println("o volume de seu cilindro é de "+ result);
    }
    private static void esferas(double valor1) {
        double result1 = valor1*valor1*valor1;
        double result2 = result1*3.14;
        double result3 = result2 * (4/3);

        System.out.println("o volume de sua esfera é de " + result3);
    }
    private static void cones(double valor1, double valor2) {
        double result1 = valor1*valor1;
        double result2 = (result1 * valor2) * 3.14;
        double result3 = result2 * (1/3);

        System.out.println("o volume do cone é de " + result3);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe o tipo de volume a ser calculado [1] cubos - [2] paralelepipedos - [3] cilindros - [4] esferas - [5] cones");
        int tipo = s.nextInt();
        if (tipo == 1) {
            System.out.println("informe o valor do comprimento do lado");
            double lado = s.nextDouble();
            cubos(lado);
        }
        if (tipo == 2) {
            System.out.println("informe o valor da largura");
            double largura = s.nextDouble();
            System.out.println("informe o valor da comprimento");
            double comprimento = s.nextDouble();
            System.out.println("informe o valor da altura");
            double altura = s.nextDouble();
            paralelepipedos(largura, comprimento,altura);
        }
        if (tipo == 3) {
            System.out.println("informe o valor do raio");
            double raio = s.nextDouble();
            System.out.println("informe o valor da altura");
            double altura = s.nextDouble();
            cilindros(raio, altura);
        }
        if (tipo == 4) {
            System.out.println("informe o valor do raio");
            double raio = s.nextDouble();
            esferas(raio);
        }
        if (tipo == 5) {
            System.out.println("informe o valor do raio");
            double raio = s.nextDouble();
            System.out.println("informe o valor da altura");
            double altura = s.nextDouble();
            cones(raio, altura);
        }
    }
    
}
