package testeDeJava;
import java.util.*;
import java.text.DecimalFormat;

public class Matriz {


    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);

        int[][] Matriz = new int[5][5];
        int soma = 0;
        int somaLinha = 0;
        int somaColuna = 0;
        int somaInverte = 0;
        int coluna = 0;
        int somaTudo = 0;

        s.useDelimiter(";");
        
        Matriz[0][0] = s.nextInt();
        Matriz[0][1] = s.nextInt();
        Matriz[0][2] = s.nextInt();
        Matriz[0][3] = s.nextInt();
        Matriz[0][4] = s.nextInt();s.nextLine();

        Matriz[1][0] = s.nextInt();
        Matriz[1][1] = s.nextInt();
        Matriz[1][2] = s.nextInt();
        Matriz[1][3] = s.nextInt();
        Matriz[1][4] = s.nextInt();s.nextLine();

        Matriz[2][0] = s.nextInt();
        Matriz[2][1] = s.nextInt();
        Matriz[2][2] = s.nextInt();
        Matriz[2][3] = s.nextInt();
        Matriz[2][4] = s.nextInt();s.nextLine();

        Matriz[3][0] = s.nextInt();
        Matriz[3][1] = s.nextInt();
        Matriz[3][2] = s.nextInt();
        Matriz[3][3] = s.nextInt();
        Matriz[3][4] = s.nextInt();s.nextLine();

        Matriz[4][0] = s.nextInt();
        Matriz[4][1] = s.nextInt();
        Matriz[4][2] = s.nextInt();
        Matriz[4][3] = s.nextInt();
        Matriz[4][4] = s.nextInt();s.nextLine();
            
        for (int col = 0; col < Matriz[3].length; col++) {
            //System.out.println(Matriz[3][col]);
            soma += Matriz[3][col];
        }  

        for (int lin = 0; lin < Matriz[0].length; lin++) {
           // System.out.println(Matriz[lin][1]);
            somaLinha += Matriz[lin][1];
        }  

        for (int lin = 0; lin < Matriz[0].length; lin++){
        for (int col = 0; col < Matriz[0].length; col++)
            if (Matriz[lin] == Matriz[col]) {
                somaColuna += Matriz[lin][col];
            }

    }

        coluna = 4;
        for (int lin = 0; lin < Matriz[0].length; lin++){
            
                somaInverte += Matriz[lin][coluna];
                coluna = coluna - 1;

    }
    for (int lin = 0; lin < Matriz[0].length; lin++) {
        for (int col = 0; col < Matriz[0].length; col++){
            somaTudo += Matriz[lin][col];
        }

    }
    

        System.out.println(soma);
        System.out.println(somaLinha);
        System.out.println(somaColuna);
        System.out.println(somaInverte);
        System.out.println(somaTudo);

        

        
    /*for (int lin = 0; lin < Matriz[0].length; lin++){
        System.out.println("");
        for (int col = 0; col < Matriz[0].length; col++)
            System.out.print(Matriz[lin][col] + " ");

    }*/


    }
    
}