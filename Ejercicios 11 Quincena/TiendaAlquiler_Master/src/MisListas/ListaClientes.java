/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisListas;

import ADO.Cliente;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaClientes {
     private ArrayList<Cliente> listaCli;

    public ListaClientes() {
        this.listaCli = new ArrayList();
    }

    public ListaClientes(ArrayList<Cliente> listaCli) {
        this.listaCli = listaCli;
    }

    // Anadir Articuloyadir Vehiculo
    public boolean anadirCliente(Cliente cli) {
        boolean insertado = false;
        if (cli != null) {
            insertado = listaCli.add(cli);
        }
        return insertado;
    }
    
     public Cliente buscaCliente(String dni) {
        Cliente cli = null, enc = null;
        boolean encontrado = false;
        Iterator<Cliente> iterator = listaCli.iterator();
        while (iterator.hasNext() && encontrado == false) {
            cli = iterator.next();
            if (cli.getDni().equalsIgnoreCase(dni)) {
                enc = cli;
                encontrado = true;
            }
        }
        return enc;
    }
    
    public int numClientes() {
        int num = 0;
        num = listaCli.size();
        return num;
    }

    // Comprobar si la lista está vacía
    public boolean vaciaLista() {
        boolean vacia = false;
        if (listaCli == null) {
            vacia = true;
        }
        return vacia;
    }

    public boolean vaciarLista() {
        boolean vacia = false;
        if (listaCli == null) {
            vacia = true;
            listaCli.clear();
        }
        return vacia;
    }

    public Cliente getCliente(int i) {
        Cliente cli = null;
        if (i >= 0 && i <= numClientes() - 1) {
            cli = listaCli.get(i);
        }
        return cli;
    }

    // mostrar todos los precios
    public void mostrarDatos() {

        for (Cliente cli : listaCli) {
            System.out.println(cli.info());
            System.out.println("");
        }
        System.out.println();
    }
}
