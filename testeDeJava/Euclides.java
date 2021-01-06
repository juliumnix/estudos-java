package testeDeJava;
import java.util.*;

public class Euclides {


    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.println("informe o valor a");
        int a = s.nextInt();
        System.out.println("informe o valor b");
        int b = s.nextInt();

        int resto;
        while(b != 0){
            resto = a % b;
            a = b;
            b = resto;
          }

          System.out.println(a);

    }
    
}
