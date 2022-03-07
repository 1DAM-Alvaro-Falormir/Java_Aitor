/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2dntrimestre_aitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aitor
 */
public class ListaElectrodomesticos {

    ArrayList lista;

    public ListaElectrodomesticos() {
        this.lista = new ArrayList();
    }
    
    public void addElectrodomestico(Electrodomestico e) {
        this.lista.add(e);
    }

    public void addLavadora(Lavadora l) {
        this.lista.add(l);
    }

    public void addTelevision(Television t) {
        this.lista.add(t);
    }

    public void mostrarAllElectrodomesticos() {
        Electrodomestico e;
        for (Iterator it = this.lista.iterator(); it.hasNext();) {
            e = (Electrodomestico) it.next();
            e.mostrarElectrodomestico();
            System.out.println("------------------------------------------------");
        }
    }

    public boolean delElectrodomestico(String n) {
        Electrodomestico e;
        int index = 0;
        boolean del = false;
        for (Iterator it = this.lista.iterator(); it.hasNext();) {
            e = (Electrodomestico) it.next();
            if (n.equals(e.getNombre())) {
                this.lista.remove(index);
                del = true;
            }
            index++;
        }
        return del;
    }
    
    public void mostrarLavadoras8Kg(){
        Electrodomestico e;
        Lavadora l;
        int index = 0;
        for (Iterator it = this.lista.iterator(); it.hasNext();) {
            e = (Electrodomestico) it.next();
            if (e.dondeEstoy() == 0){
                l = (Lavadora) this.lista.get(index);
                if (l.getCarga() > 8){
                    l.mostrarElectrodomestico();
                    System.out.println("-------------------------------------------");
                }
            }
            index++;
        }
    }

}
