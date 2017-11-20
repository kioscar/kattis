
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
public class speedlimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int salida=0;
            int n = sc.nextInt();
            
            if (n==-1) {
                System.exit(0);
            }
            int tmp=0;
            for (int i = 0; i < n; i++) {
                
                int s = sc.nextInt();
                int t = sc.nextInt();
                
                if (i>0) {
                    int valor = t-tmp;
                    salida+=s*valor;
                }else{
                    salida+= s*t;
                }
                tmp=t;
            }
            System.out.println(salida+" miles");
            
        }
    }
}
