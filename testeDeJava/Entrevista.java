package testeDeJava;
import java.util.*;
import java.text.DecimalFormat;

public class Entrevista {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        
        int contaVoltas = 0;
        int contaCidade = 0;
        double contaSexo = 0;
        double somaIdades = 0;
        String menorIdade = "";
        String b = "";
        String nome ="";
        int idade = 0;
        String sexo = "";
        int menor = 0;
        int contaIdade = 0;
        String cidade;

        while (!nome.equalsIgnoreCase("fim")) {
            
            
            System.out.println("informe o nome do aluno");
            nome = s.nextLine();
            if (nome.equals("fim")) {
                break;
            }
            System.out.println("informe a idade");
            idade = s.nextInt(); s.nextLine();
            System.out.println("informe seu sexo");
            sexo = s.nextLine();
            System.out.println("informe sua cidade");
            cidade = s.nextLine();
           
            if (menor == 0 ) {
                menor = idade;
                menorIdade = nome;
            }
            if (idade<menor) {
                menor = idade;
                menorIdade = nome;
            }

            if (idade >= 18 && idade <= 20 ) {
                contaIdade+=1;
            }
            
            if (cidade.equals("Ibirama") ) {
                contaCidade+=1;
            }
            if (sexo.equals("F")) {
                contaSexo+=1;
            }
            contaVoltas+=1;
            somaIdades += idade;

            
           
            
            
        }
        double mediaMeninas = contaSexo/contaVoltas;
        double mediaMeninas2 = mediaMeninas *100;

        double media = somaIdades/contaVoltas;

        System.out.println("Menor idade: "+ menorIdade);
        System.out.println("Quantidade 18-20: "+ contaIdade);
        System.out.println("Média idade: "+ d.format(media));
        System.out.println("Percentual feminino: "+ d.format(mediaMeninas2));
        System.out.println("Nascidos em Ibirama: "+ contaCidade);

    }
    
}
