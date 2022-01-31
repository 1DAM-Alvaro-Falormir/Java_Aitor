/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej20_aitor;

/**
 *Escribe un programa que imprima las tablas de multiplicar del 1 al 10.
 * Implementa una función que reciba un número entero como parámetro e imprima
 * su tabla de multiplicar.
 * 
 * @author Aitor
 */
public class Ej20_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            tablaMultiplica(i);
        }
    }
    
    public static void tablaMultiplica(int a){
        for (int i = 1; i <= 10; i++){
            System.out.println("Esta es la tabla de multiplicar del "+a+": "+(i*a));
        }
    }
    
}
