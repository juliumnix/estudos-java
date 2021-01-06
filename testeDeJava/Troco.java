package testeDeJava;
import java.util.*;

public class Troco {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cinquenta = 0;
        int vinte = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;

        System.out.println("informe o nome do local");
        String nome = s.nextLine();

        System.out.println("informe o valor da compra");
        int valorCompra = s.nextInt();

        System.out.println("informe a nota usada no pagamento");
        int valorNota = s.nextInt();

        int valorFinal = valorNota - valorCompra;

        while(valorFinal>= 50) {
            valorFinal = valorFinal - 50;
            cinquenta+=1;
        }
        while (valorFinal >= 20) {
            valorFinal = valorFinal - 20;
            vinte += 1;
        }
        while (valorFinal >= 10) {
            valorFinal = valorFinal - 10;
            dez+=1;
        }
        while (valorFinal >= 5) {
            valorFinal = valorFinal - 5;
            cinco+=1;
        }
        while (valorFinal >= 2) {
            valorFinal = valorFinal - 2;
            dois+=1;
        }
        while (valorFinal >= 1) {
            valorFinal = valorFinal - 1;
            um+=1;
        }

        System.out.println(nome);
        System.out.println(cinquenta+"x50");
        System.out.println(vinte+"x20");
        System.out.println(dez+"x10");
        System.out.println(cinco+"x5");
        System.out.println(dois+"x2");
        System.out.println(um+"x1");
    }
    
}
