
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
public class leftbeehind {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        while(true){
            int x = sc.nextInt(), y = sc.nextInt();
            
            if (x==0 && y ==0) {
                System.exit(0);
            }
            String salida="";
            if (x==y) {
                salida="";
                salida="Undecided.";
            }
            if (x<y) {
                salida="";
                salida="Left beehind.";
            }
            if (x>y) {
                salida="";
                salida="To the convention.";
            }
            if (x+y == 13) {
                salida="";
                salida="Never speak again.";
            }
            
            System.out.println(salida);
        }
    }
}
