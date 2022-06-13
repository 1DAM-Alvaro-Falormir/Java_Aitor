/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb5_aitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ciber
 */
public class EjB5_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File dic = new File("Diccionario"), dicText = new File("Documentos/diccionario.txt"), text;
        ArrayList<String> listaP;
        String nombre;
        
        dic.mkdir();
        
        try{
            for (char i = 'A'; i <= 'Z' ; i++) {
                Scanner readDic = new Scanner(dicText);
                listaP = new ArrayList();
                
                text = new File(dic.getAbsolutePath() + "/" + i + ".txt");
                text.createNewFile();
                
                while(readDic.hasNext()){
                    nombre = readDic.next();
                    if(nombre.toUpperCase().charAt(0) == i){
                        listaP.add(nombre + "\n");
                    }
                }
                
                FileWriter wri = new FileWriter(text);
                for(String pal : listaP){
                    wri.write(pal);
                }
            }
            
        }
        catch(FileNotFoundException ex){
            System.out.println("Ruta no encontrada");
        } catch (IOException ex) {
            System.out.println("No se puedo crear o acceder al archivo.");
        }
        
    }
    
}
