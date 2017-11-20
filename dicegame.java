
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
public class dicegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma1=0, suma2=0;
        
        for (int i = 0; i < 4; i++) {
            suma1+= sc.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            suma2+= sc.nextInt();
        }
        
        if (suma1 > suma2) {
            System.out.println("Gunnar");
        }else if (suma2 > suma1) {
            System.out.println("Emma");
        }else{
            System.out.println("Tie");
        }
    }
}
