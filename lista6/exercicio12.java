package lista6;
import java.util.*;

public class exercicio12 {

    private static String tipo(double valor1 , double valor2, double valor3 ) {
        String triangulo = "";

        if (valor1 == valor2 && valor1 == valor3 && valor2 == valor3) {
            triangulo = "equilatero";
            return triangulo;
        }

        if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
            triangulo = "isoceles";
        } else {
            triangulo = "escaleno";
        }

        return triangulo;
    }

    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.println("informe o valor de X");   
        double x = s.nextDouble();  
        System.out.println("informe o valor de y");   
        double y = s.nextDouble();
        System.out.println("informe o valor de Z");   
        double z = s.nextDouble();
        
        if (x < (y+z)) {
            if (y < (x+z)) {
                if (z < (y+x)) {
                    System.out.println("é triangulo");
                    String tipoFinal = tipo(x, y, z);
                    System.out.println(tipoFinal);

                } else {
                    System.out.println("Não é triangulo");
                }
            } else {
                System.out.println("Não é triangulo");
            }
         } else {
             System.out.println("Não é triangulo");
         }

}
    
}
