
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
public class ladder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        double v = sc.nextInt();

        double angle = Math.toRadians(v);
        double salida = h / Math.sin(angle);
        System.out.println((int) Math.ceil(salida));
    }
}
