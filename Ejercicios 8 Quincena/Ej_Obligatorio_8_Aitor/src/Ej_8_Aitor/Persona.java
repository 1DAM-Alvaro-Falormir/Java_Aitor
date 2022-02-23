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
    private Cuenta cuentasBank[] = new Cuenta[3];
    
    
    public Persona(String dni){
        this.dni = dni;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setCuentaBank(Cuenta cuentaBank, int i){
        this.cuentasBank[i] = cuentaBank;
    }
    
    public boolean morosa(){
        boolean morosos = false;
        
        for (int i = 0; i < cuentasBank.length; i++) {
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
    
    public int getCuentasBankLength(){
        return cuentasBank.length;
    }
}
