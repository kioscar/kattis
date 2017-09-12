
import java.util.ArrayList;
import java.util.Collection;
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
public class Akcija {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> lista = new ArrayList();
        for (int i = 0; i < n; i++) {
            lista.add(sc.nextInt());
        }

        Collections.sort(lista);

        int vueltas = lista.size() / 3;//Sirve para indicar cuantos grupos de 3 son 
        int restante = n - (vueltas * 3); //Indica los elementos que se quedaran solos
        int con = 0; // Indica cuantas cueltas van (es decir cuantos grupos de 3)
        int cn = 0;//Contador para indicar grupos de 2
        int suma = 0;
        for (int i = lista.size() - 1; i >= 0; i--) {
            if (cn == 2) {
                con++;
                cn=0;
                i--;
            }

            if (vueltas == con) {
                break;
            }
            cn++;
            suma += lista.get(i);
            
            lista.remove(lista.size() - 1);
        }
        for (int i = 0; i < restante; i++) {
            suma += lista.get(i);
        }
        System.out.println(suma);
    }
}
