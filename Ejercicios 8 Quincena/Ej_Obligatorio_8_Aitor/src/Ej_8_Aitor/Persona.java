/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej_8_Aitor;

/**
 *
 * @author Aitor
 */
public class Persona {
    private final String dni;
    private int numCuentas = 0;
    private Cuenta cuentasBank[]  = new Cuenta[3];
    
    
    public Persona(String dni){
        this.dni = dni;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setCuentaBank(Cuenta cuentaBank){
        this.cuentasBank[numCuentas] = cuentaBank;
        numCuentas++;
    }
    
    public int getCuentasLength(){
        return cuentasBank.length;
    }
    
    public boolean morosa(){
        boolean morosos = false;
        
        for (int i = 0; i < numCuentas; i++) {
            if(this.cuentasBank[i].getSaldo() < 0)
                morosos = true;
        }
        return morosos;
    }
    
    public static boolean comprobarDNI(String dni) {
        boolean corr = false;
        if (dni.matches("\\d{8}[A-Za-z]")) 
            corr = true;
        else 
            corr = false;
        

        return corr;
    }
    
    public void getDatos(){
        System.out.println("Este es el dni de la persona: "+this.getDni());
        for (int i = 0; i < numCuentas; i++) {
            System.out.println("Este es el IBAN de la cuenta numero "+(i+1)+": "+cuentasBank[i].getIban()+" y este es el saldo: "+cuentasBank[i].getSaldo());
        }
    }
    
    public void setNomina(String iban, double nomina){
        for (int i = 0; i < numCuentas; i++) {
            if(this.cuentasBank[i].getIban().equals(iban)){
                this.cuentasBank[i].recibirAbonos(nomina);
            }
        }
    }
    
    public void setPago(String iban, double pago){
        for (int i = 0; i < numCuentas; i++) {
            if(this.cuentasBank[i].getIban().equals(iban)){
                this.cuentasBank[i].pagarRecibos(pago);
            }
        }
    }
    
    public int getNumCuentas(){
        return numCuentas;
    }
    
}
