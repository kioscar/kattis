
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
public class differentdistances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {            
            float x1 = sc.nextFloat();
            if (x1==0.0) {
                System.exit(0);
            }
            float y1 = sc.nextFloat(), x2=sc.nextFloat(), y2=sc.nextFloat(), p=sc.nextFloat();
            
            double salida = Math.pow((Math.pow((Math.abs(x1-x2)), p)) + (Math.pow(Math.abs(y1-y2), p)), 1/p);
            System.out.printf("%.10f %n", salida);
        }
    }
}
