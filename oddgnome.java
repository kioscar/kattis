
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
public class oddgnome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int fst=0;
            int tmp =0;
            String []numeros;
           
            String linea = sc.nextLine();
            numeros = linea.split(" ");
            for (int j = 1; j < numeros.length; j++) {
                if (j==1) {
                    fst=Integer.parseInt(numeros[j]);
                }else{
                    tmp = Integer.parseInt(numeros[j]);
                    if (tmp-fst != 1) {
                        System.out.println(j);
                        break;
                    }
                    fst = tmp;
                }
            }
        }
    }
}
