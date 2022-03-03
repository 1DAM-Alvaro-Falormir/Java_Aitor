/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 *
 * @author Aitor
 */
public class Comprobacion {
    
    public static boolean comprobarMatricula(String mat){
        return mat.matches("\\d{4}[A-Z]{3}");
    }
    
    public static boolean comprobarPlaza(int plaza){
        return plaza > 0;
    }
    
    public static boolean comprobarTipo(String tipo){
        boolean cierto = false;
        
        cierto = tipo.matches("COCHE") || tipo.matches("MICROBUS") || tipo.matches("FURGONETA") || tipo.matches("CAMION");
        
        return cierto;
    }
}
