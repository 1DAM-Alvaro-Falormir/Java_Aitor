/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8_aitor;
import java.util.*;

/**
 *
 * @author aitor
 * 
 * Crea un programa que cree un array con 100 números reales
 * aleatorios entre 0.0 y 1.0, utilizando Math.random(), y luego le pida al
 * usuario un valor real R. Por último, mostrará cuántos valores del array son
 * igual o superiores a R.
 */
public class Ej8_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num[] = new double[100];
        double r;
        int i = 0, cont = 0;
        
        System.out.println("Bienvenido a un programa donde hay un vector con 100 numeros entre 0.0 y 1.0");
        System.out.print("Dime un numero real entre esos numeros y te mostrare cuantos valores son iguales o superiores: ");
        r = sc.nextDouble();
        
        if (r < 1 && r > 0){
            for (i = 0; i < num.length; i++) {
                num[i] = Math.random();
            }
            
            for (i = 0; i < num.length; i++) {
                if (r >= num[i]) {
                    cont++;
                }
            }
            System.out.println("Hay " + cont + " numeros iguales o superiores a: " + r);
        }
        else {
            System.err.println("Numero invalido");
        }
    }
    
}
