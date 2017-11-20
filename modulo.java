
import java.util.ArrayList;
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
public class modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();
        int con=0;
        for (int i = 0; i < 10; i++) {
            int tmp = sc.nextInt();//se guarda el número
            int mo= tmp%42;//Se obtiene el residuo.
            if (lista.isEmpty()) {
                lista.add(mo);//Se agrega a la lista.
            }else{
                if (!(lista.indexOf(mo) != -1)) {
                    lista.add(mo);
                }
            }
        }
        System.out.println(lista.size());
    }
}
