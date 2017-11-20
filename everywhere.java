
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
public class everywhere {

    public static void main(String[] args) {

        
                Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int n2 = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < n2; j++) {
                String tmp = sc.nextLine();
                if (lista.indexOf(tmp) == -1) {
                    lista.add(tmp);
                }
            }
            System.out.println(lista.size());
            lista.clear();
        }
    }
}
