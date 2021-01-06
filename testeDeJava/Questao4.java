package testeDeJava;
import java.util.*;
import java.text.DecimalFormat;

public class Questao4 {
    
    public static double volumePrisma(double v1, double v2, double v3){
        double total = 0;

        double conta = v1 *v2*v3;
        double conta2 = conta/2;
        total = conta2;
        return total;
    }

    public static double volumeCone(double r, double h){
        double total = 0;
        double conta1 = r * r;
        double conta2 = Math.PI*conta1*h;
        double conta3 = conta2 /3;
        total = conta3;
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        s.useDelimiter(";");
        String tipo = s.next();

        switch (tipo){
            case "prisma": {
                double b = s.nextDouble();
                double h = s.nextDouble();
                double l = s.nextDouble();
                double resultado = volumePrisma(b, h, l);
                System.out.println(d.format(resultado));
                break;
            }
            case "cone":{
                double r = s.nextDouble();
                double h = s.nextDouble();
                double resultado = volumeCone(r, h);
                System.out.println(d.format(resultado));
                break;
            }
                
                
        
            default:
                break;
        }

    }
    
}
