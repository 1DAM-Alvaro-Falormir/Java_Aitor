/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12_aitor;

import java.util.Scanner;

/**
 * Realiza un programa que dado un valor en kilómetros nos lo traduce a millas.
 * El programa debe tener una función que reciba como parámetro una cantidad en
 * kilómetros y nos la devuelva en millas.
 * @author Aitor
 */
public class Ej12_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km;
        double millas;
        System.out.print("Introduzca un valor entero en kilometros: ");
        km = sc.nextInt();
        millas = kilometros_a_millas(km);
        System.out.println(km+" kilometros son: "+ String.format("%.3f", millas)+" millas.");
        
    }
    
    public static double kilometros_a_millas(int a){
    double unaMilla = 0.62137, km;
    km = unaMilla * a;
    return km;
    }
}
