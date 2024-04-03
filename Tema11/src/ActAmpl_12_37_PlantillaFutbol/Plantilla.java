package ActAmpl_12_37_PlantillaFutbol;

import java.util.*;

public class Plantilla {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Jugador> plantilla = new HashMap<>();

        altaJugador(plantilla, 7);
        altaJugador(plantilla, 5);
        altaJugador(plantilla, 4);
        System.out.println(plantilla);
        
//        System.out.println(eliminarJugador(plantilla, 5));
        System.out.println(plantilla);
        
        mostrar(plantilla);
        System.out.println("-----------------");
        mostrar(plantilla,"medio");
    }

    public static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        if (!plantilla.containsKey(dorsal)) {
            System.out.println("Introduzca el nombre");
            String nombre = sc.nextLine();
            System.out.println("Introduzca el dni");
            String dni = sc.nextLine();
            System.out.println("Introduzca la posicion");
            String posicion = sc.nextLine();
            Jugador j = new Jugador(dorsal, dni, nombre, posicion);
            plantilla.put(dorsal, j);
        }
    }
    
    public static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal){
        Jugador j= new Jugador();
        if(plantilla.containsKey(dorsal)){
            j = plantilla.get(dorsal);
            plantilla.remove(dorsal);
        }
        return j;
    }
    
    public static void mostrar(Map<Integer, Jugador> plantilla){
        List<Map.Entry<Integer, Jugador>> lista = new ArrayList<>(plantilla.entrySet());
        for(Map.Entry<Integer,Jugador> entry : lista){
            System.out.println(entry.getKey() + " " + entry.getValue().getNombre());
        }
    }
    public static void mostrar(Map<Integer, Jugador> plantilla, String posicion){
        List<Map.Entry<Integer, Jugador>> lista = new ArrayList<>(plantilla.entrySet());
        for(Map.Entry<Integer,Jugador> entry : lista){
            if(entry.getValue().getPosCampo().equals(posicion)){
                System.out.println(entry.getKey() + " " + entry.getValue().getNombre());
            }
            
        }
    }
}