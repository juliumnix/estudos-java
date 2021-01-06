package testeDeJava;
import java.util.*;
import java.math.*;
import java.text.DecimalFormat;

public class Calculadora {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.0");
        
        System.out.println("informe o tipo de operação");
        String operacao = s.next();
        double valor1;
        double valor2;
        switch (operacao) {
            case "sum": {
                System.out.println("informe o primeiro valor");
                valor1 = s.nextDouble();
                System.out.println("informe o segundo valor");
                valor2 = s.nextDouble();

                System.out.println(valor1+valor2);

                break;
            } 
case "sub": {
                System.out.println("informe o primeiro valor");
                valor1 = s.nextDouble();
                System.out.println("informe o segundo valor");
                valor2 = s.nextDouble();

                System.out.println(valor1-valor2);

                break;
            } 
case "mult": {
                d.setRoundingMode(RoundingMode.UP);
                System.out.println("informe o primeiro valor");
                valor1 = s.nextDouble();
                System.out.println("informe o segundo valor");
                valor2 = s.nextDouble();

                System.out.println(d.format(valor1*valor2));

                break;
            } 
case "div": {
                System.out.println("informe o primeiro valor");
                valor1 = s.nextDouble();
                System.out.println("informe o segundo valor");
                valor2 = s.nextDouble();
                if (valor2 == 0) {
                    System.out.println("Divisão por zero");
                    break;
                }else{
                    System.out.println(d.format(valor1/valor2));
                }

                

                break;
            } 
case "abs": {
                System.out.println("informe o primeiro valor");
                valor1 = s.nextDouble();
                double absoluto = Math.abs(valor1);
                System.out.println(absoluto);

                

                break;
            } 
            
        
            default:
                break;
        }
    
}
}
