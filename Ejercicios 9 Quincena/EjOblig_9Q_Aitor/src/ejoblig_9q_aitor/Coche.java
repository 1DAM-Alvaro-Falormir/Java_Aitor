/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejoblig_9q_aitor;

/**
 *
 * @author Aitor
 */
public class Coche extends Vehiculo{
    private final float precioExtra = 1.5f;
    private final int plaza;
    
    public Coche(String matricula, int plaza){
        this.matricula = matricula;
        this.plaza = plaza;
    }
    
    public float calcularPrecio(int dia){
        float precioDia, precioPlaza, precioTotal;
        
        precioDia = dia*precioExtra;
        precioPlaza = plaza*precioExtra;
        precioTotal = (precioAlquiler*dia)+(precioDia+precioPlaza);
        
        return precioTotal;
    }
}
