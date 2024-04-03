package ActividadesAplicacion;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda_6_14 {

    public static String[] añadirContacto(String t[], int tam) {
        String tAux[] = new String[tam];
        
        System.out.println("El contacto debe introducirse de la siguiente manera 'nombre:telefono'");
        String contacto = sc.next();
        
        t[tam-1] = contacto;
        
        return tAux;
    }

    public static void buscarTelefono(String t[]) {
        System.out.println("Introduzca el nombre del telefono que se busca (en minúsculas)");
        String nombre = sc.next();
        boolean esta = false;
        String tlfn = "";
        String[] tlfnAux;

        do {
            for (int i = 0; i < t.length; i++) {
                tlfnAux = t[i].split(":");
                if (tlfnAux[0] == null ? nombre == null : tlfnAux[0].equals(nombre)) {
                    tlfn = tlfnAux[1];
                    esta = true;
                }
            }
        } while (esta == false);

        System.out.println(tlfn);
    }

    public static void mostrarInfo(String t[]) {
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sel, tam = 1;
        String agenda[] = new String[tam];

        do {
            System.out.println("Introduzca un numero del 1-3: \n 1-Añadir contacto \n 2-Buscar telf a partir de su nombre \n 3-mostrar info \n 0-Para salir");
            sel = sc.nextInt();
            String tAux[];
            switch (sel) {
                case 1 -> {
                    tAux=añadirContacto(agenda, tam);
                    tam++;
                }
                case 2 ->
                    buscarTelefono(agenda);
                case 3 ->
                    mostrarInfo(agenda);
            }
            agenda=tAux;
        } while (sel != 0);

    }
}
