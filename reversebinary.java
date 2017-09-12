
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
public class reversebinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        //int res =-1;
        
        String salida = Integer.toBinaryString(numero);
        /*        while(numero!=1){
        
        res = numero%2;
        numero = numero/2;
        cadena = res + cadena;
        }
        cadena = numero + cadena;*/
       StringBuilder sb = new StringBuilder(salida);
      
       
       salida =  sb.reverse().toString();
       
       int salir=0;
       int con=0;
        for (int i = salida.length()-1; i >= 0; i--) {
            int tmp = (int)Math.pow(2, con);
            //Integer.parseInt(String.valueOf(salida.charAt(i)));
            if (Integer.parseInt(String.valueOf(salida.charAt(i))) == 1) {
                salir += tmp * 1;
            }
            con++;
        }
        System.out.println(salir);
    }
}
