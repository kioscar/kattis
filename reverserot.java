
import java.util.ArrayList;
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
public class reverserot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        char alph[] = new char[alp.length()];
        String salida="";
        for (int i = 0; i < alp.length(); i++) {
            alph[i] = alp.charAt(i);
        }
        while(true){
            int n = sc.nextInt();
            if (n==0) {
                System.exit(0);
            }
            String tmp = sc.next();
            StringBuilder ss = new StringBuilder(tmp);
            ss.reverse();
            tmp = ss.toString();
            for (int i = 0; i < tmp.length(); i++) {
                int pos = alp.indexOf(String.valueOf(tmp.charAt(i)));
                if (tmp.charAt(i) == '.') {
                    pos=27;
                }
                int ds = pos + n;
                if (n+pos >= 28) {
                   pos=(pos)-28;
                }
                salida+=alph[pos+n]+"";
            }
            
            System.out.println(salida);
            salida="";
        }
    }
}
