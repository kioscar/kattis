
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
public class mixedfractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            
            if (n1==0 && n2==0) {
                System.exit(0);
            }
            int entero=0;
            int residuo=0;
            if (n1>=n2) {
                entero = n1/n2;
                residuo = n1%n2;
                System.out.println(entero +" " + residuo + " / "+ n2);
            }else{
                System.out.println("0" + " " + n1 + " / " + n2);
            }
            
            
        }
        
    }
}
