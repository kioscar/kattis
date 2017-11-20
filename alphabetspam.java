
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
public class alphabetspam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        int total = line.length();
        
        int blank=0, lc=0, up=0, sym=0;
        
        for (int i = 0; i < line.length(); i++) {
            String tmp = String.valueOf(line.charAt(i));
            
            if (Character.isLowerCase(line.charAt(i))) {
                lc++;
            }else if(Character.isUpperCase(line.charAt(i))){
                up++;
            }else if(tmp.equals("_")){
                blank++;
            }else{
                sym++;
            }
        }
        
        double s1 , s2 ,s3 ,s4;
        
        s1 =  (double)blank/ (double)total;
        s2 =  (double)lc / (double)total ;
        s3 =  (double)up / (double)total;
        s4 =  (double)sym / (double)total;
        
        System.out.printf("%.16f %n %.16f %n %.16f %n %.16f %n ", s1 , s2, s3 , s4);
    }
}
