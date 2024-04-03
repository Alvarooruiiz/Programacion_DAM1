package PilaDinamica_7_13;

import java.util.Arrays;
import java.util.Objects;

public class Lista {

    Integer tabla[];

    public Lista() {
        tabla = new Integer[0];
    }
    int numElementos(){
        return tabla.length;
    }

    void insertarPrincipio(Integer num) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = num;
    }

    void insertarFinal(Integer num) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = num;
    }

    void insertarIndice(Integer num, int indice) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, indice, tabla, indice + 1, tabla.length - indice + 1);
        tabla[indice] = num;
    }

    void insertarFinalLista(int lista2[]) {
        tabla = Arrays.copyOf(tabla, tabla.length + lista2.length);
        System.arraycopy(lista2, 0, tabla, tabla.length, lista2.length);
    }

    void eliminarIndice(int indice) {
        for (int i = indice + 1; i < tabla.length; i++) {
            tabla[i - 1] = tabla[i];
        }
        tabla = Arrays.copyOf(tabla, tabla.length - 1);
    }

    Integer obtenerNumeroConIndice(int indice) {
        Integer num = tabla[indice];
        return num;
    }

    int obtenerIndiceConNumero(Integer num) {
        boolean esta = false;
        int indice = -1;
        for (int i = 0; i < tabla.length; i++) {
            if (Objects.equals(tabla[i], num)) {
                esta = true;
                indice = i;
            }
        }
        return indice;
    }
    
    void mostrarLista(){
        System.out.println("Lista: " + Arrays.toString(tabla));
    }
}

