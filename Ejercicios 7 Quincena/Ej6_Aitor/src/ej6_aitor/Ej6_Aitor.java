/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_aitor;

import java.util.Scanner;

/**
 * Escribe un programa que pida cinco precios y muestre por pantalla el precio
 * de venta de cada uno tras aplicarle un 21% de IVA.
 * @author Aitor
 */
public class Ej6_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        int n = 5;
        for (int i = 0; i < n; i++){
            System.out.print("Introduzca un precio: ");
            precio = sc.nextDouble();
            System.out.println("Este es el precio de venta tras aplicarle un 21% de IVA: " + precioConIVA(precio));
        }
        
    }
    
    public static double precioConIVA(double precio){
        double iva = precio * 0.21;
        
        return iva + precio;
    }
    
}
