package exemplos;

//3 variaveis média simples, usando condicional, reprovado, sumariamente reprovado, aprovado.

public class exercicio1 {

	public static void main(String[] args) {
    double nota1 = 1.8;
    double nota2 = 1.8;
    double nota3 = 1.8;
    
    double result = (nota1+nota2+nota3)/3;
    
    System.out.println("Média " + result);

    if (result>=7) {
      System.out.println("parabéns você está aprovado!");
      }
    
      else 
    if (result<=1.8) {
      System.out.println("Você está reprovado!");
    }
    
      else
    System.out.println("Você está de recuperação!");
    
 }
}