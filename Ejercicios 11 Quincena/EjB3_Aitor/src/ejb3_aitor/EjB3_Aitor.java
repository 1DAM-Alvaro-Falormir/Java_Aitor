/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb3_aitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


/**
 *
 * @author aitgal
 */
public class EjB3_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File nombres, sorted;
        Scanner sc = new Scanner(System.in);
        Scanner scn;
        FileWriter fws;
        String read, write, escribir;
        ArrayList<String> listaNombres = new ArrayList();
        
        System.out.println("Introduce el nombre del archivo de lectura: ");
        read = sc.nextLine();
        System.out.println("Introduce le nombre del archivo de escritura: ");
        write = sc.nextLine();
        
        nombres = new File(read);
        sorted = new File(write);
        try{
            scn = new Scanner(nombres);
            fws = new FileWriter(sorted);
            do{
                listaNombres.add(scn.next());
            }while(scn.hasNext());
            
            Collections.sort(listaNombres);
            
            Iterator it = listaNombres.iterator();
            
            do{
                escribir = it.next() + "\n";
                fws.write(escribir);
            }while(it.hasNext());
            
            scn.close();
            fws.close();
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Ruta no encontrada");
        } 
        catch (IOException ex) {
            System.out.println("Ruta no encontrada");
        }
        
        
        
    }
    
}
