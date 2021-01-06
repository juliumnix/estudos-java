package lista2;

import java.util.*;

public class exercicio1 {

	public static void main(String[] args) {
    
    Scanner S = new Scanner (System.in);

    System.out.println("Informe a nota 1");

    double nota1 = S.nextDouble();

    System.out.println("Informe a nota 2");

    double nota2 = S.nextDouble();
    
    System.out.println("Informe a nota 3");

    double nota3 = S.nextDouble();

    System.out.println("Informe o tipo de média");
    System.out.println("1 - Média aritmética");
    System.out.println("2 - Média ponderada");

    double opcao = S.nextInt();
  
    if (opcao==1) {
      double resultado = (nota1+nota2+nota3)/3;
      System.out.println("Sua nota é " + resultado);   
    

      if (resultado>=7) {
        System.out.println("parabéns você está aprovado!");
        }
      
          else 
        if (resultado<=1.8) {
        System.out.println("Você está reprovado!");
      }
      
          else
      System.out.println("Você está de recuperação!");

      
    }
      if (opcao==2) {
        System.out.println("Por favor insira os pesos");
        
        double peso1 = S.nextInt();
        double peso2 = S.nextInt();
        double peso3 = S.nextInt();

        double resultado2 = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1+peso2+peso3);  
        System.out.println("Sua nota é " + resultado2);

        if (resultado2>=7) {
          System.out.println("parabéns você está aprovado!");
          }
        
          else 
        if (resultado2<=1.8) {
          System.out.println("Você está reprovado!");
        }
        
          else
        System.out.println("Você está de recuperação!");
      }
  
  }
}
