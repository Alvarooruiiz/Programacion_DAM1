//package ActRefArray_Ej5_Gestimal;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n, stockIntrod, precioCompIntrd, precioVentIntrod;
//        String codiIntrod, descIntrod;
//        Gestimal g[] = new Gestimal[1];
//
//        g[0] = new Gestimal("12312", "asda", 65, 324, 12);
//        do {
//            System.out.println("========================");
//            System.out.println("1. Listado \n2. Alta \n3. Baja \n4. Modificacion \n5. Entrada de mercancia \n6. Salida de emergencia \n7. Salir");
//            System.out.println("========================");
//            System.out.print("Introduzca el numero de la seleccion que desea: ");
//            n = sc.nextInt();
//            System.out.println("========================");
//            switch (n) {
//                case 1 -> {
//                    for (Gestimal g1 : g) {
//                        System.out.println(g1);
//                    }
//                    break;
//                }
//                case 2 -> {
//
//                }
//                case 3 -> {
//
//                }
//                case 4 -> {
//                    System.out.print("Introduzca el codigo del disco a modificar: ");
//                    codiIntrod = sc.next();
//                    for (int i = 0; i < g.length; i++) {
//                        if (g[i].getCodigo().equals(codiIntrod)) {
//                            System.out.print("Introduzca la nueva descripción: ");
//                            descIntrod = sc.next();
//                            System.out.print("Introduzca el nuevo precio de compra: ");
//                            precioCompIntrd = sc.nextInt();
//                            System.out.print("Introduzca el nuevo precio de venta: ");
//                            precioVentIntrod = sc.nextInt();
//                            System.out.print("Introduzca el nuevo stock: ");
//                            stockIntrod = sc.nextInt();
//
//                            g[i] = new Gestimal(codiIntrod, descIntrod, precioCompIntrd, precioVentIntrod, stockIntrod);
//                            break;
//                        } else {
//                            System.out.println("El codigo introducido no existe");
//                        }
//                    }
//                    break;
//                }
//                case 5 -> {
//                    System.out.println("Introducir el codigo del producto que se desea introducir");
//                    String codigo = sc.next();
//                    System.out.println("Introducir la cantidad de producto");
//                    int cantidad = sc.nextInt();
//                    for(int i=0; i<g.length; i++){
//                         if (g[i].getCodigo().equals(codigo)){
//                             g[i].stock+=cantidad;
//                         }else System.out.println("El codigo introducido no pertenece a ningun producto en el almacen");
//                    }
//                }
//                case 6 -> {
//                    System.out.println("Introducir el codigo del producto que se desea introducir");
//                    String codigo = sc.next();
//                    System.out.println("Introducir la cantidad de producto");
//                    int cantidad = sc.nextInt();
//                    for (int i = 0; i < g.length; i++) {
//                        if (g[i].getCodigo().equals(codigo)) {
//                            if (cantidad < g[i].getStock()) {
//                                g[i].stock -= cantidad;
//                            } else {
//                                System.out.println("La cantidad introducida es superior al stock existente");
//                            }
//                        }else System.out.println("El codigo introducido no pertenece a ningun producto en el almacen");
//
//                    }
//                }
//                default ->
//                    System.out.println("El numero introducido no es correcto");
//
//            }
//        } while (n != 7);
//
//    }
//}
