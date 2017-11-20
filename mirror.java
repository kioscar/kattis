
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
public class mirror {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            sc.nextLine();
            String arreglo[][] = new String[n1][n2];
            for (int j = 0; j < n1; j++) {
                
                char arr[];
                String cad = sc.nextLine();
                arr = cad.toCharArray();
                for (int l = 0; l < arr.length; l++) {
                    arreglo[j][l] = String.valueOf(arr[l]);
                }
               
            }
             System.out.println("Test "  + (i+1));
             
             for (int j = n1-1; j >= 0; j--) {
                 for (int k = n2-1; k >=0; k--) {
                     System.out.print(arreglo[j][k]);
                 }
                 System.out.println();
            }
        }
    }
}
