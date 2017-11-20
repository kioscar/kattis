
import java.util.ArrayList;
import java.util.Collections;
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
public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3;
        String cad = "";

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        
        
        sc.nextLine();
        cad = sc.nextLine();

        ABC m = new ABC();

        ArrayList numeros = m.ordenar(n1, n2, n3);
        String n="";
        for (int i = 0; i < cad.length(); i++) {
            switch (cad.charAt(i)) {
                case 'A':
                    n+=numeros.get(0)+" ";
                    break;
                case 'B':
                    n+=numeros.get(1)+" ";
                    break;
                case 'C':
                    n+=numeros.get(2)+" ";
                    break;
                default:
                    break;
            }
        }
        
        System.out.println(n.trim());

    }

    ArrayList ordenar(int n1, int n2, int n3) {

        ArrayList<Integer> numeros = new ArrayList();

        numeros.add(n1);
        numeros.add(n2);
        numeros.add(n3);

        Collections.sort(numeros);

        return numeros;
    }
}
