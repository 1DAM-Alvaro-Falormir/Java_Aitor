/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11_aitor;

/**
 *
 * @author Aitor
 * Crea un programa que cree dos arrays de enteros de tamaño 100.
 * Luego introducirá en el primer array todos los valores del 1 al 100.
 * Por último, deberá copiar todos los valores del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 */
public class Ej11_Aitor {


    public static void main(String[] args) {
        int array1[] = new int[100];
        int array2[] = new int[100];
        int cont = 1, i = 0;
        
        for (i = 0; i < array1.length; i++){
            array1[i] = cont;
            cont++;
        }
        
        cont = 99;
        for (i = 0; i < array1.length; i++){
            array2[i] = array1[cont];
            cont--;
        }
        System.out.print("Este es el primer array: ");
        for (i = 0; i < array1.length; i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        
        System.out.print("Este es el segundo array: ");
        for (i = 0; i < array1.length; i++){
            System.out.print(array2[i]+" ");
        }
        System.out.println();
               
        
    }
    
}
