package ActRef_Ej16_PuntoLinea;

public class Punto {
    double x;
    double y;
    
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }
    
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
    
}
