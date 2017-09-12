
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
public class Bijele {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String numbers[];
        
        String cadena = sc.nextLine();
        
        numbers = cadena.split(" ");
        
        String salida  ="";
        
        String num = "112228";
        for (int i = 0; i < numbers.length; i++) {
            int tmpn = Integer.parseInt(numbers[i]), com = Integer.parseInt(String.valueOf(num.charAt(i)));
            
            salida+=com-tmpn+" ";
        }
        
        System.out.println(salida.trim());
    }
}
