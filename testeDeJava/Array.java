package testeDeJava;
import java.text.DecimalFormat;
import java.util.*;

public class Array {


    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("0.00");
        int [] listaNumeros = new int[15];
        Scanner s = new Scanner(System.in);
        
		
		s.useDelimiter(";");
		
		while(s.hasNext()){
            for (int i = 0; i < listaNumeros.length; i++) {
                listaNumeros[i] = s.nextInt();
            }
            break;
        }
        s.close();
        
        int menorValor = listaNumeros[0];
        int posicao = 0;
        int posicaoSalva = 0;
        double media = 0;
        int contaAcima=0;

        for (int i = 0; i < listaNumeros.length; i++) {
            media += listaNumeros[i];

        if (listaNumeros[i] < menorValor) {
            menorValor = listaNumeros[i];
            posicaoSalva = posicao;
            }
        
        posicao+=1; 
        }

        double conta = media / 15;

        for (int i = 0; i < listaNumeros.length; i++) {
            

            if (listaNumeros[i]>=conta) {
                contaAcima+=1;
            }
        
        
        }

        
        System.out.println("Média: "+d.format(conta));
        System.out.println("Qtd. >= média: "+contaAcima);
        System.out.println("Menor valor: "+menorValor);
        System.out.println("Posição menor: "+posicaoSalva);


        
    }
    
}
