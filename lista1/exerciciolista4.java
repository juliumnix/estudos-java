package lista1;
import java.util.*;

public class exerciciolista4 {

    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int soma = 0;
       System.out.println("informe o prato principal [1] veg [2] peixe [3] frango [4] carne");
       int opcao = s.nextInt();
       if (opcao == 1){
           
           soma = 180;
       
       }
       else
           if(opcao == 2){
               
               soma = 230; 
           }
       else
               if(opcao == 3){
                   soma = 250;
               }
       else
           soma = 350;
       
       System.out.println("Informe sobremesa");
       System.out.println("[1] abacaxi [2] sorv diet [3]m.diet [4] m.chocolate");
       int opcao2 = s.nextInt();
       
       if (opcao2 == 1){
       
           soma = soma + 75;
           }
       else
           if(opcao2 == 2){
           
               soma = soma + 110;   
           }
       else
               if(opcao2 == 3){
               
               soma = soma + 170;
               }

       else
            soma = soma + 200;
                       
                   System.out.println("[1] cha [2] s. laranja [3] s.melão [4] refri");
                   int opcao3 = s.nextInt();
                   
                  if(opcao3 == 1){
                  
                      soma = soma + 20;
                      
                  }
                  else
                      if(opcao3 == 2 ){
                      
                      soma = soma + 70;
                      }
                  else
                          if(opcao3 == 3){
                          soma = soma + 100;
                          }
                          
                  else
                              soma = soma + 65;
                  System.out.println("vc vai consumir " + soma + "calorias");
    }              
    
    
    
    
}
