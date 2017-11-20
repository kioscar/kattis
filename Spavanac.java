
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
public class Spavanac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(), m = sc.nextInt();

        int ms;

        ms = m - 45;
        if (ms < 0) {
            h--;
            ms += 60;
        }
        if (h < 0) {
            h = 23;

        }
        System.out.println(h + " " + ms);
    }
}
