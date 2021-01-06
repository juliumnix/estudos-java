package lista4;


public class exercicio12 {
    public static void main(String[] args) {
        int numero = 25;
        int soma = 0;
        while (numero<=200) {
            int resul = numero%2;
            if (resul == 0) {
                soma +=numero;
                
            }
            
            numero+=1;
        }
        System.out.println(soma);
    }
    
}
