package estudos_caseiros;
import java.util.*;


public class senha01 {
    public static void main(String[] args) {
        int [] senha = new int [5];
        Scanner s  = new Scanner(System.in);

        System.out.println("deseja infomar a senha? X para cancelar");
        String cancelar = s.next();

        while (!cancelar.equalsIgnoreCase("x")) {
            System.out.println("informe a senha");
            senha[0] = s.nextInt();
            senha[1] = s.nextInt();
            senha[2] = s.nextInt();
            senha[3] = s.nextInt();
            if (senha[0] == 10) {
                if (senha[1] == 20) {
                    if (senha[2] == 30) {
                        if (senha[3] == 40) {
                            System.out.println("ACESSO AUTORIZADO");
                            break;
                        }
                    }else{
                        System.out.println("ACESSO NEGADO");
                    }
                }else{
                    System.out.println("ACESSO NEGADO");
                }
            }else{
                System.out.println("ACESSO NEGADO");
            }
            
            System.out.println("deseja infomar a senha? X para cancelar");
            cancelar = s.next();

        }
        
    }
    
}
