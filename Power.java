
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
public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = "";
        int cont = 0;

        while (sc.hasNextLine() & cont != 10) {
            /*            if (!sc.hasNext()) {
            System.exit(0);
            }
            int pot = 0;
            String cadena = sc.next();
            if (cadena == null) {
            break;
            }
            String cmp = "a";
            for (int i = 0; i < cadena.length(); i++) {
            if (i > 0 && cmp.equals(String.valueOf(cadena.charAt(i)))) {
            break;
            }
            tmp += String.valueOf(cadena.charAt(i));
            
            }
            cont++;
            String tm = "";
            ArrayList<String> lista = new ArrayList<>();
            
            for (int i = 0; i < cadena.length(); i++) {
            tm += String.valueOf(cadena.charAt(i));
            
            if (tm.equals(tmp)) {
            pot++;
            tm = "";
            
            }
            }
            
            tmp = "";
            System.out.println(pot);*/

            if (!sc.hasNext()) {
                System.exit(0);
            }
            String cadena = sc.next();
            int pot = 0;
            ArrayList<Integer> lista = new ArrayList();
            int temp = 0;
            for (int i = 0; i < cadena.length(); i++) {
                if ("a".equals(String.valueOf(cadena.charAt(i)))) {
                    pot++;
                } else {
                    lista.add(temp);
                    temp = 0;
                }
            }
            //lista.add(temp);
            //pot = Collections.max(lista);

            System.out.println(pot);
            cont++;
        }

    }
}
