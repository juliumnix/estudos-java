package lista6;
import java.util.*;


public class exercicio5 {


    private static int horas(int segundos) {
        

        int horas = segundos / 3600;

        
        
        return horas;
        
    }

    private static int minutos(int segundos) {
        

        int minutos = segundos % 3600;

        minutos = minutos / 60;

        return minutos;
        
    }

    private static int segundos(int segundos) {
        

        int minutos = segundos % 3600;
        

        int sec = minutos % 60;
        

        return sec;
        
    }


    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe o tempo em segundos");
        int tempo = s.nextInt();

        double hora = horas(tempo);
        double minuto = minutos(tempo);
        double segundo = segundos(tempo);

        System.out.println(hora + " hora " + minuto + " minuto "+ segundo);


    }
    
}
