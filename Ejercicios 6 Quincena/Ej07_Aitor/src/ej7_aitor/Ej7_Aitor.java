/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7_aitor;

import java.util.*;

/**
 *
 * @author aitor Crea un programa que pida dos valores enteros P y Q, luego cree
 * un array que contenga todos los valores desde P hasta Q, y lo muestre por
 * pantalla.
 */
public class Ej7_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, q, i = 0, range = 0, between;
        int num[];

        System.out.println("Bienvenido a un programa donde introduce dos valores y un vector se llena con los valores de en medio.");

        System.out.print("Introduce el primer valor: ");
        p = sc.nextInt();

        System.out.print("Introduce el ultimo valor: ");
        q = sc.nextInt();

        if (p < q) {
            for (i = p; i <= q; i++) {
                range++;
            }

            num = new int[range];
            between = p;

            for (i = 0; i < num.length; i++) {
                num[i] = between;
                between++;
            }

            System.out.print("Estos son los numeros en el vector: ");
            for (i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println("");
        }
        else if(p > q){
            for (i = q; i <= p; i++) {
                range++;
            }

            num = new int[range];
            between = p;

            for (i = 0; i < num.length; i++) {
                num[i] = between;
                between--;
            }

            System.out.print("Estos son los numeros en el vector: ");
            for (i = 0; i < num.length; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println("");
        }
        else {
            System.err.println("Los numeros son iguales.");
        }

    }

}
