package lista5;
import java.text.DecimalFormat;
import java.util.*;


public class exercicio_aula_Array {

    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("R$ #0.00");
        Scanner s = new Scanner(System.in);
        int [] listaNumeros = new int[5];

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Informe um valor para a posição de indice "+ i);
            listaNumeros[i] = s.nextInt();
        }

        int maiorValor = listaNumeros[0];
        int menorValor = listaNumeros[0];
        int impares = 0;
        int pares = 0;

        if (maiorValor == 1 && menorValor == 1) {
            impares +=1;
        }
           
            for (int i = 1; i < listaNumeros.length; i++) {
                
                if (listaNumeros[i] > maiorValor) {
                    maiorValor = listaNumeros[i];
                }
                if (listaNumeros[i] < menorValor) {
                    menorValor = listaNumeros[i];
                }
                if (listaNumeros[i] % 2 == 0) {
                    pares +=1;
                }else{
                    impares +=1;
                }
            }


    System.out.println("O maior valor é: "+ maiorValor);
    System.out.println("O menor valor é: "+ menorValor);
    System.out.println("O número de valore ímpares é de: "+ impares);


    System.out.println("FIM");
    }
    
}
