package lista2;

import java.util.*;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("informe um valor");
        double v1 = s.nextDouble();
        System.out.println("informe outro valor");
        double v2 = s.nextDouble();
        System.out.println("informe o ultimo valor");
        double v3 = s.nextDouble();
        System.out.println("crescente [1] ou descrescente [2] ");
        double opcao = s.nextDouble();

        if (opcao == 1) {
            if (v1 <= v2 && v2 <= v3) {
                System.out.println(v1 + " , " + v2 + " e " + v3);
            }
            else
            if (v1 <= v3 && v3 <= v2) {
                System.out.println(v1 + " , " + v3 + " e " + v2);
            }
            else
            if (v3 <= v2 && v3 <= v1) {
                System.out.println(v3 + " , " + v2 + " e " + v1);
            }
            else
            if (v3 <= v1 && v1 <= v2) {
                System.out.println(v3 + " , " + v1 + " e " + v2);
            }
            else
            if (v2 <= v1 && v1 <= v3) {
                System.out.println(v2 + " , " + v1 + " e " + v3);
            }
            else
            if (v2 <= v3 && v3 <= v1) {
                System.out.println(v2 + " , " + v3 + " e " + v1);

            

            }
            
            
        }
        else

        { 
            if (opcao == 2) {
            if (v1 >= v2 && v2 >= v3) {
                System.out.println(v1 + " , " + v2 + " e " + v3);
            }
            else
            if (v1 >= v3 && v3 >= v2) {
                System.out.println(v1 + " , " + v3 + " e " + v2);
            }
            else
            if (v3 >= v2 && v3 >= v1) {
                System.out.println(v3 + " , " + v2 + " e " + v1);
            }
            else
            if (v3 >= v1 && v1 >= v2) {
                System.out.println(v3 + " , " + v1 + " e " + v2);
            }
            else
            if (v2 >= v1 && v1 >= v3) {
                System.out.println(v2 + " , " + v1 + " e " + v3);
            }
            else
            if (v2 >= v3 && v3 >= v1) {
                System.out.println(v2 + " , " + v3 + " e " + v1);
            
            }
        }
        



     }

            
        
    }
    
}
