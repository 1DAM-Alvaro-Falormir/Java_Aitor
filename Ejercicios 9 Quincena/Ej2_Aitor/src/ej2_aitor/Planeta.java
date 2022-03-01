/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_aitor;

/**
 *
 * @author ciber
 */
public class Planeta extends Astro{
    private String nombre;
    private double distanciaSol;
    private double orbitaSol;
    private boolean haySatelites;

    public Planeta() {
    }

    public Planeta(String nombre, double distanciaSol, double orbitaSol, boolean haySatelites, double radioEcuatorial, double rotacionMismoEje, double masa, double temperaturaMedia, double gravedad) {
        super(radioEcuatorial, rotacionMismoEje, masa, temperaturaMedia, gravedad);
        this.nombre = nombre;
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.haySatelites = haySatelites;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getOrbitaSol() {
        return orbitaSol;
    }

    public void setOrbitaSol(double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public boolean isHaySatelites() {
        return haySatelites;
    }

    public void setHaySatelites(boolean haySatelites) {
        this.haySatelites = haySatelites;
    }
    
    @Override
    public void muestra(){
        System.out.println("- Radio ecuatorial: "+this.radioEcuatorial);
        System.out.println("- Rotacion sobre su eje: "+this.rotacionMismoEje);
        System.out.println("- Masa: "+this.masa);
        System.out.println("- Temperatura media: "+this.temperaturaMedia);
        System.out.println("- Gravedad: "+this.gravedad);
        System.out.println("- Este es el nombre del planeta: "+this.nombre);
        System.out.println("- Distancia al Sol: "+this.distanciaSol);
        System.out.println("- Orbita al Sol: "+this.orbitaSol);
        System.out.println("- Tiene satelites? "+this.haySatelites);
    }

    }
