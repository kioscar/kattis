
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
public class aaah {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String l1  = sc.nextLine();
        String l2  = sc.nextLine();
        
        if (l1.length() < l2.length()) {
            System.out.println("no");
        }else{
            System.out.println("go");
        }
    }
}
