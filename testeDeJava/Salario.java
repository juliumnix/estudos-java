
package testeDeJava;

import java.util.*;
import java.math.*;
import java.text.DecimalFormat;

public class Salario {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        
        System.out.println("informe o nome do individuo");
        String nome = s.nextLine();
        System.out.println("informe as horas trabalhas");
        double horaTrabalhada = s.nextInt();
        System.out.println("informe o valor das horas trabalhadas");
        double valorTrabalhado = s.nextDouble();
        System.out.println("informe o numero de filhos");
        double filhos = s.nextInt();

        double trabalhado = horaTrabalhada * valorTrabalhado;
        
        double filhoFinal = filhos * 0.03;
        double resultado = trabalhado * filhoFinal;

        System.out.print(nome+": "+d.format(resultado + trabalhado));

    }
    
}
