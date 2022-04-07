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

public class AudioLibro extends Libro {

    private boolean sintetizador;
    private int horasDuracion;
    private int minDuracion;

    public AudioLibro(boolean sintetizador, int horasDuracion, int minDuracion, int numPaginas, String cod, String nombre, String fecha, int anyo, String resumen, String autor, boolean deteriorado) {
        super(numPaginas, cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.sintetizador = sintetizador;
        this.horasDuracion = horasDuracion;
        this.minDuracion = minDuracion;
    }

    public int getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(int horasDuracion) {
        this.horasDuracion = horasDuracion;
    }

    public int getMinDuracion() {
        return minDuracion;
    }

    public void setMinDuracion(int minDuracion) {
        this.minDuracion = minDuracion;
    }

    public boolean isSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(boolean sintetizador) {
        this.sintetizador = sintetizador;
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
                + "\nEsta narrador por voz sintetizada? " + isSintetizador()
                + "\nDuracion del audiolibro: " + getHorasDuracion() + ":" + getMinDuracion()
                + "\nNúmero de páginas: " + getNumPaginas()
                + "\n¿Esta deteriorado? " + isDeteriorado()
                + "\nComentario sobre el deterioro: " + getComentarios().toString()
                + "\nPrecio alquiler por dia: " + Articulo.getPreciobase() + " por 1 dia.";

        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio;

        precio = Articulo.getPreciobase() * dias;

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
