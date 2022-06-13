/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

public class Alquiler {

    // Atributos
    private Articulo a;
    private int dias;
    private Cliente cli;

    public Alquiler(Articulo a, int dias, Cliente cli) {
        this.a = a;
        this.dias = dias;
        this.cli = cli;
    }

    public Articulo getA() {
        return a;
    }

    public void setA(Articulo a) {
        this.a = a;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public String info() {
        String resp;
        resp = a.info() + "\n"
                + "Dias alquilado: " + this.dias + "\n"
                + cli.info();
        return resp;
    }
}
