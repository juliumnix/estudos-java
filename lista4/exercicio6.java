package lista4;
import java.util.*;


public class exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja descobrir a raiz quadrada de algum número? X para sair");
        String pergunta = s.next();

        while (!pergunta.equalsIgnoreCase("x")) {
            System.out.println("informe o valor para tirar sua raiz aproximada");
            double valor = s.nextDouble();
            double impar = 1;
            double contaRaiz = 0;

            while (valor >= 0) {
                valor = valor - impar;
                
                contaRaiz+=1;
                impar +=2;
            }
            System.out.println("sua raiz aproximada é de "+ (contaRaiz-1));
            System.out.println("Deseja descobrir a raiz quadrada de algum número? X para sair");
            pergunta = s.next();
        }
    }
    
}
