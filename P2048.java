
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
public class P2048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        int dir = sc.nextInt();

        switch (dir) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        System.out.println();
    }
}
