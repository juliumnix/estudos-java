package testeDeJava;
import java.util.*;

public class Questao5 {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int valor = s.nextInt();
        int [] sequencia = new int [valor];

        


        switch (valor) {
            case 0:{
                break;
            }
            case 1:{
                System.out.println(0);
                break;
            }
            case 2: {
                System.out.println(1);
                break;
            }
            case 3: {
                System.out.println(2);
                break;
            }
                
                
        
            default:
            sequencia [0]= 0;
            sequencia [1]= 1;
            sequencia [2]= 2;
                for (int i = 3; i < sequencia.length; i++) {
                    sequencia[i] = sequencia[i-1] + sequencia[i-3];
                    //System.out.println(sequencia[i]);
                }
                System.out.println(sequencia[valor-1]);
        }
    }
    
}
