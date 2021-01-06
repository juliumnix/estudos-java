package lista5;
import java.util.*;


public class exercicio3 {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int [] listaNumeros = new int[16];

		for (int i = 0; i < listaNumeros.length; i++) {
				System.out.println("informe um valor qualquer");
				listaNumeros[i] = s.nextInt();
		}
		int metade = (listaNumeros.length/2)-1;
		for (int i = 0; i <= metade; i++) {
			int aux = listaNumeros[i];
			listaNumeros[i]=listaNumeros[i+8];
			listaNumeros[i+8]= aux;
		}
		for (int i = 0; i < listaNumeros.length; i++) {
				System.out.println(listaNumeros[i]);
		}
		System.out.println("fim");
	}

}

