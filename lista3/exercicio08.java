package lista3;
import java.util.*;


public class exercicio08 {
    public static void main(String[] args) {

        double bom = 0;
        double otimo = 0;
        double excelente = 0;
        double exemplar = 0;
        double soma10= 0;
        
        

        Scanner s = new Scanner (System.in);
         for (int i = 1; i <= 5; i++) {
             System.out.println("escreva a nota 1");
             double nota1 = s.nextDouble();
             System.out.println("escreva a nota 2");
             double nota2 = s.nextDouble();
             System.out.println("escreva a nota 3");
             double nota3 = s.nextDouble();
             System.out.println("escreva a nota 4");
             double nota4 = s.nextDouble();

             double media = (nota1 + nota2 + nota3+ nota4)/4;
             boolean somaverdade = false;
             boolean primeiro_caso = false;
             boolean segundo_caso = false;
             boolean terceiro_caso = false;
             boolean quarto_caso = false;
             boolean quinto_caso = false;
             boolean sexto_caso = false;

               if  (nota1 + nota2 ==20 || nota1 + nota3 ==20 ||nota1 + nota4 == 20 || nota2 + nota3 == 20 || nota2 + nota4 == 20 || nota3 + nota4 == 20  ) {
                for (int j = 1; j <= 1; j++) {
                    somaverdade = true; 
                    if (nota1 + nota2 == 20) {
                        primeiro_caso = true;
                        
                    }
                    if (nota1 + nota3 == 20) {
                        segundo_caso = true;
                    }
                    if (nota1 + nota4 == 20) {
                        terceiro_caso = true;
                    }
                    if (nota2 + nota3 == 20) {
                        quarto_caso = true;
                    }
                    if (nota2 + nota4 == 20) {
                        quinto_caso = true;
                    }
                    if (nota3 + nota4 == 20) {
                        sexto_caso = true;
                        
                    }
                    if (primeiro_caso = true) {
                        System.out.println("O aluno exemplar número " + i + " tirou nota 10 no primeiro e no segundo bimestre");  
                    }
                    if (segundo_caso = true) {
                        System.out.println("O aluno exemplar número " + i + " tirou nota 10 no primeiro e no terceiro bimestre");   
                    }
                    if (terceiro_caso = true) {
                        System.out.println("O aluno exemplar número " + i + " tirou nota 10 no primeiro e no quarto bimestre");
                    }
                    if (quarto_caso = true) {
                        System.out.println("O aluno exemplar número " + i + " tirou nota 10 no segundo e no terceiro bimestre");
                    }
                    if (quinto_caso = true) {
                        System.out.println("O aluno exemplar número " + i + " tirou nota 10 no segundo e no quarto bimestre");
                    }
                    if (sexto_caso = true) {
                        System.out.println("O aluno exemplar número " + i + " tirou nota 10 no terceiro e no quarto bimestre");
                    }
                }
                soma10 +=1;
                
                
            }


                if (media >= 7.0 && media <= 7.9) {
                bom +=1;
            }
                if (media >= 8.0 && media <= 8.9) {
                otimo +=1;
            }
                if (media >= 9.0 && media <= 10 && somaverdade == false) {
                excelente +=1;
            }
                if (media >= 9.0 && media <= 10 && somaverdade == true) {
                exemplar +=1;
            }
                

            

             
         }

         System.out.println("o numero de alunos que obtiveram a honra pelo bom aproveitamento são " + bom);
         System.out.println("a porcentagem de alunos com nota a honra de aluno exemplar é de " + (exemplar * 100) / 5 +"%");
    }
    
}
