package lista4;
import java.util.*;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("informe o maximo da sequencia");
        int max = s.nextInt();

        System.out.println("informe o primeiro termo");
        int a = s.nextInt();

        System.out.println("informe o segundo valor");
        int b = s.nextInt();

        System.out.print(a + " " + b);

        int indice = 3;
        int c = 0;

        while (c<max) {
        double porcent = indice%2;

            if (porcent == 0) {
                c = b - a;
                System.out.print(" "+c);
            }else{
                c = b+a;
                System.out.print(" " + c);
            }
            indice+=1;
            a=b;
            b=c;
        }
    
    
    }
    
}
