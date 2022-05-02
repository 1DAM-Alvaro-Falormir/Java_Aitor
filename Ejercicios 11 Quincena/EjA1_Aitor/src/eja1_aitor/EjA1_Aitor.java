/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eja1_aitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author aitgal
 */
public class EjA1_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "";
        File arch;

        do {
            try {
                System.out.println("Introduzca una ruta para mostrar su informacion:");
                ruta = sc.nextLine();
                arch = new File(ruta);
                muestraInfoRuta(arch);
            } catch (FileNotFoundException e) {
                if (!ruta.equals("")) {
                    System.err.println("Ruta no encontrada.");
                }
            }

        } while (!ruta.equals(""));

    }

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
        File[] lista;
        File[] listaDirectorio;
        File[] listaArchivos;
        int d = 0, a = 0, cont = 0;
        boolean salir = false;
        if (ruta.exists()) { //Comprobamos que la ruta existe
            if (ruta.isFile()) { //Comprobamos si la ruta es archivo
                System.out.println("Nombre: " + ruta.getName());
            } else { //Si la ruta es un directorio se añadira a un array de Objetos File,
                lista = ruta.listFiles();
                
                for(File Archivo : lista){
                    if(Archivo.isDirectory())
                        System.out.println("[*]Nombre: " + Archivo.getName());
                    
                }
                
                for(File Archivo : lista){
                    if(Archivo.isFile())
                        System.out.println("[A]Nombre: " + Archivo.getName());
                }

            }
        } else {
            throw new FileNotFoundException("Ruta no encontrada");
        }

    }

}
