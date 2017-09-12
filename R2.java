
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
public class R2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int salida=0;
        
        int r1 = sc.nextInt(), s = sc.nextInt();
        
        salida = s*2-r1;
        
        
        System.out.println(salida);
    }
}
