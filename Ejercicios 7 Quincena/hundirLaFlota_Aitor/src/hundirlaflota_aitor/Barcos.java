/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundirlaflota_aitor;

/**
 *
 * @author aitgal
 */
public class Barcos {

    public static int numeroRandom() {
        return (int) (Math.random() * 10);
    }

    public static void insertarLancha(char[][] tablero) {
        int rng1 = numeroRandom(), rng2 = numeroRandom();
        if (tablero[rng1][rng2] == '-') {
            tablero[rng1][rng2] = 'L';
        } else {
            do {
                rng1 = numeroRandom();
                rng2 = numeroRandom();
                if (tablero[rng1][rng2] == '-') {
                    tablero[rng1][rng2] = 'L';
                }
            } while (tablero[rng1][rng2] != '-');
        }
    }

    public static void insertarBuque(char[][] tablero) {
        int rng1 = numeroRandom(), rng2 = numeroRandom();
        boolean exit = true;
        do {
            if (tablero[rng1][rng2] == '-' && (rng2 + 2) < 10) {
                tablero[rng1][rng2] = 'B';
                if (tablero[rng1][rng2 + 1] == '-') {
                    tablero[rng1][rng2 + 1] = 'B';
                    if (tablero[rng1][rng2 + 2] == '-') {
                        tablero[rng1][rng2 + 2] = 'B';
                        exit = false;
                    }
                }

            } else if (tablero[rng1][rng2] == '-' && (rng2 + 2) > 10) {
                tablero[rng1][rng2] = 'B';
                if ((rng2 + 1) == 9 && tablero[rng1][rng2 + 1] == '-') {
                    tablero[rng1][rng2 + 1] = 'B';
                    if (tablero[rng1][rng2 - 1] == '-') {
                        tablero[rng1][rng2 - 1] = 'B';
                        exit = false;
                    }
                } else if (tablero[rng1][rng2 - 1] == '-') {
                    tablero[rng1][rng2 - 1] = 'B';
                    if (tablero[rng1][rng2 - 2] == '-') {
                        tablero[rng1][rng2 - 2] = 'B';
                        exit = false;
                    }
                } else {
                    rng1 = numeroRandom();
                    rng2 = numeroRandom();
                    exit = true;
                }
            }
        } while (exit);

    }

    public static void insertarAcorazado(char[][] tablero) {
        int rng1 = numeroRandom(), rng2 = numeroRandom();
        boolean exit = true;
        do {
            if (tablero[rng1][rng2] == '-' && (rng2 + 3) < 10) {
                tablero[rng1][rng2] = 'Z';
                if (tablero[rng1][rng2 + 1] == '-') {
                    tablero[rng1][rng2 + 1] = 'Z';
                    if (tablero[rng1][rng2 + 2] == '-') {
                        tablero[rng1][rng2 + 2] = 'Z';
                        if (tablero[rng1][rng2 + 3] == '-') {
                            tablero[rng1][rng2 + 3] = 'Z';
                            exit = false;
                        }
                    }
                }

            } else if (tablero[rng1][rng2] == '-' && (rng2 + 3) >= 10) {
                tablero[rng1][rng2] = 'Z';
                if ((rng2 + 2) == 9 && tablero[rng1][rng2 + 2] == '-') {
                    tablero[rng1][rng2 + 2] = 'Z';
                    if (tablero[rng1][rng2 + 1] == '-') {
                        tablero[rng1][rng2 + 1] = 'Z';
                        if (tablero[rng1][rng2 - 1] == '-') {
                            tablero[rng1][rng2 - 1] = 'Z';
                            exit = false;
                        }
                    }
                } else if ((rng2 + 1) == 9 && tablero[rng1][rng2 + 1] == '-') {
                    tablero[rng1][rng2 + 1] = 'Z';
                    if (tablero[rng1][rng2 - 1] == '-') {
                        tablero[rng1][rng2 - 1] = 'Z';
                        if (tablero[rng1][rng2 - 2] == '-') {
                            tablero[rng1][rng2 - 2] = 'Z';
                            exit = false;
                        }
                    }
                } else if ((rng2 + 1) > 9 && tablero[rng1][rng2 - 1] == '-') {
                    tablero[rng1][rng2 + - 1] = 'Z';
                    if (tablero[rng1][rng2 - 2] == '-') {
                        tablero[rng1][rng2 - 2] = 'Z';
                        if (tablero[rng1][rng2 - 3] == '-') {
                            tablero[rng1][rng2 - 3] = 'Z';
                            exit = false;
                        }
                    }
                } else {
                    rng1 = numeroRandom();
                    rng2 = numeroRandom();
                    exit = true;
                } 
            }
        } while (exit);
    }
}
