package lista6;
import java.util.*;



public class exercicio14 {
    
    private static String taboada(int valor) {
        String tabuada = "";
        for (int i = 1; i <= valor; i++) {
            for (int j = 0; j <= 10 ; j++) {
                tabuada += String.valueOf(i) + " x " + String.valueOf(j) + " = " + String.valueOf(i*j) + "\n";
            }
            tabuada += "\n";
        }
        return tabuada;
    }
	
	public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        System.out.println("informe um valor");
        int valor = s.nextInt();
        
        String tabuFinal = taboada(valor);
        System.out.println(tabuFinal);
    }
}