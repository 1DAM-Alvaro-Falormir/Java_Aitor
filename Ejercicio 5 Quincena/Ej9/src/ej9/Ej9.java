/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9;

/**
 *
 * @author ciber
 */
public class Ej9 {

    public static void main(String[] args) {
        int suma = 0, prod = 1;
        System.out.println("Bienvenido a un programa el cual te va a mostrar la suma y el producto de los primeros numeros naturales.");
        for (int i = 1; i <=10; i++){
            suma= suma + i;
            prod = prod * i;
        }
        System.out.println("La suma de los primeros 10 numeros naturales es: "+suma);
        System.out.println("El producto de los primeros 10 numeros naturales es: "+prod);
    }
    
}
