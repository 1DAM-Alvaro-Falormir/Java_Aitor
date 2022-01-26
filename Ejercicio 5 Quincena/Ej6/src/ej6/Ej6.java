/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class Ej6 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num;
        boolean neg = false;
        System.out.println("Introduce 10 numeros no nulos y el programa te dira si has puesto algun negativo.");
        for (int i = 0; i < 10; i++) {
            num = entry.nextInt();
            if (num < 0) {
                neg = true;
            }
        }
        if (neg == false){
            System.out.println("No se han leido numeros negativos");
        }
        else {
            System.out.println("Se han leido numeros negativos");
        }
    }

}
