/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10_aitor;

import java.util.Scanner;

/**
 * Realiza un programa que lea una fecha introduciendo el día, mes y año por
 * separado y nos diga si la fecha es correcta o no. Supondremos que todos los
 * meses tienen 30 días. Se debe crear una función donde le pasemos los datos y
 * devuelva si es correcta o no.
 * @author Aitor
 */
public class Ej10_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, year;
        
        System.out.print("Introduzca un dia: ");
        dia = sc.nextInt();
        System.out.print("Introduzca un mes: ");
        mes = sc.nextInt();
        System.out.print("Introduzca un año: ");
        year = sc.nextInt();
        
        if (fechaCorrecta(dia, mes, year))
            System.out.println("La fecha es correcta.");
        else
            System.out.println("La fecha es incorrecta.");
    }
    
    public static boolean fechaCorrecta(int d, int m, int a){
        boolean dia = false, mes = false, anyo = false, fecha = false;
        
        if (d > 0 && d < 31){
            dia = true;
        }
        if (m > 0 && m < 13){
            mes = true;
        }
        if (a > 0 && a < 3000){
            anyo = true;
        }
        if (dia && mes && anyo){
            fecha = true;
        }
        return fecha;
    }
    
}
