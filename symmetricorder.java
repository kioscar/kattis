
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
public class symmetricorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int con =1;
        while(true){
            int set= sc.nextInt();
            if (set==0) {
                System.exit(0);
            }
            String arreglo[] = new String[set];
            int inicio =0;
            int fin = set-1;
            sc.nextLine();
            for (int i = 0; i < set; i++) {
                String nombre = sc.nextLine();
                if (i%2==0) {
                    arreglo[inicio]=nombre;
                    inicio++;
                }else{
                    arreglo[fin]=nombre;
                    fin--;
                }
            }
            System.out.println("SET " + con);
            for(String ad:arreglo){
                System.out.println(ad);
            }            
            con++;
        }
    }
}
