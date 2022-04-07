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

public class LibroImpreso extends Libro {

    private boolean formato;
    private String tapa;

    public LibroImpreso(boolean formato, String tapa, int numPaginas, String cod, String nombre, String fecha, int anyo, String resumen, String autor, boolean deteriorado) {
        super(numPaginas, cod, nombre, fecha, anyo, resumen, autor, deteriorado);
        this.formato = formato;
        this.tapa = tapa;
    }

    public boolean isFormato() {
        return formato;
    }

    public void setFormato(boolean formato) {
        this.formato = formato;
    }

    public String getTapa() {
        return tapa;
    }

    public void setTapa(String tapa) {
        this.tapa = tapa;
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
                + "\nNúmero de páginas: " + getNumPaginas()
                + "\nTipo de tapa: " + getTapa()
                + "\n¿Tipo formato es papel?: " + isFormato()
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
