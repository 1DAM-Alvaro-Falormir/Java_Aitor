/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1c_aitor;

/**
 *
 * @author Aitor
 * Crea un programa que cree una matriz de tamaño 5x5 que almacene
 * los números del 1 al 25 y luego muestre la matriz por pantalla.
 */
public class Ej1c_Aitor {


    public static void main(String[] args) {
        int arr[][] = new int [5][5];
        int i, j, cont = 1;
        
        for (i = 0; i < arr.length; i++){
            for (j = 0; j < arr[i].length; j++){
                    arr[i][j] = cont;
                    cont++;
            }
        }
        
        System.out.println("Se van a imprimir los valores de la matriz");
        
        for (i = 0; i < arr.length; i++){
            System.out.println("");
            System.out.println("En la fila "+i+" estan los numeros:");
            for(j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
    
}
