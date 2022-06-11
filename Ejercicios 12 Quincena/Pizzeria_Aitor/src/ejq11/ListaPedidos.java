/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejq11;

import java.util.ArrayList;

/**
 *
 * @author ciber
 */
public class ListaPedidos {
    private ArrayList<Pedido> listaPedidos;
    private int activo = 0;

    public ListaPedidos() {
        listaPedidos = new ArrayList();
    }

    public ListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
    
    public int getActivo() {
        return activo;
    }
    
    public void setActivo(int i) {
        this.activo = i;
    }
    
    public Pedido getPedidoActivo() {
        return listaPedidos.get(activo);
    }

    public int getSize() {
        return listaPedidos.size();
    }
    
    public Pedido getSiguiente() {
        Pedido order;
        
        if (activo < getSize() - 1){
            order = listaPedidos.get(activo + 1);
            activo++;
        }
        else {
            order = null;
        }
        
        return order;
        
    }
    
    public Pedido getAnterior() {
        Pedido order;
        
        if (activo > 0) {
            order = listaPedidos.get(activo - 1);
            activo--;
        }
        else {
            order = null;
        }
        return order;
    }
    
    public Pedido getPrimero() {
        activo = 0;
        return listaPedidos.get(activo);
    }
    
    public Pedido getUltimo() {
        activo = getSize() - 1;
        return listaPedidos.get(activo);
    }
    
    public boolean addPedido(Pedido order) {
        boolean ok = false;
        
        if (order != null) {
            ok = listaPedidos.add(order);
        }
        return ok;
    }
    
    
}
