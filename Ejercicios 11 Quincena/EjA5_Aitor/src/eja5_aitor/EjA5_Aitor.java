/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eja5_aitor;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author aitor
 */
public class EjA5_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File documentos = new File("Documentos");
        File fotos = new File("Documentos/Fotografias");
        File libros = new File("Documentos/Libros");
        boolean ok;
        
        try{
            borraTodo(fotos);
            borraTodo(libros);
            ok = borraTodo(documentos);
            if(ok){
                System.out.println("Se han borrado todos los archivos.");
            } else{
                System.out.println("No se ha borrado algun archivo.");
            }
        }
        catch(FileNotFoundException e){
            System.err.println("No se ha encontrado la ruta.");
        }
    }
    
    public static boolean borraTodo(File f)throws FileNotFoundException{
        boolean ok = false;
        File[] vector;
        
        if (f.isFile()) {
           ok = f.delete();
        }
        else if (f.isDirectory()) {
            vector = f.listFiles();
            
            for(File arch : vector){
                if (arch.isFile()){
                    arch.delete();
                }else{
                    borraTodo(arch);
                }
            }
            
            ok = f.delete();
        }
        else{
            throw new FileNotFoundException("");
        }
        
        
        return ok;
    }
}
