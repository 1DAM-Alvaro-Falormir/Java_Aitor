/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundirlaflota_aitor;

import java.util.Scanner;

/**
 *
 * @author aitgal
 */
public class Tablero {

    public static char[][] crearTablero() {
        char tablero[][] = new char[10][10];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
        return tablero;
    }

    public static void mostrarTablero(char[][] tablero) {
        char eje = '@';
        System.out.print("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < tablero.length; i++) {
            eje += 1;
            System.out.print("\n" + eje);
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(" " + tablero[i][j]);
            }
        }
        System.out.println("");
    }

    public static int disparo(char[][] tablero, char[][] usuario) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        String disparo, index;
        int index1, index2;
        System.out.println("Introduzca la posicion donde va a disparar en este formato (N-N)");
        System.out.println("La posicion va desde 0 hasta 9");
        System.out.println("La posicion A es 0");
        disparo = sc.next();
        do {
            if (disparo.matches("\\d-\\d")) {
                exit = false;
            } else {
                System.err.println("Formato equivocado, vuelva a intentarlo");
                disparo = sc.next();
                exit = true;
            }
        } while (exit);
        index = disparo.substring(0, 1);
        index1 = Integer.valueOf(index);
        index = disparo.substring(2);
        index2 = Integer.valueOf(index);

        if (tablero[index1][index2] == 'L') {
            System.out.println("\nHundido\n");
            usuario[index1][index2] = 'X';
            return 1;
        } else if (tablero[index1][index2] == '-') {
            System.out.println("\nAgua\n");
            usuario[index1][index2] = 'A';
        }
        return 0;
    }
}
