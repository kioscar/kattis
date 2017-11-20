
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
public class veci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.nextLine();
        
        int tam=n.length();
        String ta="1";
        ArrayList<String> lista = new ArrayList();
        ArrayList<String> tmp = new ArrayList();
        
        for (int i = 0; i < tam; i++) {
            ta+="0";
            lista.add(String.valueOf(n.charAt(i)));
            tmp.add(String.valueOf(n.charAt(i)));
        }
        
        tam = Integer.parseInt(ta)-1;
        
        for (int i = Integer.parseInt(n)+1; i < tam; i++) {
            String val = String.valueOf(i);
            
            for (int j = 0; j < val.length(); j++) {
                String pp = String.valueOf(val.charAt(j));
                //if (!n.contains(String.valueOf(val.charAt(j)))) {
                if(!((lista.indexOf(String.valueOf(val.charAt(j))))!=-1)){
                    break;
                }else{
                    lista.remove(lista.indexOf(String.valueOf(val.charAt(j))));
                   // if (n.contains(String.valueOf(val.charAt(val.length()-1)))) {
                   if(lista.indexOf(String.valueOf(val.charAt(val.length()-1))) !=-1 && lista.size()==1){
                        System.out.println(i);
                        System.exit(0);
                    }
                }
            }
            lista.clear();
            for (int j = 0; j < tmp.size(); j++) {
                lista.add(tmp.get(j));
            }
        }
        System.out.println(0);
    }
}
