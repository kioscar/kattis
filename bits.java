
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
public class bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            String num= String.valueOf(tmp);
            String nu="";
            int mayor=0;
            int unos=0;
            for (int j = 0; j < num.length(); j++) {
                 nu += String.valueOf(num.charAt(j));
                 
                 String ones = Integer.toBinaryString(Integer.parseInt(nu));
                 
                 for (int k = 0; k < ones.length(); k++) {
                    
                     if ("1".equals(String.valueOf(ones.charAt(k)))) {
                         unos++;
                     } else {
                     }
                }
                if (unos>mayor) {
                    mayor=unos;
                }
                unos=0;
            }
            System.out.println(mayor);
        }
    }
}
