/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2c_aitor;

/**
 *
 * @author Aitor
 * Crea un programa que cree una matriz de 10x10 e introduzca los
 * valores de las tablas de multiplicar del 1 al 10 (cada tabla en una fila).
 * Luego mostrará la matriz por pantalla.
 */
public class Ej2c_Aitor {


    public static void main(String[] args) {
        int arr[][] = new int[10][10];
        int i = 0, j = 0, numI = 0, numD = 1, cont = 1;
        
        for (i = 0; i < arr.length; i++){
            numI++;
            for (j = 0; j < arr[i].length; j++){
                if (numD > 10){
                    numD = 1;
                }    
                arr[i][j] = numI * numD;
                numD++;
            }
        }
        System.out.println("A continuacion se van a mostrar las tablas de multiplicar del 1 al 10");
        
        for (i = 0; i < arr.length; i++){
            System.out.println();
            System.out.println("Esta es la tabla del "+cont);
            cont++;
            for (j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
    
}
