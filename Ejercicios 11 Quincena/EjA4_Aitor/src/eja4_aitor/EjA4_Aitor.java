/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eja4_aitor;

import java.io.File;

/**
 *
 * @author aitor
 */
public class EjA4_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File misCosas = new File("Documentos/Mis Cosas");
        File alfabeto = new File("Documentos/Alfabeto");
        File fotoOld = new File("Documentos/Fotografias");
        File fotoNew = new File("Documentos/Mis Cosas/Fotografias");
        File libroOld = new File("Documentos/Libros");
        File libroNew = new File("Documentos/Mis Cosas/Libros");
        boolean mkdirMio, mkdirAlf;
        
        mkdirMio = misCosas.mkdir();
        mkdirAlf = alfabeto.mkdir();
        
        if(mkdirMio){
            fotoOld.renameTo(fotoNew);
            libroOld.renameTo(libroNew);
        }
        if(mkdirAlf){
            crearAlfabeto(alfabeto);
        }
        
    }
    
    public static void crearAlfabeto(File f){
        char dir = 'A';
        String path;
        File arch;
        
        
        for (int i = 0; i <= 25; i++) {
            path = f.getAbsolutePath();
            path += "/";
            path += dir;
            arch = new File(path);
            arch.mkdir();
            dir += 1;
        }
    }
    
}
