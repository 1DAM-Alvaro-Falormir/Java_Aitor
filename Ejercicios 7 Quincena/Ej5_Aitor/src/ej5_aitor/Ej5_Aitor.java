/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5_aitor;

import java.util.Scanner;

/**
 * Escribe un programa que pida un valor entero en millas y muestre su
 * equivalente en kilómetros. Recuerda que una milla son 1,60934 kilómetros.
 * @author Aitor
 */
public class Ej5_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int millas;
        double km;
        System.out.print("Introduzca un valor entero en millas: ");
        millas = sc.nextInt();
        km = millas_a_kilometros(millas);
        System.out.print(millas+" millas son: "+ String.format("%.3f", km)+" Kilómetros\n");
    }
    
    public static double millas_a_kilometros(int millas){
        double unKm = 1.60934, km;
        km = unKm * millas;
        return km;
    }
}
