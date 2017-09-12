
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
public class Volim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int label = sc.nextInt(), n = sc.nextInt();
        
        int posicion =label;
        
        int tmp=0;
        for (int i = 0; i < n; i++) {
            int tiempo = sc.nextInt();
            String p = sc.next();
            tmp+=tiempo;
            if (tmp >= 210) {
                System.out.println(posicion);
                System.exit(0);
            }
            if ("T".equals(p)) {
                posicion++;
                if (posicion>8) {
                    int t = posicion;
                    posicion = t-8;
                }
            }
        }
        
    }
}
