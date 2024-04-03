package ActRef_Ej17_PiramideRectangulo;

public class Rectangulo {
    private int altura;
    private int base;
    private static int rectangulosCreados;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
        this.rectangulosCreados++;
    }
    
    public void dibujarRectangulo(){
        
    }
    public String toString(){
        String rectanguloDibujo = "";
        for(int i=0; i<this.altura; i++){
            for(int j=0; j<this.base; j++){
                rectanguloDibujo+="*";
            }
            rectanguloDibujo+="\n";
        }
        return rectanguloDibujo;
    }
    
   public static int getRectangulosCreados(){
       return rectangulosCreados;
   }
    
}
