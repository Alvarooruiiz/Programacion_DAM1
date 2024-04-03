package ActRes_12_14_Temperaturas;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        
        Lista l = new Lista();
        
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros");
            System.out.println("3. Mostrar estadistica");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduzca una nueva temperatura");
                    int temp = sc.nextInt();
                    Registros r = new Registros(temp);
                    l.add(r);
                }
                case 2 ->{
                    System.out.println(l);
                }
                case 3 -> {
                    System.out.println(l.getMax());
                    System.out.println(l.getMin());
                    System.out.println(l.calcularPromedio());
                    
                }
                case 4 -> {
                    l.guardarFichero();
                }
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
    
    public void mostrarEstadisticas(){
        
    }
}
