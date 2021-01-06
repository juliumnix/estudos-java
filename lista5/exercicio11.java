package lista5;
import java.util.*;


public class exercicio11 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int [] lista = new int[5];
      
      for (int i = 0; i < lista.length; i++) {
        System.out.println("INFORME UM VALOR");
        lista[i] = s.nextInt();
      }
      int iguais = 0;
      for (int i = 0; i < lista.length; i++) {
          for (int j = 1; j < lista.length; j++) {
              if (lista[i]==lista[j]&& i!=j) {
                System.out.println("os valores de indice "+ i + " e " + j+ " são iguais");
                iguais +=1;
              }
          }
      }
      System.out.println("o total de valores repetidos são "+ iguais);
    }
    
}
