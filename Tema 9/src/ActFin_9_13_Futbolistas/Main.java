package ActFin_9_13_Futbolistas;

import java.util.Arrays;
import java.util.Comparator;


public class Main {
    private static void mostrarJugadores(Futbolista[] jugadores){
        
        for(Futbolista f : jugadores){
            
            System.out.println(f.toString());
        }
    }
    
    public static void main(String[] args) {        
        Futbolista[] jugadores = new Futbolista[]{
            new Futbolista(6,"Albert",23,12),
            new Futbolista(3,"Albert",19,12),
            new Futbolista(4,"Albert",27,12),
        };
            Arrays.sort(jugadores);
            System.out.println("EQUIPO ORDEN NATURAL");
            mostrarJugadores(jugadores);
            
            ComparadorDeEdades c = new ComparadorDeEdades();
            Arrays.sort(jugadores,c);
            System.out.println("\nEQUIPO ORDEN CON COMPARATOR(EDAD)");
            mostrarJugadores(jugadores);
            
            ComparadorNombre cn = new ComparadorNombre();
            Arrays.sort(jugadores,cn);
            System.out.println("\nEQUIPO ORDEN CON COMPARATOR(NOMBRE)");
            mostrarJugadores(jugadores);
            
            //Si se quiere poner una condicion por si fuesen iguales los datos habria que cambiar el comparator
            
            
            //Esta forma seria medai clase anonima
            Arrays.sort(jugadores, new Comparator<Futbolista>(){
            @Override
            public int compare(Futbolista o1, Futbolista o2) {
                int resultado = o1.getEdad()-o2.getEdad();
                if(resultado==0){
                    resultado = o1.getNombre().compareTo(o2.getNombre());
                }
                return resultado;
            }
              
            });
            System.out.println("ORDENADO POR CLASE ANONIMA");
            mostrarJugadores(jugadores);
            
            //Esta seria la forma optima de hacer los Comparator (Lambda expression)
            Arrays.sort(jugadores,
                    (o1, o2)->o1.getNombre().compareTo(o2.getNombre()));
            System.out.println("ORDENADO POR LAMDA EXPRESSION");
            mostrarJugadores(jugadores);
        }
}
