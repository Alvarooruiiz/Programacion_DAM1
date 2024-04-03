package juegocartas;


public class Carta implements Comparable<Carta>{
    
    protected int palo;
    protected int numero;
    
    public Carta(int palo, int numero) {
        this.palo = 1;
        if ((palo >= 1) && (palo <= 4))
            this.palo = palo;
        
        this.numero = 1;
        if ((numero >= 1) && (numero <= 12))
            this.numero = numero;
    }
    
    public String getNumero() {
        return this.numero+"";
    }
    
    public String getPalo() {
        return this.palo+"";
    }


    public void setPalo(int palo) {
       if ((palo >= 1) && (palo <= 4))
            this.palo = palo;
    }

    public void setNumero(int numero) {
        if ((numero >= 1) && (numero <= 12))
            this.numero = numero;
    }

    @Override
    public String toString() {
        return "Tipo de Carta: " + this.getClass().getSimpleName() + " - " + this.getNumero() + " de " + this.getPalo();
    }

    @Override
    public int compareTo(Carta o) {
        
        int resultado = this.numero - o.numero;
        if (resultado == 0) {
            resultado = this.palo - o.palo;
        }
        
        return resultado;
    }
    
    
    public static Carta crearCartaAleatorio() {
        return new Carta((int)(Math.random()*4)+1, (int)(Math.random()*12)+1);
    }
    
    
    
    
    
}
