/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3c_aitor;

import java.util.*;

/**
 *
 * @author Aitor
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e introduzca en ella NxM valores (también introducidos por teclado).
 * Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son menores que cero y cuántos son igual a cero.
 */
public class Ej3c_Aitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][];
        int i = 0, j = 0, cont0 = 0, contG = 0, contL = 0, n, m;
        
        System.out.println("Bienvenido a un programa donde introduciras el tamaño de la matriz y rellenaras dicha matriz con enteros. Una vez introducidos se dira cuantos numeros superiores, inferiores o iguales a 0 has introducido.");
        System.out.print("Introduce el numero de filas que tendra la matriz: ");
        n = sc.nextInt();
        System.out.print("Introduce el numero de columnas que tendra la matriz: ");
        m = sc.nextInt();
        arr = new int[n][m];
        
        for (i = 0; i < arr.length; i++) {
            System.out.println("");
            for (j = 0; j < arr[i].length; j++) {
                System.out.print("Introduzca un valor: ");
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0){
                    contL++;
                }
                else if (arr[i][j] > 0){
                    contG++;
                }
                else{
                    cont0++;
                }
                
            }
        }
        
        System.out.println("Hay "+contG+" numeros mayores a 0, hay "+contL+" numeros inferiores a 0 y hay "+cont0+" numeros iguales a 0.");
        
    }
    
}
