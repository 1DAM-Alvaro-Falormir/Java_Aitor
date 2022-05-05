/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_aitor;

/**
 *
 * @author Aitor
 */
public class Ej6_Aitor {

    /**
     * @param args the command line arguments
     * @throws ej6_aitor.ExpectedNegativeNumberException
     * @throws ej6_aitor.ExpectedValidNameException
     */
    public static void main(String[] args) throws ExpectedNegativeNumberException, ExpectedValidNameException {
        Gato gato = new Gato("Pelusas", 6);
        Gato gato2 = new Gato();
        
        gato.imprime();
        
        try{
            gato.setEdad(6);
            gato.setNombre("Tu");
            gato.imprime();
            
            gato2.setEdad(5);
            gato2.setNombre("Trueno");
            gato2.imprime();
        }
        
        catch(ExpectedNegativeNumberException e){
            System.out.println("La edad no puede ser negativa");
        }
        
        catch(ExpectedValidNameException ex){
            System.out.println("El nombre tiene que tener un minimo de tres letras");
        }
        
    }
    
}
