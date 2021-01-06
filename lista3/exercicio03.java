
package lista3;
import java.util.*;

public class exercicio03 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double media = 0;
        double contagem = 0;
        double valores_negativos = 0;
        double valores_entre = 0;
        for (double x = 1; x <= 10; x++) {
            System.out.println("informe um valor");
            double valor = s.nextDouble();

            if (valor > 0 ) {
                media += valor;
                contagem = contagem + 1;
                
            }
            if (valor < 0) {
                valores_negativos = valores_negativos + 1;
                
            }
            if (valor >= 5 && valor <= 50) {
                valores_entre = valores_entre + 1;

                
            }
            
        }
        System.out.println("A médias dos valores positivos é " + media/contagem);
        System.out.println("O número de valores negativos é " + valores_negativos);
        System.out.println("O número de valores entre 5 e 50 é " + valores_entre );
    }
    
}
