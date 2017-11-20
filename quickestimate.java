
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
public class quickestimate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            
            String tmp =sc.nextLine();
            
            System.out.println(tmp.length());
            
        }
    }
}
