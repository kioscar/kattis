
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
public class different {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long n1 = sc.nextLong(), n2 = sc.nextLong();
            long salida = n1 - n2;
            System.out.println(Math.abs(salida));
            if (!sc.hasNextLong()) {
                System.exit(0);
            }
        }

    }
}
