

package estudos_caseiros;


public class estudo_objetos {


    public static void main(String[] args) {
       class conta{
        int numero;
        String titular;
        double saldo;
       }
       conta minhaConta;
       minhaConta = new conta( );
      
       
       minhaConta.titular =  "Duke";
       minhaConta.saldo = 1000.0;
       
      
       
       System.out.println("Saldo atual " + minhaConta.saldo);
    }
    
}
