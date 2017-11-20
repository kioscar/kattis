
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
public class simonsays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String tmp[];
            String cadena = sc.nextLine();

            tmp = cadena.split(" ");

            if (tmp.length < 2) {

            } else {
                String com = tmp[0] + " " + tmp[1];
                if ("Simon says".equals(com)) {
                    String cad = "";
                    for (int j = 2; j < tmp.length; j++) {
                        cad += tmp[j] + " ";
                    }
                    System.out.println(cad.trim());
                }
            }
        }
    }
}
