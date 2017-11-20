
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
public class oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            
            if (tmp%2==0) {
                System.out.println(tmp+" is even");
            }else{
                System.out.println(tmp+" is odd");
            }
        }
    }
}
