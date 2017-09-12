
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
public class Grass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float c = sc.nextFloat();

        int l = sc.nextInt();
        float salida=0.0f;
        
        for (int i = 0; i < l; i++) {
            float w = sc.nextFloat(), li = sc.nextFloat();
            
            salida+=w*li;
        }
        
        System.out.printf("%.8f%n", salida*c);
    }
}
