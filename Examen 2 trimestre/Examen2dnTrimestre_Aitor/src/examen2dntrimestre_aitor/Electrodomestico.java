/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2dntrimestre_aitor;

/**
 *
 * @author Aitor
 */
public abstract class Electrodomestico {

    protected String nombre;
    protected double precioBase;
    protected String color;
    protected char consumoElectrico;
    protected int peso;

    public Electrodomestico() {
        this.nombre = "";
        this.precioBase = 100;
        this.color = "Blanco";
        this.consumoElectrico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, int peso) {
        this.nombre = "";
        this.precioBase = comprobarPrecio(precioBase);
        this.color = "Blanco";
        this.consumoElectrico = 'F';
        this.peso = comprobarPeso(peso);
    }

    public Electrodomestico(String nombre, double precioBase, String color, char consumoElectrico, int peso) {
        this.nombre = nombre;
        this.precioBase = comprobarPrecio(precioBase);
        this.color = comprobarColor(color);
        this.consumoElectrico = comprobarConsumoEnergetico(consumoElectrico);
        this.peso = comprobarPeso(peso);
    }

    public String getNombre(){
        return this.nombre;
    }

    public static char comprobarConsumoEnergetico(char letra) {
        char l;

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            l = (letra);
        } else {
            l = 'F';
        }

        return l;
    }

    public static String comprobarColor(String color) {
        String c;

        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            c = color;
        } else {
            c = "Blanco";
        }

        return c;
    }

    public static int comprobarPeso(int i) {
        int p;

        if (i < 0) {
            p = 5;
        } else {
            p = i;
        }

        return p;
    }

    public static double comprobarPrecio(double i) {
        double p;

        if (i < 0) {
            p = 100;
        } else {
            p = i;
        }

        return p;
    }

    public abstract double precioFinal();
    
    public abstract int dondeEstoy();
    
    public abstract void mostrarElectrodomestico();

}
