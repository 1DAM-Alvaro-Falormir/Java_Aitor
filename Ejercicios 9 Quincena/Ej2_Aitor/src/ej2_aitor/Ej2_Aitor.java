/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_aitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aitor
 */
public class Ej2_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList solar = new ArrayList();
        Planeta p;
        
        solar.add(new Planeta("Tierra", 100, 200, true, 125.23, 52.18, 20000.68, 896.5, 15));
        p = (Planeta) solar.get(0);
        solar.add(new Satelite("Luna", 200, 100, p, 125.23, 52.18, 20000.68, 896.5, 15));
        
        
        
        for (Iterator it = solar.iterator(); it.hasNext();){
            Astro a = (Astro) it.next();
            a.muestra();
            System.out.println("");
        }
    }
    
}
