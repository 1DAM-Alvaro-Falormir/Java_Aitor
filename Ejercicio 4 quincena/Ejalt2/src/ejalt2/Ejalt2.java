/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejalt2;

import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class Ejalt2 {

    public static void main(String[] args) {
        System.out.println("Introduce un angulo y te dire su tipo");
        Scanner entry = new Scanner(System.in);
        int ang;
        System.out.print("Introduce el valor del angulo: ");
        ang = entry.nextInt();
        if (ang > 0 & ang <= 180) {
            if (ang < 90) {
                System.out.println("El angulo es agurdo.");
            } else if (ang > 90 & ang < 180) {
                System.out.println("El angulo es obtuso.");
            } else if (ang == 90) {
                System.out.println("El angulo es recto.");
            } else {
                System.out.println("El angulo es llano.");
            }
        } else {
            System.err.println("El angulo tiene que ser convexo.");
        }
    }

}
