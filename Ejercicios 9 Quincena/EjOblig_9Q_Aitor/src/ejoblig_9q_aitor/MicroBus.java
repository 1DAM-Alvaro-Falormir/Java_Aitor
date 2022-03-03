/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 *
 * @author Aitor
 */
public class MicroBus extends Vehiculo{
    private final float precioExtra = 2;
    private final int plaza;
    
    public MicroBus(String matricula, int plaza){
        this.matricula = matricula;
        this.plaza = plaza;
    }
    
    public float calcularPrecio(int dia){
        float precioPlaza, precioTotal;
        
        precioPlaza = plaza*precioExtra;
        precioTotal = (precioAlquiler*dia)+precioPlaza;
        
        return precioTotal;
    }
}
