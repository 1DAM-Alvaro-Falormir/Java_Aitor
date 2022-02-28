/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_aitor;

/**
 *
 * @author ciber
 */
public class Astro {
    protected double radioEcuatorial;
    protected double rotacionMismoEje;
    protected double masa;
    protected double temperaturaMedia;
    protected double gravedad;

    public Astro() {
    }

    public Astro(double radioEcuatorial, double rotacionMismoEje, double masa, double temperaturaMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionMismoEje = rotacionMismoEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public double getRotacionMismoEje() {
        return rotacionMismoEje;
    }

    public void setRotacionMismoEje(double rotacionMismoEje) {
        this.rotacionMismoEje = rotacionMismoEje;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
    
    public void muestra(){
        System.out.println("- Radio ecuatorial: "+this.radioEcuatorial);
        System.out.println("- Rotacion sobre su eje: "+this.rotacionMismoEje);
        System.out.println("- Masa: "+this.masa);
        System.out.println("- Temperatura media: "+this.temperaturaMedia);
        System.out.println("- Gravedad: "+this.gravedad);
    }
    
}
