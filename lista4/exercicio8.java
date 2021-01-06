package lista4;
import java.util.*;


public class exercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("deseja fazer a sequencia? X para sair");
        String pergunta = s.next();
        while (!pergunta.equalsIgnoreCase("X")) {
            System.out.println("Escreva um valor");
        int valor = s.nextInt();
        int a = 1;
        int b = 0;
        int aux = 0;
        System.out.println(b);
        while (a<= valor)  {
            System.out.println(a);
            aux = a;
            a=a+b;
            b = aux;
            
        }  
         
        System.out.println("deseja fazer a sequencia? X para sair");
        pergunta = s.next();  
    }
        

    }

}
