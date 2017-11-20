
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
public class sevenwonders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        int T = 0, G = 0, C = 0;
        for (int i = 0; i < line.length(); i++) {
            if (null != String.valueOf(line.charAt(i))) {
                switch (String.valueOf(line.charAt(i))) {
                    case "T":
                        T++;
                        break;
                    case "G":
                        G++;
                        break;
                    case "C":
                        C++;
                        break;
                    default:
                        break;
                }
            }

        }
        int salida = (T * T) + (G * G) + (C * C);
        int con=0;
        
        while(T!=0 || G!= 0 || C!=0){
            if(T>0&&G>0&&C>0){
                con++;
                T--;
                G--;
                C--;
            }else{
                break;
                
            }
        }
        System.out.println(salida+(con*7));
    }
}
