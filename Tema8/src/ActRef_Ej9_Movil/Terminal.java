package ActRef_Ej9_Movil;

public class Terminal {
    private String numero;
    private int tiempoConversacion;
    
    public Terminal(String numero){
        this.numero=numero;
        this.tiempoConversacion=0;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero=numero;
    }
    
    public void setTiempoConver(int t){
        tiempoConversacion+=t;
    }
    
    public void llama(Terminal t, int segundosDeLlamada){
        this.tiempoConversacion+=segundosDeLlamada;
        t.tiempoConversacion += segundosDeLlamada;
        
    }

    public int getTiempoConversacion() {
        return tiempoConversacion;
    }
    

    @Override
    public String toString() {
        return "Nº " + numero + " - " + tiempoConversacion + "s de conversación";
    }
    
    
}
