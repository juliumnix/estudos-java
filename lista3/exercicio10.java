package lista3;
import java.util.*;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double candidatos_comercio = 0;
        double candidatos_industria = 0;
        double candidatos_aptos1 = 0;
        double candidatos_inaptos1 = 0;
        double candidatos_aptos2 = 0;
        double candidatos_inaptos2 = 0;
        double candidatos_aptos3 = 0;
        double candidatos_inaptos3 = 0;
        
        for (int i = 1; i <= 300; i++) {
            System.out.println("A qual vaga gostaria de concorrer? [1] comércio [2] industria" );
            double vaga = s.nextDouble();
            if (vaga == 1) {
                System.out.println("Reside na cidade ou não? [1] sim [2] não");
                double cidade = s.nextDouble();
                candidatos_comercio+=1;
                if(cidade == 1){
                    System.out.println("Possui segundo grau completo? [1] sim [2] não");
                    double grau = s.nextDouble();
                        if (grau == 1) {
                            System.out.println("Possui experiencia comprovada? [1] sim [2] não");
                            double exp = s.nextDouble();
                            if (exp == 1) {
                                System.out.println("Parabéns você está apto a vaga de comércio");
                                candidatos_aptos1+=1;
                                
                            }else{
                                System.out.println("Voce não está apto pois não possui experiencia comprovada");
                                candidatos_inaptos1+=1;
                            } 
                        }else{
                            System.out.println("Você não está apto pois não possui segundo grau completo");
                            candidatos_inaptos1+=1;
                        }
                }else{
                    System.out.println("Você não está apto pois não mora na cidade");
                    candidatos_inaptos1+=1;
                }
                
            }else {
                System.out.println("Voce quer concorrer a vaga de operacional ou de gerencia? [1] operacional [2] gerencia");
                double vaga2 = s.nextDouble();
                candidatos_industria+=1;
                if (vaga2 == 1) {
                    System.out.println("Possui segundo grau completo? [1] sim [2] nao");
                    double grau2 = s.nextDouble();

                    if (grau2 == 1) {
                        System.out.println("Parabéns voce está apto a vaga de operacional");
                        candidatos_aptos2+=1;
                        
                    }else{
                        System.out.println("Voce não está apto pois não possui segundo grau completo");
                    candidatos_inaptos2+=1;
                    }
                    
                }else{
                    
                    if (vaga2 == 2) {
                        System.out.println("Voce possui ensino superior completo? [1] sim [2] nao");
                        double superior = s.nextDouble();
                        if (superior == 1) {
                            System.out.println("Voce possui experiencia comprovada? [1] sim [2] nao");
                            double exp2 = s.nextDouble();
                            if (exp2 == 1 ) {
                                System.out.println("Parabéns voce esta apto ao cargo de gerente");
                                candidatos_aptos3+=1;
                                
                            }
                            
                        }else{
                            System.out.println("Voce não esta apto, pois não possui experiencia comprovada");
                            candidatos_inaptos3+=1;
                        }
                        
                    }else{
                        System.out.println("Voce não esta apto pois não possui superior completo");
                        candidatos_inaptos3+=1;
                    }    
                }   
                }   

            
        }

        System.out.println("Ao todo "+ candidatos_comercio +  " participaram da seletiva pro comercio");
        System.out.println("Ao todo "+ candidatos_industria + " participaram da seletiva pela industria");
        System.out.println("O percentual de inaptos é de " + (candidatos_inaptos1*100)/300 + "% para a area do comercio" );
        System.out.println("O percentual de inaptos é de " + (candidatos_inaptos2*100)/300 + "% para a area do operacional");
        System.out.println("O percentual de inaptos é de " + (candidatos_inaptos3*100)/300 + "% para a area de gerencia");
        System.out.println("O total de candidatos aptos para a area de comercio foi de " + candidatos_aptos1); 
        System.out.println("O total de candidatos aptos para a area de operacional foi de " + candidatos_aptos2);
        System.out.println("O total de candidatos aptos para a area de gerencia foi de " + candidatos_aptos3);
    }
    
}
