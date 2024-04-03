package juegocartas;

import java.util.Arrays;


public class JuegoCartas {
    
    public static void mostrarBaraja(CartaEspanola[] baraja) {
        
        for (CartaEspanola c: baraja) {
            System.out.println(c.toString());
        }
    }


    public static void main(String[] args) {
        
        CartaEspanola[] baraja = new CartaEspanola[] {
            new CartaEspanola(2,3),
            new CartaEspanola(2,8),
            new CartaEspanola(1,6),
            new CartaEspanola(3,12),
            new CartaEspanola(4,10),
            new CartaEspanola(3,1),
      
        };
        
        mostrarBaraja(baraja);
        System.out.println("\n\n");
        
        Arrays.sort(baraja);
        
        mostrarBaraja(baraja);
        System.out.println("\n\n");
    }
    
}
