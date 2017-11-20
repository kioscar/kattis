
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
public class Towering {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numbers[];

        String entrada = sc.nextLine();

        numbers = entrada.split(" ");

        int peso1 = Integer.parseInt(numbers[numbers.length - 2]);
        int peso2 = Integer.parseInt(numbers[numbers.length - 1]);
        ArrayList<Integer> lista1 = new ArrayList();
        ArrayList<Integer> lista2 = new ArrayList();
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 2; j++) {
                for (int k = j + 1; k < numbers.length - 2; k++) {
                    if ((Integer.parseInt(String.valueOf(numbers[i]))) + (Integer.parseInt(String.valueOf(numbers[j]))) + (Integer.parseInt(String.valueOf(numbers[k]))) == peso1) {
                        lista1.add(Integer.parseInt(String.valueOf(numbers[i])));
                        lista1.add(Integer.parseInt(String.valueOf(numbers[j])));
                        lista1.add(Integer.parseInt(String.valueOf(numbers[k])));
                    } else if ((Integer.parseInt(String.valueOf(numbers[i]))) + (Integer.parseInt(String.valueOf(numbers[j]))) + (Integer.parseInt(String.valueOf(numbers[k]))) == peso2) {
                        lista2.add(Integer.parseInt(String.valueOf(numbers[i])));
                        lista2.add(Integer.parseInt(String.valueOf(numbers[j])));
                        lista2.add(Integer.parseInt(String.valueOf(numbers[k])));
                    }
                }
            }
        }
        Collections.sort(lista1);
        Collections.sort(lista2);
        String salida = "";
        for (int i = 0; i < lista2.size(); i++) {
            salida = lista2.get(i) + " " + salida;
        }
        for (int i = 0; i < lista1.size(); i++) {
            salida = lista1.get(i) + " " + salida;
        }

        System.out.println(salida.trim());
    }
}
