package ActRef_Ej16_PuntoLinea;

public class Linea {

    Punto inicio;
    Punto fin;
    public Linea(Punto inicio, Punto fin) {
        this.inicio=inicio;
        this.fin=fin;
    }
    
    public String toString(){
        return "La linea está formada por los puntos " + this.inicio + " y " + this.fin;
    }
    
}
