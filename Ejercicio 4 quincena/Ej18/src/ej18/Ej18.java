/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej18;

import java.util.Scanner;

/**
 *
 * @author ciber
 */
public class Ej18 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String nombre;
        int hora, sala;
        double sbruto = 0.00, tasas = 0.00, trest = 0.00, imp1 = 0.00, imp2 = 0.00, sneto = 0.00;
        System.out.print("Digame su nombre: ");
        nombre = entry.nextLine();
        System.out.print("Digame las horas trabajas esta semana: ");
        hora = entry.nextInt();
        System.out.print("Digame la tarifa de cada hora: ");
        sala = entry.nextInt();
        if (hora > 35) {
            sbruto = 35 * sala + (hora - 35) * sala * 1.5;
        } else {
            sbruto = hora * sala;
        }
        if (sbruto <= 500) {
        } else {
            trest = sbruto - 500;
            if (trest >= 900) {
                imp1 = 400 * 0.25;
                trest = trest - 400;
                imp2 = trest * 0.45;
                tasas = imp1 + imp2;
            }else{
                tasas=trest*0.25;
            }
            sneto = sbruto - tasas;
            System.out.println(nombre + " esta semana has tenido un salario bruto de " + sbruto + ", estos son los impuestos que has pagado " + tasas + " y este es lo que has cobrado esta semana " + sneto);
        }
        
    }

}
