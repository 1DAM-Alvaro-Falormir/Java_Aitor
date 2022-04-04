/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

public class AudioLibro extends Libro {

    private boolean sintetizador;
    private int   horasDuracion;
    private int   minDuracion;
    
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
        String resp = null;
        
        return resp;
    }

    @Override
    public float precioAlquilerArticulo(int dias) {
        float precio = 0;
        
        return precio;
    }

    @Override
    public boolean guardaComentario(String c) {
        boolean resp=false;
        
        return resp;
    }

}
