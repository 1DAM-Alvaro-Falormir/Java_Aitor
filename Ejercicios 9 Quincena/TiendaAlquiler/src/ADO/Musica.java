/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

/**
 * 
 * @author Aitor
 */

public class Musica extends Articulo {

    private int nPistas;
    private float duracion;
    private String tipo; // cd o vinilo

    public Musica(int nPistas, float duracion, String tipo, String cod, String nombre, String fecha, int anyo, String resumen, String autor, boolean deteriorado) {
        super(cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.nPistas = nPistas;
        this.duracion = duracion;
        this.tipo = tipo;
    }

    public int getnPistas() {
        return nPistas;
    }

    public void setnPistas(int nPistas) {
        this.nPistas = nPistas;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String info() {
        String resp;
        resp = "Codigo Articulo: " + getCodArt()
                + "\nNombre: " + getNombre()
                + "\nFecha de alta: " + getFecha()
                + "\nFecha de creacion: " + getAnyo()
                + "\nResumen: " + getResumen()
                + "\nAutor: " + getAutor()
                + "\nNúmero de pistas: " + getnPistas()
                + "\nDuracion de la musica: " + getDuracion()
                + "\n¿En que formato esta? " + getTipo()
                + "\n¿Esta deteriorado? " + isDeteriorado()
                + "\nComentario sobre el deterioro: " + getComentarios().toString()
                + "\nPrecio alquiler por dia: " + Articulo.getPreciobase() + " por 1 dia.";
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;

        precio = (Articulo.getPreciobase() * dias) + 2;

        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp = false;

        if (c != null) {
            getComentarios().add(c);
            resp = true;
        }

        return resp;
    }

}
