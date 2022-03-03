/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 *
 * @author Aitor
 */
public class Camion extends Vehiculo{
    private final float precioExtra = 40;
    
    public Camion(String matricula){
        this.matricula = matricula;
    }
    
    public float calcularPrecio(int dia){
        float precioTotal;
        
        precioTotal = (precioAlquiler*dia)+precioExtra;
        
        return precioTotal;
        
    }
}
