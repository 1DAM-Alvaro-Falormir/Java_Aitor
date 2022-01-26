/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;
import java.util.Scanner;

/**
 *
 * @author aitor
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int radio;
        double longi,area,volu;
        System.out.print("Dime el valor del radio: ");
        radio=entrada.nextInt();
        longi=2*Math.PI*radio;
        area=Math.PI*(Math.pow(radio, 2));
        volu=(4/3)*Math.PI*(Math.pow(radio, 3));
        System.out.println("Los resultados son estos");
        System.out.println("Longitud de la circumferencia= "+longi);
        System.out.println("Area de la circumferencia= "+area);
        System.out.println("Volumen de la circumferencia= "+volu);
    }
    
}
