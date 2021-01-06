package lista5;
import java.util.*;


public class desafio {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [][] matriz = new String [3][3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.println("Informe um valor para a matriz ["+linha+"]["+coluna+"]");
                matriz[linha][coluna] = s.next();
                matriz[linha][coluna].charAt(linha);
            }
        }
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.println("");
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]+ " ");
            }
        }
    }
    
}
