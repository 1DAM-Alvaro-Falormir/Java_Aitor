/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejq11;

/**
 *
 * @author ciber
 */
public class Utilidades {

    public static boolean checkRango(int i) throws ExcepcionPropia {
        boolean ok = false;

        if (i < 1 || i > 10) {
            throw new ExcepcionPropia("ERROR La cantidad tiene que estar entre 1 y 10");
        } else {
            ok = true;
        }

        return ok;
    }

    public static boolean checkDni(String dni) throws ExcepcionPropia {
        boolean ok = false;
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        int valorDni = Integer.parseInt(dni.substring(0, 8)), letraValida = valorDni % 23;
        if (dni.charAt(8) == letrasDni.charAt(letraValida)) {
            ok = true;
        } else {
            throw new ExcepcionPropia("La letra del dni: " + dni + " no es valida.");
        }

        return ok;
    }
    
    
}
