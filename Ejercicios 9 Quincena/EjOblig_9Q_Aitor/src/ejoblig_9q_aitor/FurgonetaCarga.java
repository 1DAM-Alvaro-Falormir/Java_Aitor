/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 *
 * @author Aitor
 */
public class FurgonetaCarga extends Vehiculo{
    private final float precioExtra = 20;
    
    public FurgonetaCarga(String matricula){
        this.matricula = matricula;
    }
    
    public float calcularPrecio(int dia, int pma){
        float precioPMA, precioTotal;
        
        precioPMA = pma*precioExtra;
        precioTotal = (precioAlquiler*dia)+precioPMA;
        
        return precioTotal;
    }
}
