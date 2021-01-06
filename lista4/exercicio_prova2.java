package lista4;
import java.util.*;


public class exercicio_prova2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            double bananaSoma = 0;
            double sucoLimaoSoma = 0;
            double acucarSoma = 0;
            double manteigaSoma= 0;

        System.out.println("Deseja avaliar sua receita de bala de banana? X para sair");
        String informa = s.next();
        while (!informa.equalsIgnoreCase("x")) {
            System.out.println("informe em KG a quantidade de banana caturra ou branca para a receita");
            double banana = s.nextDouble();
            System.out.println("informe em colheres de sopa a quantidade de suco de limão");
            double sucoLimao = s.nextDouble();
            System.out.println("informe em gramas a quantidade de açucar cristal");
            double acucar = s.nextDouble();
            System.out.println("informe em gramas a quantidade de manteiga");
            double manteiga = s.nextDouble();
            
            bananaSoma+=banana;
            sucoLimaoSoma+=sucoLimao;
            acucarSoma+=acucar;
            manteigaSoma+=manteiga;

            if (banana == 1&&sucoLimao >=2 && sucoLimao<=4&& acucar>=800&&acucar<=900 && manteiga>=100&& manteiga<=120) {
                System.out.println("Parabéns sua receita está correta");
            }else{
                System.out.println("Receita incorreta");
            }
            System.out.println("a quantidade da banana em KG é "+ banana);
            System.out.println("a quantidade de suco de limão em colheres de sopa é "+ sucoLimao);
            System.out.println("a quantidade de açucar cristal em gramas é "+ acucar);
            System.out.println("a quantidade de manteiga em gramas é de "+ manteiga);

            System.out.println("Deseja novamente avaliar sua receita de bala de banana? X para sair");
            informa = s.next();
            
        }
        System.out.println("a quantidade total de banana foi de "+bananaSoma+" em KG");
        System.out.println("a quantidade total de suco de limão foi de "+sucoLimaoSoma+" em colheres");
        System.out.println("a quantidade total de açucar cristal foi de "+acucarSoma+ " em gramas");
        System.out.println("a quantidade total de manteiga foi de "+manteigaSoma+ " em gramas");



    }
    
}
