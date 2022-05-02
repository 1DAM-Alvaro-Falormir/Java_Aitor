/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eja2_aitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author aitgal
 */
public class EjA2_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "", detalles;
        File arch;
        boolean info, ok;

        do {
            try {
                System.out.println("Introduzca una ruta para mostrar su informacion:");
                ruta = sc.nextLine();
                arch = new File(ruta);
                if (!ruta.equals("")) {
                    do {
                        System.out.println("Quieres ver el tamaño de los archivos y su fecha de la última modificacion? Si/No");
                        detalles = sc.next();
                        ok = Utilidades.validarSN(detalles);
                    } while (!ok);
                    info = detalles.equalsIgnoreCase("si");
                } else {
                    info = false;
                }
                muestraInfoRuta(arch, info);

            } catch (FileNotFoundException e) {
                if (!ruta.equals("")) {
                    System.err.println("Ruta no encontrada.");
                }
            }

        } while (!ruta.equals(""));

    }

    public static void muestraInfoRuta(File ruta, boolean info) throws FileNotFoundException {
        File[] lista;
        long ms;
        Date fecha;

        if (ruta.exists()) { //Comprobamos que la ruta existe
            if (ruta.isFile()) { //Comprobamos si la ruta es archivo
                System.out.println("Nombre: " + ruta.getName());
            } else { //Si la ruta es un directorio se añadira a un array de Objetos File,
                lista = ruta.listFiles();
                Arrays.sort(lista);

                if (info) {
                    for (File Archivo : lista) {
                        if (Archivo.isDirectory()) {
                            System.out.println("[*]Nombre: " + Archivo.getName());
                            System.out.println("Tamaño: " + Archivo.length() + " bytes");
                            ms = Archivo.lastModified();
                            fecha = new Date(ms);
                            System.out.println("Última Modificación: " + fecha);

                        }

                    }

                    for (File Archivo : lista) {
                        if (Archivo.isFile()) {
                            System.out.println("[A]Nombre: " + Archivo.getName());
                            System.out.println("Tamaño: " + Archivo.length() + " bytes");
                            ms = Archivo.lastModified();
                            fecha = new Date(ms);
                            System.out.println("Última Modificación: " + fecha);
                        }
                    }
                } else {
                    for (File Archivo : lista) {
                        if (Archivo.isDirectory()) {
                            System.out.println("[*]Nombre: " + Archivo.getName());
                        }

                    }

                    for (File Archivo : lista) {
                        if (Archivo.isFile()) {
                            System.out.println("[A]Nombre: " + Archivo.getName());
                        }
                    }
                }

            }
        } else {
            throw new FileNotFoundException("Ruta no encontrada");
        }

    }

}
