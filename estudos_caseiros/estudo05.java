package estudos_caseiros;


public class estudo05 {

    
    public static void main(String[] args) {
        int x = 0;
        int y = 100;
        
        for(int i = x; i < y; i++){
            if(i % 19 == 0){
                System.out.println("Achei um número divísível por 19 entre x e y\no número é " + i);
                break;
            }
            
            
        }
        
    }
    
}
