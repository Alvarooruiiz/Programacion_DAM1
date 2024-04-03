package ActRef_Ej14_FichaDomino;

public class FichaDomino {
    int lado1;
    int lado2;
    
    public FichaDomino(int lado1, int lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    public boolean encaja(FichaDomino f1){
        return this.lado1==f1.lado1 || this.lado1==f1.lado2 || this.lado2==f1.lado1 || this.lado2==f1.lado2;
    }
    
    public FichaDomino voltea(){
        return new FichaDomino(lado2,lado1);
    }
    
    public String toString(){
        return "[" + this.lado1 + "|" + this.lado2 + "]";
    }
}
