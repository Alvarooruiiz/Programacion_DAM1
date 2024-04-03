package ActRef_Ej10_Ameba;

public class Ameba {
    private int peso;

    public Ameba() {
        this.peso = 3;
    }
    
    public void come(int c){
        this.peso+=c-1;
    }
    public void come(Ameba c){
        this.peso+=c.peso-1;
        c.peso=0;
    }
    
    public String toString(){
        return "Soy una ameba y peso " + this.peso + " microgramos";
    }
    
    
}
