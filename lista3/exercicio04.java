package lista3;
import java.util.*;


public class exercicio04 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        double maior = 0;
        double menor = 0;
        double soma = 0;
        double contagem = 0;
        for (double x = 1; x <= 500; x++) {
            System.out.println("informe um valor");
            double valor = s.nextInt();
            
            soma += valor;
            contagem = contagem +1;
            
            if (maior == 0) {
                maior = valor;
            }
            else
            if (valor > maior) {
                maior = valor;
                
            }
            
            if (menor == 0 ) {
                menor = valor;
            }
            else
            if (valor < menor) {
                menor = valor;
                
            }

        }
        System.out.println("o valor maior é "+ maior);
        System.out.println("o valor menor é "+ menor);
        System.out.println("a média é de " + soma/contagem);
    }
    
}
