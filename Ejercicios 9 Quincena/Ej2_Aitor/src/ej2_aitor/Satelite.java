/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_aitor;

/**
 *
 * @author ciber
 */
public class Satelite extends Astro{
    private String nombre;
    private double distanciaPlaneta;
    private double orbitaPlaneta;
    private String estoyEn;

    public Satelite() {
    }

    public Satelite(String nombre, double distanciaPlaneta, double orbitaPlaneta, Planeta mio, double radioEcuatorial, double rotacionMismoEje, double masa, double temperaturaMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionMismoEje = rotacionMismoEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
        this.nombre = nombre;
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlaneta = orbitaPlaneta;
        this.estoyEn = mio.getNombre();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public double getOrbitaPlaneta() {
        return orbitaPlaneta;
    }

    public void setOrbitaPlaneta(double orbitaPlaneta) {
        this.orbitaPlaneta = orbitaPlaneta;
    }

    public String getEstoyEn() {
        return estoyEn;
    }

    public void setEstoyEn(String estoyEn) {
        this.estoyEn = estoyEn;
    }
    
    @Override
    public void muestra(){
        System.out.println("- Radio ecuatorial: "+this.radioEcuatorial);
        System.out.println("- Rotacion sobre su eje: "+this.rotacionMismoEje);
        System.out.println("- Masa: "+this.masa);
        System.out.println("- Temperatura media: "+this.temperaturaMedia);
        System.out.println("- Gravedad: "+this.gravedad);
        System.out.println("- Nombre del satelite: "+this.nombre);
        System.out.println("- Distancia al planeta: "+this.distanciaPlaneta);
        System.out.println("- Orbita al planeta: "+this.orbitaPlaneta);
        System.out.println("- Pertenezco al planeta: "+this.estoyEn);
    }
    
    @Override
    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    @Override
    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    @Override
    public double getRotacionMismoEje() {
        return rotacionMismoEje;
    }

    @Override
    public void setRotacionMismoEje(double rotacionMismoEje) {
        this.rotacionMismoEje = rotacionMismoEje;
    }

    @Override
    public double getMasa() {
        return masa;
    }

    @Override
    public void setMasa(double masa) {
        this.masa = masa;
    }

    @Override
    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    @Override
    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    @Override
    public double getGravedad() {
        return gravedad;
    }

    @Override
    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
    
}
