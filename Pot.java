
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        
        long salida=0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String cad = sc.nextLine();
            
            
            String pow = String.valueOf( cad.charAt(cad.length()-1));
            int pot =Integer.parseInt(pow);
            
            cad = cad.subSequence(0, cad.length()-1).toString();
            
            salida += Math.pow(Long.parseLong(cad), pot);
            
        }
        
        System.out.println(salida);
    }
}
