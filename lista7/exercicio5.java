package lista7;
import java.util.*;

public class exercicio5 {

    private static double diametro(double valor1, double valor2, double valor3) {
        double multiplica1 = valor1 * valor1;
        double multiplica2 = valor2 * valor2;
        double multiplica3 = valor3 * valor3;
        double somaMultis = multiplica1 + multiplica2 + multiplica3;
        double finalSoma = Math.sqrt(somaMultis);

        return finalSoma;
    }

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("deseja iniciar o programa?");
        String confirm = s.next();
        int lote = 0;
        int somaMaior = 0;
        int concretos = 0;

        while (!confirm.equalsIgnoreCase("n")) {
            lote+=1;
            
            System.out.println("informe uma dimensão do produto");
                int a = s.nextInt();
            System.out.println("informe outra dimensão do produto");
                int b = s.nextInt();
            System.out.println("informe a ultima dimensão do produto");
                int c = s.nextInt();
                if (a<0 || b<0 || c<0) {
                    System.out.println("valor invalido");
                    break;
                }
            
            double finalSoma = diametro(a, b, c);

           

            if (finalSoma<=10) {
                System.out.println("o valor cabe dentro da esfera de 10cm");
                concretos+=1;
            }
            if (finalSoma >= 10.1 && finalSoma <= 15){
                System.out.println("o valor cabe dentro da esfera de 15cm");
                concretos+=1;
            }
            if (finalSoma >= 15.1 && finalSoma <= 20){
                System.out.println("o valor cabe dentro da esfera de 20 cm");
                concretos+=1;
            }
            if (finalSoma >= 20.1 && finalSoma <= 25){
                System.out.println("o valor cabe dentro da esfera de 25 cm");
                concretos+=1;
            }
            
            if (finalSoma > 25.1) {
                System.out.println("o valor NÃO se encaixa");
                somaMaior+=1;
            }
            
            System.out.println("deseja continuar o programa?");
            confirm = s.next();
        }
        System.out.println("o número de produtos no lote é de " + lote);
        System.out.println("o número de produtos no lote acima do maior diametro é de " + somaMaior);
        System.out.println("o número de produtos aceitos é de " + concretos);
        
    }
    
}
