/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_aitor;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aitor
 */
public class Ej1_Aitor {

    /**
     * Metodo principal del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        
        lista.add(new Producto("Juego", 10));
        lista.add(new Producto("Comida", 5));
        lista.add(new Producto("Bebidas", 7));
        lista.add(new Producto("Chuches", 2));
        lista.add(new Producto("Chocolate", 3));
        
        
        
        System.out.println("- Lista con "+ lista.size()+ " elementos");
        for(Iterator iter = lista.iterator(); iter.hasNext();){
            Producto p = (Producto)iter.next();
            System.out.println(p.getNombre()+" : "+ p.getCantidad());
        }
        
        lista.remove(0);
        lista.remove(3);
        
        lista.add(2, new Producto("Nose", 1));
        
        System.out.println("- Lista con "+ lista.size()+ " elementos");
        for(Iterator iter2 = lista.iterator(); iter2.hasNext();){
            Producto p = (Producto)iter2.next();
            System.out.println(p.getNombre()+" : "+ p.getCantidad());
        }
        
        lista.clear();
        System.out.println("- Lista con "+ lista.size()+ " elementos");
        
    }
    
}
