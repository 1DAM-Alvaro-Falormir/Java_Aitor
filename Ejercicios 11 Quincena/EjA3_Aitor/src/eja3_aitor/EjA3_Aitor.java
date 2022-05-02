/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eja3_aitor;

import java.io.File;

/**
 *
 * @author aitgal
 */
public class EjA3_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File documentos = new File("Documentos");
        File doc = new File("DOC");
        
        File fotografias = new File("DOC/Fotografias");
        File fotos = new File("DOC/FOTOS");
        
        File libros = new File("DOC/Libros");
        File lecturas = new File("DOC/LECTURAS");
        
        boolean okF, okL;
        
        
        documentos.renameTo(doc);
        okF = fotografias.renameTo(fotos);
        okL = libros.renameTo(lecturas);
        
        if(okF){
            RemoveExtensions(fotos);
        } else
            System.out.println("No ha cambiado Fotos");
        if(okL){
            RemoveExtensions(lecturas);
        } else
            System.out.println("No ha cambiado Libros");
        
    }
    
    public static void RemoveExtensions(File f){
        File[] lista = f.listFiles();
        int indexOf;
        String noTxt;
        File rename;
        
        for (File arch : lista) {
            indexOf = arch.getAbsolutePath().indexOf(".");
            noTxt = arch.getAbsolutePath().substring(0 , indexOf);
            rename = new File(noTxt);
            arch.renameTo(rename);
        }
    }
    
}
