package testeDeJava;
import java.util.*;
import java.math.*;
import java.text.DecimalFormat;


public class AreasFiguras {

    public static double areaQuadrado(double valor1){
        double total = 0;
        total = valor1*valor1;
        return total;
    }

    public static double areaRetangulo(double valor1, double valor2){
        double total = 0;
        total = valor1*valor2;
        return total;
    }
    public static double areaCirculo(double valor1){
        double total = 0;
        double mult = (valor1*valor1);
        total = Math.PI*mult;
        
        return total;
    }
    public static double areaTriangulo(double valor1, double valor2, double valor3){
        double total = 0;
        double conta1 = valor1+valor2+valor3;
        double s = conta1/2;

        double resul1 = s * ((s-valor1) * (s-valor2) * (s-valor3) );
        double resul2 = Math.sqrt(resul1);
        total = resul2;

        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        
        String tipo;
        s.useDelimiter(";");

        tipo = s.next();

        switch (tipo) {
        case "Q":{
            double valor1 = s.nextDouble();
            double valorFinal = areaQuadrado(valor1);
            System.out.println(d.format(valorFinal));
                break;
        }
        case "R": {
            double valor1 = s.nextDouble();
            double valor2 = s.nextDouble();
            double valorFinal = areaRetangulo(valor1, valor2);
            System.out.println(d.format(valorFinal));
            break;   
        }
        case "C": {
            double valor1 = s.nextDouble();
            double valorFinal = areaCirculo(valor1);
            System.out.println(d.format(valorFinal));
            break;
        }
        case "T":{
            double valor1 = s.nextDouble();
            double valor2 = s.nextDouble();
            double valor3 = s.nextDouble();
            double valorFinal = areaTriangulo(valor1, valor2, valor3);
            System.out.println(d.format(valorFinal));
            break;
        }
        
            default:
                break;
        }

        
    }
    
}
