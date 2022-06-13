/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb2_aitor;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


/**
 *
 * @author aitgal
 */
public class EjB2_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("Documentos/alumnos_notas.txt");
        ArrayList listaAlumnos = new ArrayList();
        ArrayList listaInversa = new ArrayList();
        String nombre, apellido, alumno;
        float nota, media;
        int cont, c = 1;
        
        try{
            Scanner sc = new Scanner(f);
            do{
                nombre = sc.next();
                apellido = sc.next();
                nota = 0;
                cont = 0;
                media = 0;
                do{
                    nota += sc.nextInt();
                    cont++;
                }while(sc.hasNextInt());
                media = nota / cont;
                alumno = media + " - " + nombre + ", " + apellido;
                listaAlumnos.add(alumno);
            }while(sc.hasNext());
            
            Collections.sort(listaAlumnos);
            
            for(int i = listaAlumnos.size() - 1; i >= 0; i--){
                listaInversa.add(listaAlumnos.get(i));
            }
            
            Iterator it = listaInversa.iterator();
            
            while(it.hasNext()){
                System.out.println(c + ". " + it.next());
                c++;
            }
            sc.close();
        } 
        catch (FileNotFoundException ex) {
            System.out.println("File no encontrado");
        }
        
        
    }
    
}
