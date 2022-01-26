/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;
import java.util.Scanner;
/**
 *
 * @author ciber
 */
public class Ej6 {

    public static void main(String[] args) {
        Scanner entry=new Scanner(System.in);
        int precio;
        int precioreal;
        int dto;
        System.out.print("Dime el precio de un articulo: ");
        precio=entry.nextInt();
        System.out.print("Dime el precio de venta real del articulo: ");
        precioreal=entry.nextInt();
        dto=(precio*100)/precioreal;
        System.out.println("Este es el porcentaje del descuento: "+dto);
        
    }
    
}
