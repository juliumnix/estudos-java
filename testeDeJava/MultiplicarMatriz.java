package testeDeJava;
import java.util.*;

public class MultiplicarMatriz {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("informe a quantidade de linhas da matriz");
        int lin1 = s.nextInt();
        s.nextLine();
        System.out.println("informe a quantidade de colunas da matriz");
        int col1 = s.nextInt();

        int [][] matriz1 = new int[lin1][col1];

        
        s.useDelimiter(";");
        for (int linha = 0; linha < matriz1.length; linha++) {
            s.nextLine();
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                
                matriz1[linha][coluna] = s.nextInt();
            }
            
        }
        

        
        s.useDelimiter("\n");
        s.nextLine();
        System.out.println("informe a quantidade de linhas da matriz 2");
        int lin2 = s.nextInt();
        s.nextLine();
        System.out.println("informe a quantidade de colunas da matriz 2");
        int col2 = s.nextInt();
        

        int [][] matriz2 = new int[lin2][col2];
        s.nextLine();
        for (int linha = 0; linha < matriz2.length; linha++) {
            s.useDelimiter(";");
            for (int coluna = 0; coluna < matriz2[0].length; coluna++) {
                
                matriz2[linha][coluna] = s.nextInt();
            }
            s.nextLine();
        }
        
        
        

        if(col1 == lin2){
            int linhacoluna = 0;

		int[][] matriz3 = new int[lin1][col2];

		for (int linhamatriz = 0; linhamatriz < matriz3.length; linhamatriz++) {
			for (int colunamatriz = 0; colunamatriz < matriz3[0].length; colunamatriz++) {
				for (linhacoluna = 0; linhacoluna < matriz1[0].length; linhacoluna++) {
					matriz3[linhamatriz][colunamatriz] = matriz3[linhamatriz][colunamatriz]
							+ (matriz1[linhamatriz][linhacoluna] * matriz2[linhacoluna][colunamatriz]);

				}
				linhacoluna = 0;
			}
                
            }

                for (int linha = 0; linha < matriz3.length; linha++) {
			System.out.println("");

			for (int coluna = 0; coluna < matriz3[0].length; coluna++) {
				System.out.print(matriz3[linha][coluna] + ";");
			}
		}
        }else{
            System.out.println("Impossível multiplicar");
        }
		
    }
    
}
