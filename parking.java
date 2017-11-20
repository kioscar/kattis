
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
public class parking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int a1, a2, b1, b2, c1, c2;
        int menor = 0, mayor = 0;

        a1 = sc.nextInt();
        a1++;
        menor = a1;
        if (a1 <= menor) {
            menor = a1;
        }
        a2 = sc.nextInt();
        mayor = a2;
        if (a2 >= mayor) {
            mayor = a2;
        }
        b1 = sc.nextInt();
        b1++;
        if (b1 <= menor) {
            menor = b1;
        }
        b2 = sc.nextInt();
        if (b2 >= mayor) {
            mayor = b2;
        }
        c1 = sc.nextInt();
        c1++;
        if (c1 <= menor) {
            menor = c1;
        }
        c2 = sc.nextInt();
        if (c2 >= mayor) {
            mayor = c2;
        }
        //Se empiezan a comparar
        int salida = 0;

        for (int i = menor; i <= mayor; i++) {
            int con = 0;

            if (i >= a1 && i <= a2) {
                con++;
            }
            if (i >= b1 && i <= b2) {
                con++;
            }
            if (i >= c1 && i <= c2) {
                con++;
            }

            switch (con) {
                case 1:
                    salida += a; 
                    break;
                case 2:
                    salida += b*2;
                    break;
                case 3:
                    salida += c*3;
                    break;

            }
        }
        
        System.out.println(salida);
    }
}
