package lista1;
import java.util.*;

public class exerciciolista8 {

    
    public static void main(String[] args) {
       Scanner s = new Scanner (System.in);
       System.out.println("digite um número inteiro");
       double num1 = s.nextDouble();
       System.out.println("digite um número inteiro");
       double num2 = s.nextDouble();
       System.out.println("digite um número inteiro");
       double num3 = s.nextDouble();
       System.out.println("digite um número inteiro");
       double num4 = s.nextDouble();
       System.out.println("digite um número inteiro");
       double num5 = s.nextDouble();

       double media = (num1 + num2 + num3 + num4 + num5) / 5;

       if (media < num1) {
          System.out.println("Sua média é " + media + " está abaixo de " + num1);
          
       }
       if (media < num2) {
         System.out.println("Sua média é " + media + " está abaixo de " + num2);
         
      }
      if (media < num3) {
         System.out.println("Sua média é " + media + " está abaixo de " + num3);
         
      }
      if (media < num4) {
         System.out.println("Sua média é " + media + " está abaixo de " + num4);
         
      }
      if (media < num5) {
         System.out.println("Sua média é " + media + " está abaixo de " + num5);
         
      }
      else
      System.out.println("Sua média é " + media);
       
 }
    
    
}
