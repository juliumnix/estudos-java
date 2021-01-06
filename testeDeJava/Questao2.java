package testeDeJava;
import java.util.*;
import java.text.DecimalFormat;
import java.math.*;

public class Questao2 {

   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");

        System.out.println("informe um valor 1");
        int a = s.nextInt();
        System.out.println("informe um valor 2");
        double b = s.nextDouble();
        System.out.println("informe um valor 3");
        double c = s.nextDouble();

        double maiorValor = b;
        double menorValor = b;

        
        
        if (c < menorValor) {
            menorValor = c;
            
        }
        
        if (c > menorValor) {
            maiorValor = c;
            
        }




        switch (a) {
            case 1: {
                double conta = maiorValor - menorValor;
                System.out.println(d.format(conta));
                break;
            }
            case 2: {
                double conta = (b*b)+ (7*c) -5;
                System.out.println(d.format(conta));
                break;
                } 
            case 4: {
                double conta1 =  (b*b) + c;
                double conta2 = Math.sqrt(conta1);
                System.out.println(d.format(conta2));
                break;
                    } 
                
        
            default:
            System.out.println("Tente novamente");
                break;
        }

    }
    
}
