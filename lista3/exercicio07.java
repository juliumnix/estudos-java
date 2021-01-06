package lista3;
import java.util.*;

public class exercicio07 {

    public static void main(String[] args) {
        double positivos = 0;
        double negativos = 0;
        
        
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.println("infporme um valor");
        double valor = s.nextDouble();

        if (valor >= 0) {
            positivos+=1;
            
        }
        else
            negativos+=1;


            
            

        } 
        double porcentagem_positiva = (positivos * 100)/20;
        double porcentagem_negativa = 100 - porcentagem_positiva;   
        System.out.println("a porcentagem dos valores positivos é " + porcentagem_positiva + "%");
        System.out.println("a porcentagem de valores negativos é " + porcentagem_negativa + "%" );
    }
    
}
