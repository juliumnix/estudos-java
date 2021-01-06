package lista4;
import java.util.*;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Gostaria de calcular o consumo mensal? X para sair");
        String pergunta = s.next();
        double consumoTotal = 0;
        double contaTudo = 0;
        double maior = 0;
        double menor = 0;
        double consumo1 = 0;
        double consumo2 = 0;
        double consumo3 = 0;
        double maior500 = 0;

        while (!pergunta.equalsIgnoreCase("x")) {
            System.out.println("Informe o código do tipo do consumidor [1]residencial [2]comercial [3]industrial");
            int codigo = s.nextInt();
            System.out.println("Número do consumidor");
            double consumidor = s.nextDouble();
            System.out.println("informe o custo por kWh");
            double kWh = s.nextDouble();
            System.out.println("Quantos kWh gasto nesse mes");
            double consumo = s.nextDouble();
            
            consumoTotal+=consumo;
            contaTudo+=1;

            double totalPagar = kWh * consumo;
            ////////////////////////////////////////////////////

            if (maior == 0) {
                maior = consumo;
            }
            if (consumo > maior) {
                maior = consumo;
            }
            if (menor == 0) {
                menor = consumo;
            }
            if (consumo < menor) {
                menor = consumo;
            }
            ///////////////////////////////////////////////////
            if (codigo == 1) {
                consumo1 += consumo;
            }
            if (codigo == 2) {
                consumo2 += consumo;
            }
            if (codigo == 3) {
                consumo3 += consumo;
            }

            if (codigo == 1 && totalPagar >= 500) {
                maior500+=1;
                
            }
            ///////////////////////////////////////////////////
            System.out.println("O consumidor de número "+ consumidor + " deverá pagar "+ totalPagar);
            System.out.println("Gostaria de calcular o consumo mensal? X para sair");
            pergunta = s.next();

        }
        System.out.println("o maior consumo foi de "+ maior);
        System.out.println("o menor consumo foi de "+ menor);
        System.out.println("o total para cada tipo de consumidor: " + consumo1 + " residencial " + consumo2 + " comercial " + consumo3 + " industrial");
        System.out.println("a média geral é de "+ consumoTotal/contaTudo);
        System.out.println("o número de clientes do tipo residencial com valores maiores que 500 é de "+maior500);
    }
    
}
