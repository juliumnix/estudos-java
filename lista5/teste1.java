package lista5;
import java.util.*;

public class teste1 {
    public static void main (String[] args) {
        int[][] Matriz = new int[6][6];
    int soma = 0;
        
    for (int lin = 0; lin < Matriz[0].length; lin++){
        for (int col = 0; col < Matriz[0].length; col++)
            Matriz[lin][col] = 1;

    }
    for (int lin = 0; lin < Matriz.length; lin ++) {
        System.out.println("");
        for (int col = 0; col < Matriz[0].length; col ++){ 
            System.out.print(Matriz[lin][col] + " ");
        }
    }
        
    for (int lin = 0; lin < Matriz[0].length/2; lin++){
        for (int col = 0; col < Matriz[0].length/2; col++){
            soma += Matriz[lin][col]; 
            Matriz[lin][col] = 0;       
        }
    }

    for (int col = Matriz[0].length/2; col < Matriz[0].length; col++){
         for (int lin = Matriz[0].length/2; lin < Matriz[0].length; lin++){
            soma += Matriz[lin][col];
            Matriz[lin][col] = 0;
        }
    }
    
    System.out.println(""); 
    System.out.println(""); 

System.out.print("o somatório dos dois quadrantes da matriz é de "+ soma);

    System.out.println("");
    for (int lin = 0; lin < Matriz.length; lin ++) {
        System.out.println("");
        for (int col = 0; col < Matriz[0].length; col ++){ 
            System.out.print(Matriz[lin][col] + " ");
        }
    }

 }
}
