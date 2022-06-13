/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisListas;
import ADO.*;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author adminroot
 */
public class ListaAlquileres {
    
    private ArrayList<Alquiler> listaAlq;

    public ListaAlquileres(ArrayList<Alquiler> listaAlq) {
        this.listaAlq = listaAlq;
    }

    public ListaAlquileres() {
        this.listaAlq = new ArrayList();
    }
    
    public boolean anadirAlquiler(Alquiler alq){
        boolean insertado = false;
        if (alq != null) {
            insertado = listaAlq.add(alq);
        }
        return insertado;
    }
    
    public Alquiler buscaAlquileres(String codArt, String codSocio) {
        Alquiler alq = null, enc = null;
        boolean encontrado = false;
        Iterator<Alquiler> iterator = listaAlq.iterator();
        while (iterator.hasNext() && encontrado == false) {
            alq = iterator.next();
            if (alq.getA().getCodArt().equalsIgnoreCase(codArt) && alq.getCli().getCodSocio().equalsIgnoreCase(codSocio)) {
                enc = alq;
                encontrado = true;
            }
        }
        return enc;
    }
    
    public boolean borrarAlquiler(Alquiler alq) {
        boolean insertado = false;
        if (alq != null) {
            insertado = listaAlq.remove(alq);
        }
        return insertado;
    }
    
    public boolean borrarAlquiler(String codArt, String codSocio) {
        boolean insertado = false;
        Alquiler a;
        a = buscaAlquileres(codArt, codSocio);
        if (a != null) {
            insertado = listaAlq.remove(a);
        }
        return insertado;
    }
    
    public int numAlquileres() {
        int num = 0;
        num = listaAlq.size();
        return num;
    }
    
    // Comprobar si la lista está vacía
    public boolean vaciaLista() {
        boolean vacia = false;
        if (listaAlq == null) {
            vacia = true;
        }
        return vacia;
    }
    
    public boolean vaciarLista() {
        boolean vacia = false;
        if (listaAlq == null) {
            vacia = true;
            listaAlq.clear();
        }
        return vacia;
    }
    
    public Alquiler getAlquiler(int i) {
        Alquiler alq = null;
        if (i >= 0 && i <= numAlquileres() - 1) {
            alq = listaAlq.get(i);
        }
        return alq;
    }
    
    public void mostrarDatos() {

        for (Alquiler alq : listaAlq) {
            System.out.println(alq.info());
            System.out.println("");
        }
        System.out.println();
    }
    
}
