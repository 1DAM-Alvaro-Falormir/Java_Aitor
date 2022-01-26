/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacion;

import java.util.Scanner;

/**
 *
 * @author Aitor Rodriguez Gallardo
 */
public class Ecuacion {

    public static void main(String[] args) {
        System.out.println("Bienvenido al programa para resolver ecuaciónes de segundo grado por el discriminante");
        Scanner entry = new Scanner(System.in);
        double a, b, c, dis, x1, x2;
        char resp;
        do {
            System.out.print("Introduce el valor A: ");
            a = entry.nextDouble();
            System.out.print("Introduce el valor B: ");
            b = entry.nextDouble();
            System.out.print("Introduce el valor C: ");
            c = entry.nextDouble();
            dis = Math.pow(b, 2) - 4 * a * c;
            if (dis > 0.0) {
                x1 = -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c);
                x2 = -b - Math.sqrt(Math.pow(b, 2) - 4 * a * c);
                System.out.println("x1= " + x1 + " y x2= " + x2);
            } else if (dis == 0.0) {
                x1 = -b + Math.sqrt(Math.pow(b, 2) - 4 * a * c);
                System.out.println("Raíces iguales x1=x2= " + x1);
            } else {
                System.out.println("Raíces complejas.");
            }
            System.out.println("¿Desea resolver otra ecuación de 2º grado? s/n");
            resp = entry.next().charAt(0);
        } while (resp != 'n' && resp != 'N');
    }

}
