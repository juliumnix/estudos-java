package lista4;
import java.util.*;
import java.text.DecimalFormat;


public class exercicio3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe um produto para ser convertido; X para sair");
        String produto = s.next();
        int lucromaior = 0;
        int lucromenor = 0;
        int lucrointer = 0;
        while (!produto.equalsIgnoreCase("x")) {
            System.out.println("informe o valor de compra");
            double valcompra = s.nextDouble();
            System.out.println("informe o valor de venda");
            double valvenda = s.nextDouble();

            double resul = (valvenda * 100) / valcompra;
            double fim = resul - 100;

            if (fim>20) {
                lucromaior+=1;
                
            }
            if (fim < 10) {
                lucromenor +=1;
                
            }
            if (fim>=10 && fim<=20) {
                lucrointer+=1;
                
            }
            System.out.println("deseja informar mais um produto? x para sair");
            produto = s.next();
        }
        System.out.println("numero de produtos com o lucro entre 10% e 20% é de " + lucrointer);
        System.out.println("numero de produtos com o lucro menor que 10% é de " + lucromenor);
        System.out.println("numero de produtos com o lucro maior que 20% é de " + lucromaior);
    }
    
}
