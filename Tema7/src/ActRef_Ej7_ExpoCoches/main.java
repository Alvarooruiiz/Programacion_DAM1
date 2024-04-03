package ActRef_Ej7_ExpoCoches;

import java.util.Scanner;

public class main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, x;
        int numeroEntradas;
        Zona principal = new Zona(1000);
        Zona reVenta = new Zona(200);
        Zona vip = new Zona(25);

        do {
            System.out.println();
            System.out.println("1-Mostrar numero de entradas");
            System.out.println("2-Vender entradas");
            System.out.println("3-Salir");
            n = sc.nextInt();
            if (n < 1 && n > 3) {
                System.out.println("El numero de la opcion introducido no es correcto");
            }
            switch (n) {
                case 1 -> {
                    System.out.println("Entradas zona principal: " + principal.getEntradasPorVender());
                    System.out.println("Entradas reVenta: " + reVenta.getEntradasPorVender());
                    System.out.println("Entradas zona vip: " + vip.getEntradasPorVender());
                }
                case 2 -> {
                    System.out.println("1-Comprar en la zona principal");
                    System.out.println("2-Comprar reventa");
                    System.out.println("3-Comprar en la zona vip");
                    System.out.println("Que tipo de entrada desea comprar");
                    x = sc.nextInt();
                    switch (x) {
                        case 1 -> {
                            System.out.println("Cuantas entradas desea comprar de la zona principal");
                            numeroEntradas = sc.nextInt();
                            principal.vender(numeroEntradas);
                        }
                        case 2 -> {
                            System.out.println("Cuantas entradas desea comprar de reventa");
                            numeroEntradas = sc.nextInt();
                            reVenta.vender(numeroEntradas);
                        }
                        case 3 -> {
                            System.out.println("Cuantas entradas desea comprar de la zona vip");
                            numeroEntradas = sc.nextInt();
                            vip.vender(numeroEntradas);
                        }
                    }
                }
            }
        } while (n != 3);

    }
}
