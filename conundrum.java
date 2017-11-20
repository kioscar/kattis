
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
public class conundrum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();

        int total = cadena.length();
        int n = 0;

        for (int i = 0; i <= cadena.length() - 1; i++) {

            switch (n) {
                case 0:
                    if ("P".equals(String.valueOf(cadena.charAt(i)))) {
                        total--;
                    }   break;
                case 1:
                    if ("E".equals(String.valueOf(cadena.charAt(i)))) {
                        total--;
                    }   break;
                case 2:
                    if ("R".equals(String.valueOf(cadena.charAt(i)))) {
                        total--;
                    }   break;
                default:
                    break;
            }
            n++;
            if (n>2) {
                n=0;
                
            }
            
        }
        System.out.println(total);
    }
}
