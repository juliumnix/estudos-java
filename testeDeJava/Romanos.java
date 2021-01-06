package testeDeJava;
import java.util.*;

public class Romanos {

    static int converterChar(char caractere){
        int total = 0;
        String valorInterno = Character.toString(caractere);
        if (valorInterno.equals("M") ) {
            total = 1000;
        }
        if (valorInterno.equals("D")) {
            total = 500;
        }
        if (valorInterno.equals("C") ){
            total = 100;
        }
        if (valorInterno.equals("L")) {
            total = 50;
        }
        if (valorInterno.equals("X")) {
            total = 10;
        }
        if (valorInterno.equals("V")) {
            total = 5;
        }
        if (valorInterno.equals("I")) {
            total = 1;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] letras = null;
        System.out.println("informe o seu valor em romanos");
        String romano = s.next();

        letras = romano.toCharArray();

        /*for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }*/

        int maximo = letras.length;
        int aux = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == 'I') {
                if (i == maximo -1) {
                    aux += 1;
                    break;
                }
                    if (letras[i+1] == 'V') {
                        aux += 4;
                        break;
                    }else{
                        if (letras[i+1] == 'X') {
                            aux += 9;
                            break;
                        }
                    }
                }
            if (letras[i] == 'X') {
                if (i == maximo -1) {
                    aux += 10;
                    break;
                }
                if (letras[i+1] == 'C') {
                    aux += 90;
                    
                    break;
                }
            }

            if (letras[i] == 'C') {
                if (i == maximo -1) {
                    aux += 10;
                    break;
                }
                if (letras[i+1] == 'M') {
                    aux += 900;
                    i+=1;
                    continue;
                }
            }
            
            
                aux += converterChar(letras[i]); 
            }
            System.out.println(aux);
            
        }
        
    }
    

