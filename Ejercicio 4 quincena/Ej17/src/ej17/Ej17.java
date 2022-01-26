/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17;

import java.util.Scanner;

/**
 *
 * @author ciber
 */
public class Ej17 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int hora, min, sec;
        System.out.println("Introduzca la hora, minutos y segundos en ese orden");
        hora = entry.nextInt();
        min = entry.nextInt();
        sec = entry.nextInt();
        if (hora <= 24) {
            sec++;
            if (sec >= 60) {
                sec = sec - 60;
                min++;
                if (min >= 60) {
                    min = min - 60;
                    hora++;
                    if (hora > 24) {
                        hora = hora - 24;
                    } else if (hora == 24) {
                        hora = 0;
                    }
                }
            } System.out.println("La hora pasadas un segundo son: " + hora + ":" + min + ":" + sec);
        }else{
            System.err.println("Hora incorrecta, introduzca una hora menor o igual a 24");
        }
    }

}
