
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
public class onechicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), m = sc.nextInt();
        
        int resultado = m-n;
        
        if (resultado<0) {
            resultado = resultado* (-1);
            if (resultado==1) {
                System.out.println("Dr. Chaz needs "+resultado+" more piece of chicken!");
            }else{
                System.out.println("Dr. Chaz needs "+resultado+" more pieces of chicken!");
            }
        }else{
            if (resultado==1) {
                System.out.println("Dr. Chaz will have "+resultado+" piece of chicken left over!");
            }else{
                System.out.println("Dr. Chaz will have "+resultado+" pieces of chicken left over!");
            }
        }
        
    }
}
