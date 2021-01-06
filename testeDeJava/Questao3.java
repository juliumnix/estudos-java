package testeDeJava;
import java.util.*;
import java.text.DecimalFormat;

public class Questao3 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0");
        s.useDelimiter(";");
        int[][] matriz = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                int valorDaMatriz = s.nextInt();
                matriz[i][j] = valorDaMatriz;
            }
            s.nextLine();
        }

        double somaDasColunas =0;

        for (int i = 0; i < matriz.length; i++) {
            somaDasColunas += matriz[i][2];
        }

        double somaDasLinhasPares = 0;
        for (int i = 1; i < matriz.length; i= i+2) {
            for (int j = 0; j < matriz[0].length; j++) {
                somaDasLinhasPares+= matriz[i][j];
            }
        }

        int contaImpar = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 1) {
                    contaImpar+=matriz[i][j];
                }
            }
        }

        int contaPar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j]%2==0) {
                    contaPar+=1;
                }
            }
        }

        System.out.println(d.format(somaDasColunas));
        System.out.println(d.format(somaDasLinhasPares));
        System.out.println(contaImpar);
        System.out.println(contaPar);

    }
    
}
