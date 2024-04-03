package examentema5_ruizenriquezalvaro;

public class ExamenTema5_RuizEnriquezAlvaro {

    public static void main(String[] args) {
        int num = (int) (Math.random() * (15 - 5 + 1) + 5);
        int tabla[] = new int[num];

        rellenarArrayImpares(tabla);
        System.out.println("Rellenar Array con impares");
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("|%3d ", tabla[i]);
        }
        System.out.println("|");


        primeroPrimos(tabla);
        System.out.println("Tabla final");
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("|%3d ", tabla[i]);
        }
        System.out.println("|");

    }

    public static void rellenarArrayImpares(int[] t) {
        for (int i = 0; i < t.length; i++) {
            int num = (int) (Math.random() * 100 + 1);
            if (num % 2 != 0) {
                t[i] = num;
            } else {
                i--;
            }
        }
    }

    public static void primeroPrimos(int[] t) {
        int cont = 0, aux;
        int tabla[] = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            if (esPrimo(t[i])) {
                tabla[cont] = t[i];
                cont++;
            }
        }
        System.out.println(cont);

        ordenarAscendente(tabla, cont);
        aux=cont;

        for (int i = 0; i < t.length; i++) {
            if (esPrimo(t[i]) == false) {
                tabla[cont] = t[i];
                cont++;

            }
        }
        System.out.println(cont);
        

        ordenarDescendente(tabla, aux);

        for (int i = 0; i < t.length; i++) {
            t[i] = tabla[i];
        }
    }

    public static void ordenarAscendente(int t[], int x) {
        int aux;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (t[j] > t[i]) {
                    aux = t[j];
                    t[j] = t[i];
                    t[i] = aux;
                }
            }
        }
    }

    public static void ordenarDescendente(int t[], int x) {
        int aux;
        for (int i = x; i < t.length; i++) {
            for (int j = x; j < t.length; j++) {
                if (t[j] < t[i]) {
                    aux = t[j];
                    t[j] = t[i];
                    t[i] = aux;
                }
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {

            if (numero % x == 0) {
                return false;
            }
        }
        return true;
    }
}
