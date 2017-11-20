
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
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float n1 = sc.nextFloat(), n2= sc.nextFloat(), n3 = sc.nextFloat();
        
        float s = (n1+n2+n3)/2;
        
        double area = Math.sqrt(s*(s-n1) * (s-n2) * (s-n3));
        System.out.printf("Side 1: \t%.4f%nSide 2: \t%.4f%nSide 3: \t%.4f%nArea : \t%.4f%n", n1, n2, n3, area);
    }
}
