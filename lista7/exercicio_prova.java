package lista7;
import java.util.*;

public class exercicio_prova {


	private static void calcula(String[] palavraChave, String[] listaAleatorias){
		int contaLetras = 0;
		
		for (int i = 0; i < palavraChave.length; i++){
			for (int x = 0; x < listaAleatorias.length; x++){
				if (palavraChave[i] == (listaAleatorias[x])) {
					contaLetras++;
					listaAleatorias[x] = "0";
					break;
				}
			}
		}
		if (contaLetras == 6) {
			System.out.println("CONTÉM");
		}
		else{
			System.out.println("NÃO CONTÉM");
		}	
	}
    public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				
				String[] arrayPalvra = {"M","A","C","A","C","O"};
        String[] arrayLetra = {"A","C","H","M","I","Y","Y","F","J","Q","O","P","X","C","A"};


				calcula(arrayPalvra, arrayLetra);


        
    }
    
}
