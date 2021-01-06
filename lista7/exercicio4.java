package lista7;
import java.util.*;

public class exercicio4 {

    private static String calcula(double massaInicial) {
        String tudo = "";
        int tempo = 0;
        double metade_massa = massaInicial/2;
        while (metade_massa >= 0.5) {
            metade_massa = metade_massa/2;
            tempo+=1;
        }

        int tempoFinal = tempo * 50;
////////////////////////////////////////////////////////////
        int hora = tempoFinal /3600;
        
        int minuto = tempoFinal % 3600;
        int minutoFinal = minuto /60;
        
        int sec = minuto % 60;
//////////////////////////////////////////////////////////////        
        
        tudo = String.valueOf(tempoFinal) + " é o tempo final, " + String.valueOf(hora) + " horas " + 
        String.valueOf(minutoFinal) + " minutos " + String.valueOf(sec)+ " segundos para se decompor até 0,5 gramas " + " a massa inicial é de " + massaInicial 
        + " e a massa final foi de " + metade_massa;
        return tudo;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe a massa a ser convertida");
        double massa = s.nextDouble();

        String finalTudo = calcula(massa);
        System.out.println(finalTudo);
    }
    
}
