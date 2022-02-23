/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej_8_Aitor;

/**
 *
 * @author Aitor
 */
public class Cuenta {
    private String iban;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void recibirAbonos(double abonos){
        this.iban += abonos;
    }
    
    public void pagarRecibos(double recibos){
        this.saldo -= recibos;
    }
    
    public static boolean comprobarIBAN(String iban) {
        boolean corr = false;
        if (iban.matches("([a-zA-Z]{2})\\s*\\t*(\\d{2})\\s*\\t*(\\d{4})\\s*\\t*(\\d{4})\\s*\\t*(\\d{2})\\s*\\t*(\\d{10})"))
            corr = true;
        else 
            corr = false;
        
        return corr;
    }
    
    
}
