
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
public class oddmanout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salida = 0;
        int n = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList();

        for (int i = 0; i < n; i++) {
            int can = sc.nextInt();

            for (int j = 0; j < can; j++) {
                int tmp = sc.nextInt();
                lista.add(tmp);
            }

            for (int j = 0; j < lista.size(); j++) {
                int tmp = lista.get(j);
                salida = tmp;
                int pos1, pos2;
                pos1 = lista.indexOf(tmp);

                pos2 = lista.lastIndexOf(tmp);

                if (pos1 == pos2) {
                    System.out.println("Case #" + (i + 1) + ": " + salida);
                    break;
                }

            }

            lista.clear();
        }
    }
}
