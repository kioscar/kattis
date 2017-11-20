
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
public class Tri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        String cadena = "";

        if ((n1 + n2) == n3) {
            cadena += n1 + "+" + n2 + "=" + n3 + "\n";
        }
        if ((n1 - n2) == n3) {
            cadena += n1 + "-" + n2 + "=" + n3 + "\n";
        }
        if ((n1 * n2) == n3) {
            cadena += n1 + "*" + n2 + "=" + n3 + "\n";
        }
        if (n2 != 0) {
            if ((n1 / n2) == n3) {
                cadena += n1 + "/" + n2 + "=" + n3 + "\n";
            }
        }

        if (n1 == (n2 + n3)) {
            cadena += n1 + "=" + n2 + "+" + n3 + "\n";
        }
        if (n1 == (n2 - n3)) {
            cadena += n1 + "=" + n2 + "-" + n3 + "\n";
        }
        if (n1 == (n2 * n3)) {
            cadena += n1 + "=" + n2 + "*" + n3 + "\n";
        }
        if (n3 != 0) {
            if (n1 == (n2 / n3)) {
                cadena += n1 + "=" + n2 + "/" + n3 + "\n";
            }
        }

        System.out.println(cadena.trim());
    }
}
