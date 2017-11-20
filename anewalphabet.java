
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
public class anewalphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //   while(true){
        String cadena = sc.nextLine();
        
        cadena = cadena.toLowerCase();
        cadena= cadena.replaceAll("a", "@");
        cadena= cadena.replaceAll("b", "8");
        cadena= cadena.replaceAll("c", "(");
        cadena= cadena.replaceAll("d", "|)");
        cadena= cadena.replaceAll("e", "3");
        cadena= cadena.replaceAll("f", "#");
        cadena= cadena.replaceAll("g", "6");
        cadena= cadena.replaceAll("h", "[-]");
        cadena= cadena.replaceAll("i", "|");
        cadena= cadena.replaceAll("j", "_|");
        cadena= cadena.replaceAll("k", "|<");
        cadena= cadena.replaceAll("l", "1");
        cadena= cadena.replaceAll("m", "[]\\\\/[]");
        cadena= cadena.replaceAll("n", "[]\\\\[]");
        cadena= cadena.replaceAll("o", "0");
        cadena= cadena.replaceAll("p", "|D");
        cadena= cadena.replaceAll("q", "(,)");
        cadena= cadena.replaceAll("r", "|Z");
        cadena= cadena.replaceAll("s", "\\$");
        cadena= cadena.replaceAll("t", "']['");
        cadena= cadena.replaceAll("u", "|_|");
        cadena= cadena.replaceAll("v", "\\\\/");
        cadena= cadena.replaceAll("w", "\\\\/\\\\/");
        cadena= cadena.replaceAll("x", "}{");
        cadena= cadena.replaceAll("y", "`/");
        cadena= cadena.replaceAll("z", "2");
        
        System.out.println(cadena);
       // }
    }
}
