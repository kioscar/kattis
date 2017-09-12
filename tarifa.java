
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
public class tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int n = sc.nextInt();
        
        int salida = 0;
        
        
        for (int i = 0; i < n; i++) {
           int tmp=sc.nextInt();
           
            if (i==0) {
                salida += num-tmp;
            }else{
                salida-=tmp;
            }
            
            salida+=num;
        }
        
        System.out.println(salida);
    }
}
