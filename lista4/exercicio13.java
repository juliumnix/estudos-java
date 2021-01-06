package lista4;

public class exercicio13 {


    public static void main(String[] args) {
        int ano = 0;
        double a = 5000000;
        double b = 7000000;
        double resulA = 0;
        double resulB = 0;
        while (a<b) {
            resulA = a * 0.03;
            a = a+resulA;
            resulB = b * 0.02;
            b = b+resulB;
            ano +=1;
        }
        System.out.println(ano);
    }
    
}
