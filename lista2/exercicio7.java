package lista2;
import java.util.*;


public class exercicio7 {   
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("De o X do ponto 1");
        double x1 = s.nextDouble();
        System.out.println("De o X do ponto 2");
        double x2 = s.nextDouble();
        System.out.println("De o Y do ponto 1");
        double y1 = s.nextDouble();
        System.out.println("De o Y do ponto 2");
        double y2 = s.nextDouble();

        double subX = x2 - x1;
        double multX = Math.pow(subX, 2);
        double subY = y2 - y1;
        double multY = Math.pow(subY, 2);
        double soma = multX + multY;
        double total = Math.sqrt(soma);

        if (x1>x2) {
            System.out.println("valores inválidos");
            
        }
        else
        if (y1>y2) {
            System.out.println("valores inválidos");
        }
        else
        System.out.println("a distancia é de " + total);
    }
    
}
