/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejq11;

/**
 *
 * @author ciber
 */
public class Pedido {
    private String nombreC;
    private String apeC;
    private String dni;
    private String nomPizza;
    private int cantidad;
    private boolean extras;
    private int Ingextras1;
    private int Ingextras2;
    private int Ingextras3;

    public Pedido() {
    }

    public Pedido(String nombreC, String apeC, String dni, String nomPizza, int cantidad, boolean extras, int Ingextras1, int Ingextras2, int Ingextras3) {
        this.nombreC = nombreC;
        this.apeC = apeC;
        this.dni = dni;
        this.nomPizza = nomPizza;
        this.cantidad = cantidad;
        this.extras = extras;
        this.Ingextras1 = Ingextras1;
        this.Ingextras2 = Ingextras2;
        this.Ingextras3 = Ingextras3;
    }

    public Pedido(String nombreC, String apeC, String dni, String nomPizza, int cantidad, boolean extras) {
        this.nombreC = nombreC;
        this.apeC = apeC;
        this.dni = dni;
        this.nomPizza = nomPizza;
        this.cantidad = cantidad;
        this.extras = extras;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getApeC() {
        return apeC;
    }

    public void setApeC(String apeC) {
        this.apeC = apeC;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNomPizza() {
        return nomPizza;
    }

    public void setNomPizza(String nomPizza) {
        this.nomPizza = nomPizza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }

    public int getIngextras1() {
        return Ingextras1;
    }

    public void setIngextras1(int Ingextras1) {
        this.Ingextras1 = Ingextras1;
    }

    public int getIngextras2() {
        return Ingextras2;
    }

    public void setIngextras2(int Ingextras2) {
        this.Ingextras2 = Ingextras2;
    }

    public int getIngextras3() {
        return Ingextras3;
    }

    public void setIngextras3(int Ingextras3) {
        this.Ingextras3 = Ingextras3;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nombreC=" + nombreC + ", apeC=" + apeC + ", dni=" + dni + ", nomPizza=" + nomPizza + ", cantidad=" + cantidad + ", extras=" + extras + ", Ingextras1=" + Ingextras1 + ", Ingextras2=" + Ingextras2 + ", Ingextras3=" + Ingextras3 + '}';
    }
    
    
}
