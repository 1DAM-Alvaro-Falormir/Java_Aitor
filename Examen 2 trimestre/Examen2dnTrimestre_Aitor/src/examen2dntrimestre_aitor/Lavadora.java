/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2dntrimestre_aitor;

/**
 *
 * @author Aitor
 */
public class Lavadora extends Electrodomestico {
    private int carga;
    private final int defaultCarga = 5;

    public Lavadora(int carga) {
        super();
        this.carga = defaultCarga;
    }

    public Lavadora(int carga, double precioBase, int peso) {
        super(precioBase, peso);
        this.carga = comprobarCarga(carga);
    }

    public Lavadora(int carga, String nombre, double precioBase, String color, char consumoElectrico, int peso) {
        super(nombre, precioBase, color, consumoElectrico, peso);
        this.carga = comprobarCarga(carga);
    }
    
    public int getCarga(){
        return this.carga;
    }
    
    @Override
    public double precioFinal(){
        int precioPeso = 10, precioConsumo = 10, precioCarga = 0; 
        
        if (this.peso >= 0 && this.peso <= 19){
            precioPeso = 10;
        } else if (this.peso < 50){
            precioPeso = 50;
        } else if (this.peso < 80){
            precioPeso = 80;
        } else {
            precioPeso = 100;
        }
        
        if (this.consumoElectrico == 'A'){
            precioConsumo = 100;
        } else if (this.consumoElectrico == 'B'){
            precioConsumo = 80;
        } else if (this.consumoElectrico == 'C'){
            precioConsumo = 60;
        } else if (this.consumoElectrico == 'D'){
            precioConsumo = 50;
        } else if (this.consumoElectrico == 'E'){
            precioConsumo = 30;
        } else if (this.consumoElectrico == 'F'){
            precioConsumo = 10;
        }
        
        if (this.carga > 8){
            precioCarga = 35;
        }
        
        return this.precioBase + precioPeso + precioConsumo + precioCarga;
    }
    
    public static int comprobarCarga(int i){
        int c;
        
        if (i < 0){
            c = 5;
        } else {
            c = i;
        }
        
        return c;
    }
    
    @Override
    public int dondeEstoy(){
        return 0;
    }
    
    @Override
    public void mostrarElectrodomestico(){
        System.out.println("Nombre de la lavadora: " + this.nombre);
        System.out.println("Precio base de la lavadora: "+this.precioBase);
        System.out.println("Color de la lavadora: " + this.color);
        System.out.println("Consumo energético de la lavadora: "+this.consumoElectrico);
        System.out.println("Peso de la lavadora: "+this.peso);
        System.out.println("Carga de la lavadora: "+this.carga);
        System.out.println("Precio final de la lavadora: " + precioFinal());
    }
    
    
}
