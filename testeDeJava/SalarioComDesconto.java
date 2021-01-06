package testeDeJava;
import java.util.*;
import java.math.*;
import java.text.DecimalFormat;

public class SalarioComDesconto {

    public static double calcularINSS (double valor){
        
        if(valor > 1000){
            double tudo = 0;
            double conta = (valor * 0.09);
            //System.out.println("valor de visualização " + conta);
            
            
            tudo = conta;
            return tudo;  
        }else{
            double tudo = 0;
            double conta = (valor * 0.085);
            
            tudo = conta;
            return tudo; 
        }
        
        
    }

    public static double calcularIR (double valor){
        double tudo = 0;
        
        if(valor>500 && valor<=1000){
            
            double conta = (valor * 0.05);
            tudo = conta;
            return tudo;
        }
        if(valor > 1000){
            
            double conta = (valor * 0.07);
            tudo = conta;
            return tudo;
        }
        return tudo;
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        
        //System.out.println("informe o nome do individuo");
        String nome = s.nextLine();
        //System.out.println("informe as horas trabalhas");
        double horaTrabalhada = s.nextInt();
       // System.out.println("informe o valor das horas trabalhadas");
        double valorTrabalhado = s.nextDouble();
       // System.out.println("informe o numero de filhos");
        double filhos = s.nextInt();

        double trabalhado = horaTrabalhada * valorTrabalhado;
        
        double filhoFinal = filhos * 0.03;
        double resultado = trabalhado * filhoFinal;
        double resultadoFinal = (resultado + trabalhado);

        
        
       

       double conta1 = calcularIR(resultadoFinal);
       double conta2 = calcularINSS(resultadoFinal);
       

       double somaDesconto = conta1 + conta2;
       double subtraiTotal = resultadoFinal - somaDesconto;

      /* System.out.println(d.format(resultadoFinal));
       System.out.println(d.format(conta1));
       System.out.println(d.format(conta2));
       System.out.println(d.format(subtraiTotal));
*/
       System.out.println(nome + ";"+d.format(resultadoFinal) +";"+d.format(conta2) + ";"+d.format(conta1) + ";"+d.format(subtraiTotal) );
       



    }
    
}
