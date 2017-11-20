
import java.util.Scanner;

public class apaxian {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cadena1=null, cadena2="";
        
        cadena1=sc.nextLine();
        for (int i = 0; i < cadena1.length()-1; i++) {      
            if (!(cadena1.charAt(i)==cadena1.charAt(i+1))) {
                cadena2+=cadena1.charAt(i);
            }
        }
        cadena2+=cadena1.charAt(cadena1.length()-1);
        System.out.println(cadena2);
    }
}
