package lista4;
import java.util.*;


public class exercicio4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Deseja fazer um levantamento de um curso específico? X para sair");
        String confirma = s.next();
        double candiVaga = 0;
        int maiorCurso = 0;

        while (!confirma.equalsIgnoreCase("X")) {
            System.out.println("Digite o codigo curso");
            int curso = s.nextInt();
            System.out.println("Digite o número de vagas para o curso");
            double vagas = s.nextDouble();
            System.out.println("Digite o número de candidatos homens para o curso");
            double homens = s.nextDouble();
            System.out.println("Digite o número de candidatos mulheres para o curso");
            double mulher = s.nextDouble();

            double candidatos = homens+mulher;
            double numCandi = vagas/candidatos;

            double numMulher = (100 * mulher)/candidatos;

            System.out.println("o número de candidados por vaga " + numCandi);
            System.out.println("a porcetagem de mulher é de " + numMulher + "% e o código do curso é " + curso);
            System.out.println("Deseja fazer um levantamento de um curso específico? X para sair");
            confirma = s.next();
            if (numCandi>=candiVaga) {
                candiVaga = numCandi;
                maiorCurso = curso;
            }
            

        }
        System.out.println("fim");
        System.out.println("O curso com maior numero de vagas por candidato é " + candiVaga + " e seu número é "+ maiorCurso);
    }

    
}
