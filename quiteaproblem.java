
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
public class quiteaproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            
            String cad = sc.nextLine();
            
            cad = cad.toLowerCase();
            if (cad.contains("problem")) {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
