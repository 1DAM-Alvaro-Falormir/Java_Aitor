/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author ciber
 */
public class Ej13 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int random;
        random = (int) (1 + Math.random() * 100);
        char pista;
        System.out.println("Piensa un numero entre el 1 y 100 y el programa lo intentara adivinar, tendras que decirle si el numero es mayor, menor o igual.");

        do {
            System.out.println(random);
            System.out.println("¿Es el numero mayor '+', menor '-' o igual '='?");
            pista = entry.next().charAt(0);
            if (pista == '+') {
                random = (int) (random + (Math.random() * 100));
            } else if (pista == '-') {
                random = (int) (1 + (Math.random() * random));
            } else {
                System.out.println("tu numero era: " + random);
            }

        } while (pista != '=');

    }

}
