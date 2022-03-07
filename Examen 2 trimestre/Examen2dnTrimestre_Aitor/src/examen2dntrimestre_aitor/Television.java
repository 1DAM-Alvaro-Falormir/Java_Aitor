/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2dntrimestre_aitor;

/**
 *
 * @author Aitor
 */
public class Television extends Electrodomestico {
    private float resolucion;
    private boolean wifi;

    public Television() {
        super();
        this.resolucion = 20;
        this.wifi = false;
    }

    public Television(float resolucion, boolean wifi, double precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = comprobrobarResolucion(resolucion);
        this.wifi = wifi;
    }

    public Television(float resolucion, boolean wifi, String nombre, double precioBase, String color, char consumoElectrico, int peso) {
        super(nombre, precioBase, color, consumoElectrico, peso);
        this.resolucion = comprobrobarResolucion(resolucion);
        this.wifi = wifi;
    }

    public static float comprobrobarResolucion(float i){
        float r;
        
        if (i < 0){
            r = 20;
        } else {
            r = i;
        }
        
        return r;
    }
    
    @Override
    public double precioFinal(){
        int precioPeso = 10, precioConsumo = 10, precioWifi = 0;
        double precioTotal;
        
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
        
        if (this.wifi){
            precioWifi = 50;
        }
        
        if (this.resolucion > 40){
            precioTotal = (this.precioBase + precioPeso + precioConsumo + precioWifi) * 1.30;
        } else {
            precioTotal = this.precioBase + precioPeso + precioConsumo + precioWifi;
        }
        
        return precioTotal;
        
    }
    
    @Override
    public int dondeEstoy(){
        return 1;
    }
    
    @Override
    public void mostrarElectrodomestico(){
        System.out.println("Nombre del televisor: " + this.nombre);
        System.out.println("Precio base del televisor: "+this.precioBase);
        System.out.println("Color del televisor: " + this.color);
        System.out.println("Consumo energético del televisor: "+this.consumoElectrico);
        System.out.println("Peso del televisor: "+this.peso);
        System.out.println("Resolucion del televisor: "+this.resolucion);
        if(this.wifi){
            System.out.println("Este televidor tiene Wi-Fi.");
        } else {
            System.out.println("Este televisor no tiene Wi-Fi.");
        }
        System.out.println("Precio final del televisor: " + precioFinal());
    }
    
    
    
}
