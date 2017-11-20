
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
public class peg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char board[][] = new char[7][7];
        int salida = 0;
        for (int i = 0; i < 7; i++) {
            String tmp = sc.nextLine();
            for (int j = 0; j < 7; j++) {
                board[i][j] = tmp.charAt(j);
            }

        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (!(board[i][j] == ' ')) {
                    if ((board[i][j] == 'o')) {
                        
                        if (j <= 4 && board[i][j + 1] == 'o') {
                            if (board[i][j + 2] == '.') {
                                salida++;
                            }
                        } 
                        if (j >= 2 && board[i][j - 1] == 'o') {//Se verifica a la izquierda
                            if (board[i][j - 2] == '.') {
                                salida++;
                            }
                        } 
                        if (i >= 2 && board[i-1][j]=='o') {//Se verifica hacia arriba
                            if (board[i-2][j]=='.') {
                                salida++;
                            }
                        } 
                        if (i <= 4 && board[i+1][j] == 'o') {//Se verifica hacia abajo
                            if (board[i+2][j]=='.') {
                                salida++;
                            }
                        }
                    }

                }
            }
        }
        System.out.println(salida);
    }
}
