package lista4;
import java.util.*;


public class exercicio_prova1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe um valor");
        int valor1 = s.nextInt();
        System.out.println("informe outro valor");
        int valor2 = s.nextInt();
        System.out.println("informe um ultimo valor");
        int valor3 = s.nextInt();
        int maior = 0;
        int menor = 0;
        int medio = 0;

        if (valor1>valor2&&valor1>valor3) {
               maior = valor1;

        }
        if (valor1>valor2&&valor1<valor3) {
            medio = valor1;
        }
        if (valor1<valor2&&valor1>valor3) {
            medio = valor1;
        }

        if (valor2>valor1&&valor2>valor3) {
            maior = valor2;
        }
        if (valor2>valor1&&valor2<valor3) {
            medio = valor2;
        }
        if (valor2<valor1&&valor2>valor3) {
            medio = valor2;
        }
        if (valor3>valor1&&valor3>valor2) {
            maior = valor3;
        }
        
        if (valor3>valor1&&valor3<valor2) {
            medio = valor3;
        }
        if (valor3<valor1&&valor3>valor2) {
            medio = valor3;
        }
        if (valor3>valor1&&valor3<valor2) {
            menor = valor3;
        }
        if (valor1<valor2&&valor1<valor3) {
            menor = valor1;
        }

        if (valor2<valor1&&valor2<valor3) {
        menor = valor2;
        }
        if (valor3<valor1&&valor3<valor2) {
         menor = valor3;
        }
        int resto = medio % 2;

        System.out.println(resto);

        if (resto == 0) {
            System.out.println("o valor é par e o valor é "+ medio);
        }else{
            System.out.println("o valor é impar e o valor é "+medio);
        }




        
        
    }
    
}
