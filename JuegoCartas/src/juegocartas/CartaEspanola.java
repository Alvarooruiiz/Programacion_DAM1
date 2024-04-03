package juegocartas;

public class CartaEspanola extends Carta{
    
    private static String[] nombrePalos = {"Oros","Bastos","Espadas","Copas"};
    private static String[] nombreNumeros = {"Sota","Caballo","Rey"};
    
    public CartaEspanola(int palo, int numero) {
        super(palo, numero);
        
        if ((numero == 8) || (numero == 9)) {
            this.setNumero(7);
        }
    }
    
    public String getPalo() {
     
        return nombrePalos[this.palo-1];
        
    }
    
    public String getNumero() {
        
        String cadena = "";
        
        if ((numero >= 10) && (numero <= 12)) {
            cadena = nombreNumeros[numero-10];
        } else {
            cadena = numero + "";
        }
        
        return cadena; 
    }

    
    
    
}
