/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_aitor;

/**
 *
 * @author ciber
 */
public abstract class Astro {
    protected double radioEcuatorial;
    protected double rotacionMismoEje;
    protected double masa;
    protected double temperaturaMedia;
    protected double gravedad;

    public abstract double getRadioEcuatorial();

    public abstract void setRadioEcuatorial(double radioEcuatorial);

    public abstract double getRotacionMismoEje();

    public abstract void setRotacionMismoEje(double rotacionMismoEje);

    public abstract double getMasa();

    public abstract void setMasa(double masa);

    public abstract double getTemperaturaMedia();

    public abstract void setTemperaturaMedia(double temperaturaMedia);

    public abstract double getGravedad();

    public abstract void setGravedad(double gravedad);
    
    public abstract void muestra();
    
}
