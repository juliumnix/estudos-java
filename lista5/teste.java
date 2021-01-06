package lista5;
import java.util.*;

public class teste {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int[] listaNumeros = new int[10];
        
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("informe um valor qualquer");
            listaNumeros[i] = s.nextInt();
        }

        int aux = listaNumeros[2] - listaNumeros[1];
        
        int total = 0;
        for (int i = 1; i < listaNumeros.length+1; i++) {
          int valor = aux * i;
          if (valor == 0) {
            valor = 1;
          }
          if (valor == listaNumeros[i-1]) {
            System.out.println("o valor de indice " + i + " está correto");
            total+=1;
          } else{
            System.out.println("o valor de indice " + i + " está incorreto");
            System.out.println("o valor não estão perfeitamente sequenciais");
            break;
          }
        }
        if (total == listaNumeros.length) {
          System.out.println("todos os valores estão devidamente ordenados.");
        }

		
	}

      
  }
  