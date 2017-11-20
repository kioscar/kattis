
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
public class rijeci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0, b = 0;
        int tmp1a = 0, tmp1b = 1;
        int tmp2a = 1, tmp2b = 1;
        for (int i = 0; i < n; i++) {
            if (i != 0 && i != 1) {
                a = tmp1a + tmp2a;
                b = tmp1b + tmp2b;

                if (i % 2 == 0) {
                    tmp1a = a;
                    tmp1b = b;
                } else {
                    tmp2a = a;
                    tmp2b = b;
                }
            }

        }
        if (n==1) {
             System.out.println(0 + " " + 1);
        }else if(n==2){
            System.out.println(1 + " " + 1);
        }else{
            System.out.println(a + " " + b);
        }
        
    }
}
