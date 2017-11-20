
import java.util.ArrayList;
import java.util.Collections;
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
public class Zamka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt(), d = sc.nextInt(), x = sc.nextInt();
        int n, m;
        ArrayList<Integer> lista = new ArrayList();

        for (int i = l; i <= d; i++) {
            String tmp = String.valueOf(i);
            int tm = 0;
            for (int j = 0; j <= tmp.length() - 1; j++) {
                String t = String.valueOf(tmp.charAt(j));
                tm += Integer.parseInt(t);
            }
            if (tm == x) {
                lista.add(i);
            }
        }

        m = Collections.max(lista);
        n = Collections.min(lista);

        System.out.println(n + "\n" + m);

    }
}
