package lista2;

import java.util.*;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Quantos dias voce tem?");
        int dias = s.nextInt();
        
        int anos = 0;
        int meses = 0;
        
        if (dias >= 365) {
            anos = dias / 365;
            dias = dias % 365;
        }
        if (dias >= 30) {
            meses = dias / 30;
            dias = dias % 30; 
        }
        if ((anos > 0) & (meses > 0) & (dias > 0)) {
            System.out.println("Voce tem " + anos + "anos, " + meses + "meses, " + dias + " dias.");
            
        }
        else
        if ((anos > 0)&(meses == 0)&(dias == 0)) {
            System.out.println("Voce tem " + anos + " anos");
        }
        else
        if ((anos == 0)&(meses > 0)&(dias == 0)) {
            System.out.println("Voce tem " + meses + " meses");
        }
        else
        if ((anos == 0)&(meses == 0)&(dias > 0)) {
            System.out.println("Voce tem " + dias + " dias");
        }
        else
        if ((anos > 0)&(meses > 0)&(dias == 0)) {
            System.out.println("Voce tem " + anos + " anos, e " + meses + " meses");
        }
        else
        if ((anos > 0)&(meses == 0)&(dias > 0)) {
            System.out.println("Voce tem " + anos + " anos, e " + dias + " dias");
        }
        else
        if ((anos == 0)&(meses > 0)&(dias > 0)) {
            System.out.println("Voce tem " + meses + " meses, e " + dias + " dias");
        }
    }
    
}
