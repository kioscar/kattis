
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar Hernández
 */
public class Easiest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {


            String N = sc.next();
            int Nt = 0;
            for (int i = 0; i < N.length(); i++) {
                Nt += Integer.parseInt(String.valueOf(N.charAt(i)));
            }

            int cont = 11;

            while (true) {
                int t=Integer.parseInt(N);
                if (t==0) {
                    System.exit(0);
                }
                int tmp = t * cont;

                String tm = String.valueOf(tmp);
                tmp=0;
                for (int i = 0; i < tm.length(); i++) {
                    tmp += Integer.parseInt(String.valueOf(tm.charAt(i)));
                }
                
                if (Nt==tmp) {
                    System.out.println(cont);
                    cont=0;
                    break;
                }
                cont++;
            }
        }
    }
}
