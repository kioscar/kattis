
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
public class aboveaverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            int number = sc.nextInt();
            float suma=0;
            float []lista = new float[number];
            
            for (int j = 0; j < number; j++) {
                float tmp = sc.nextFloat();
                suma+=tmp;
                lista[j]=tmp;
            }
            float promedio = suma/number;
            int con=0;
            for (int j = 0; j < number; j++) {
                if (lista[j]>promedio) {
                    con++;
                }
            }
            
            float salida = (float)con*100/number;
            System.out.printf("%.3f",salida);
            System.out.print("%\n");
        }
    }
}
