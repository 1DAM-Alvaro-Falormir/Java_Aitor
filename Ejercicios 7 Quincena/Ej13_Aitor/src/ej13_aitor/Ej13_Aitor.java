/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13_aitor;

import java.util.Scanner;

/**
 * Realiza un programa que calcule el porcentaje de descuento que nos han hecho
 * al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad
 * con el descuento aplicado. Se debe crear una función a la que le pasemos
 * ambos valores y nos devuelva el descuento.
 * @author aitor
 */
public class Ej13_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, porcen;
        
        System.out.print("Dime el precio inical del producto: ");
        a = sc.nextDouble();
        System.out.print("Dime el precio que has pagado: ");
        b = sc.nextDouble();
        
        porcen = calcularPorcentaje(a, b);
        
        System.out.println("El porcentaje del descuento es: "+String.format("%.2f", porcen)+"%");
    }
    
    
    public static double calcularPorcentaje(double init, double pagado){
        double porciento = (pagado * 100) / init;
        return 100 - porciento;
    }
}
