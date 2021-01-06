package lista6;
import java.util.*;


public class exercicio3 {

    private static String primo(int numero) {
        int contaDivisores = 0;
        int contaPrimos = 0;
        String letra = "";
        if (numero > 2) {
            
                for (int x = 2; x < (numero/2)+1; x++) {
                    int resto = numero % x;
                    if (resto == 0) 
                        contaDivisores+=1;
                }
                    if (contaDivisores == 0) {
                        contaPrimos +=1;
                }
        }
        
        if (contaPrimos>= 1) {
            letra = "v";
        } else{
            letra = "f";
        }

        return letra; 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("informe um valor");
        int valor = s.nextInt();

        String resultado = primo(valor);

        System.out.println(resultado);
    }
    
}
