
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
public class detaileddifferences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String tmp1 = sc.nextLine();
            String tmp2 = sc.nextLine();

            System.out.println(tmp1);
            System.out.println(tmp2);
            for (int j = 0; j < tmp1.length(); j++) {
                if (tmp1.charAt(j) == tmp2.charAt(j)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();

        }
    }
}
