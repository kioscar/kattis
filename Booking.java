
import java.util.Arrays;
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
public class Booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt(), n = sc.nextInt();
        
        int room[] = new int[r];
        Arrays.fill(room, 0);
        
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            room[tmp-1]=1;
        }

        for (int i = 0; i < room.length; i++) {
            if (room[i]==0) {
                System.out.println(i+1);
                System.exit(0);
            }
        }
        System.out.println("too late");
    }
}
