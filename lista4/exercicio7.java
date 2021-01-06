package lista4;
import java.util.*;


public class exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um valor entre 1000 e 9999");
        int num = s.nextInt();

        while (num>=1000 && num<=9999) {
            int p1 = Integer.parseInt(String.valueOf(num).substring(0 , 2));
            int p2 = Integer.parseInt(String.valueOf(num).substring(2 , 4));

            double soma = p1+p2;

            double raiz = soma * soma;

            if (raiz == num) {
                System.out.println("Seu valor possui esta característica.");
            }else{
                System.out.println("Seu valor não possui esta característica.");
            }


            System.out.println("Informe um valor entre 1000 e 9999");
            num = s.nextInt();
        }
                
    }
    
}
