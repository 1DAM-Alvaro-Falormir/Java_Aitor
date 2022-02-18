/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundirlaflota_aitor;

/**
 *
 * @author Aitor
 */
public class HundirLaFlota_Aitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] tablero = Tablero.crearTablero();
        char[][] usuario = Tablero.crearTablero();
        int cont = 1,hundidos = 0;
        boolean ganado = true;
        /*while(cont <= 50 && ganado){
            System.out.println("Llevas "+cont+" de 50 intentos");
            System.out.println("---------------------");
            Tablero.mostrarTablero(usuario);
            switch(Tablero.disparo(tablero, usuario)){
                case 1:
                    hundidos++;
                    break;
                case 0:
                    break;
                case -1:
                    hundidos--;
                    break;
            }
            if(hundidos == 10){
                System.out.println("Has ganado");
                ganado = false;
            }
            cont++;
        }*/
        Barcos.insertarAcorazado(tablero);
        Tablero.mostrarTablero(tablero);
        //Tablero.mostrarTablero(usuario);
        
    }
    
}
