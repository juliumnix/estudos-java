package lista3;
import java.util.*;


public class teste {

    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double valorMaior = 0;
        double contaValores = 0;
        double valorMenor = 0;
        
        System.out.println("Quantas mercadorias o senhor(ora) gostaria de enviar para o sistema?");
        double numero_de_mercadorias = s.nextInt();
        
        for(int i = 1; i <=numero_de_mercadorias; i++){
                System.out.println("informe um valor");
                    double valor = s.nextInt();

            if (valor >= 50) {
                valorMaior += valor;
                contaValores = contaValores +1;                
            }
             
            else
                valorMenor = valorMenor + 1;
            
            
            
        }
            System.out.println("Seu valor médio de mercadorias com valor acima ou igual a R$ 50,00 é de R$ " + valorMaior/contaValores);
            System.out.println("O número de mercadorias com valor inferior a R$ 50,00 é de " + valorMenor + " mercadorias");    
    }
    
    
    
}
