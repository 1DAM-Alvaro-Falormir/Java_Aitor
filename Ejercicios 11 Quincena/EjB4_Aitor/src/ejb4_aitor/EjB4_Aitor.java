/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejb4_aitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aitgal
 */
public class EjB4_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File nombres = new File("Documentos/usa_nombres.txt");
        File apellidos = new File("Documentos/usa_apellidos.txt");
        File personas;
        Scanner sc = new Scanner(System.in);
        String nom = null, apell = null, persona, archivo;
        int num = 0, rng, lines1 = 0, lines2 = 0;
        ArrayList<String> listaNombres = new ArrayList(), listaApellidos = new ArrayList();
        try{
            Scanner scn = new Scanner(nombres);
            Scanner sca = new Scanner(apellidos);
            
            while(scn.hasNext()){
                listaNombres.add(scn.next());
                lines1++;
            }
            scn.close();
            while(sca.hasNext()){
                listaApellidos.add(sca.next());
                lines2++;
            }
            do{
                System.out.println("Dime el numero de nombres que quiere generar.");
                num = sc.nextInt();
                if(num < 1){
                    System.out.println("El numero no puede ser menor a 1");
                }
            }while(num < 1);
            System.out.println("Introduce el archivo donde se guardaran los nombres.");
            sc.nextLine();
            archivo = sc.nextLine();
            
            personas = new File(archivo);
            
            FileWriter scw = new FileWriter(personas);
            
            for (int i = 0; i < num; i++) {
                rng = (int) (1 + Math.random() * lines1);
                nom = listaNombres.get(rng);
                rng = (int) (1 + Math.random() * lines2);
                apell = listaApellidos.get(rng);
                persona = nom + " " + apell + "\n";
                scw.write(persona);
            }
            scw.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Ruta no encontrada.");
        } catch (IOException ex) {
            System.out.println("Ruta no encontrada.");
        } catch (InputMismatchException ex){
            System.out.println("Solo se pueden poner numeros");
        }
    }
    
}
