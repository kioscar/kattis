
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
public class tri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();

        String salida = "";

        if ((n1 + n2) == n3) {//Sumas
            salida = n1 + "+" + n2 + "=" + n3 + "\n";
        }
        if (n1 == (n2 + n3)) {
            salida = n1 + "=" + n2 + "+" + n3 + "\n";
        }
        //restas
        if ((n1 - n2) == n3) {
            salida = n1 + "-" + n2 + "=" + n3 + "\n";
        }
        if (n1 == (n2 - n3)) {
            salida = n1 + "=" + n2 + "-" + n3 + "\n";
        }
        //Multiplicación
        if ((n1 * n2) == n3) {
            salida = n1 + "*" + n2 + "=" + n3 + "\n";
        }
        if (n1 == (n2 * n3)) {
            salida = n1 + "=" + n2 + "*" + n3 + "\n";
        }
        if (n1 == (n2 / n3)) {
            salida = n1 + "=" + n2 + "/" + n3 + "\n";
        }

        if ((n1 / n2) == n3) {
            salida = n1 + "/" + n2 + "=" + n3 + "\n";
        }
        //Lado derecho la suma

        System.out.println(salida.trim());
    }
}
