package examentema5_ruizenriquez_alvaro;

import java.util.Scanner;
import java.util.Arrays;

public class ExamenTema5_RuizEnriquez_Alvaro {

    public static Scanner sc = new Scanner(System.in);

    public static int generarAleatorio(int minimo, int maximo) {
        int numRdm = (int) Math.floor(Math.random() * maximo + minimo);
        return numRdm;
    }

    public static void mostrarTablero(int t[][], int numColum) {

        System.out.println();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {

                System.out.print("| " + t[i][j]);
            }
            System.out.println(" |");
        }

        System.out.println("--------------");
        for (int i = 1; i <= numColum; i++) {
            System.out.print("|C" + i);
        }
        System.out.println(" |");

    }

    public static void inicializarTablero(int t[][], int numColumnas) {
        boolean ordenacion = true, lleno = false, salir = false;
        int i = 0;
        int tAux[] = new int[numColumnas];

        do {
            int numRdm = generarAleatorio(1, 9);
            System.out.println("Debe colocar el numero " + numRdm);

            System.out.println("Introduzca la columna (1 - " + numColumnas + ") donde quiere introducir el numero " + numRdm);
            int col = sc.nextInt();
            int x = 0;
            do {
                if (t[x][col - 1] == 0) {
                    t[x][col - 1] = numRdm;
                    salir = true;
                } else {
                    x++;
                }

            } while (salir == false);
            salir = false;
            for (int j = 0; j < t[x].length; j++) {
                tAux[j] = t[x][j];
            }
            ordenacion = ordenada(tAux, col - 1);
            mostrarTablero(t, numColumnas);
            i++;
        } while (ordenacion == true && i <= t.length * t[0].length);
        if (!ordenacion) {
            System.out.println("Perdiste");
        } else {
            System.out.println("Ganaste");
        }
    }

    public static int numeroColumnas() {
        int numColum = 0;
        do {
            System.out.print("Introduzca el numero de columnas(4/6): ");
            numColum = sc.nextInt();
        } while (numColum != 4 && numColum != 6);

        return numColum;
    }

    public static boolean ordenada(int t[], int col) {
        boolean orden = true;
        int i = 0;
        while (i < col) {
            if (t[i] != 0) {
                if (t[i] <= t[col]) {
                    orden = orden && true;
                } else {
                    orden = false;
                }
            }
            i++;
        }
        i = col + 1;
        while (i < t.length) {
            if (t[i] != 0) {
                if (t[i] >= t[col]) {
                    orden = orden && true;
                } else {
                    orden = false;
                }
            }
            i++;
        }
        return orden;
    }

    public static void main(String[] args) {
        int numColum = numeroColumnas();

        int tablero[][] = new int[5][numColum];

        mostrarTablero(tablero, numColum);
        inicializarTablero(tablero, numColum);

    }

}
