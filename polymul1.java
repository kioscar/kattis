
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
public class polymul1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int n = sc.nextInt();
        String salida="";
        
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int []pol1 =  new int[n1+1];
            
            for (int j = n1; j >=0; j--) {
                pol1[j]= sc.nextInt();
            }
            int n2 = sc.nextInt();
            int []pol2 =  new int[n2+1];
            for (int j = n2; j >= 0; j--) {
                pol2[j] = sc.nextInt();
            }
            
            int n3 = n1+n2+1;
            int []pol3 = new int[n3];

            for (int j = 0; j < pol1.length; j++) {
                for (int k = 0; k < pol2.length; k++) {
                    pol3[j+k] += pol1[j]*pol2[k];
                }
            }

           salida =  salida.concat(String.valueOf(n3-1) + "\n");
            for (int j = pol3.length-1; j >=0; j--) {
             salida = salida.concat(String.valueOf(pol3[j]) + " ");
            }

            salida = salida.concat("\n");
        }
        System.out.println(salida);
    }
}
