/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejalt3;

import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class Ejalt3 {

    public static void main(String[] args) {
        System.out.println("Bienvendio al programa para calcular el salario.");
        Scanner entry = new Scanner(System.in);
        String turno;
        String dia;
        int horas=0;
        int salario=0;
        System.out.print("Introduce el turno en el que ha trabajado, d(diurno) o n(nocturno): ");
        turno=entry.nextLine();
        System.out.println("Introduce si era domingo.");
        System.out.print(" S/N=: ");
        dia=entry.nextLine();
        System.out.print("Introduce el numero de horas trabajas ese dia: ");
        horas=entry.nextInt();
        if (turno.equalsIgnoreCase("d")){
            if(dia.equalsIgnoreCase("s")){
                salario=horas*12;
                System.out.println("Tu salario de ese dia es: "+salario);
            } else {
                salario=horas*8;
                System.out.println("Tu salario de ese dia es: "+salario);
            }
        }else {
            if(dia.equalsIgnoreCase("s")){
                salario=horas*20;
                System.out.println("Tu salario de ese dia es: "+salario);
            } else {
                salario=horas*15;
                System.out.println("Tu salario de ese dia es: "+salario);
            }
        }
        
        
    }
    
}
