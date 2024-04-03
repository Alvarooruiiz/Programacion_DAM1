package ActRef_Ej9_Movil;

public class Movil extends Terminal{
    String tarifa;
    private double precioTotal;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa=tarifa;
    }
    
    @Override
     public void llama(Terminal t, int segundosDeLlamada){
         super.llama(t, segundosDeLlamada);
         double minutos=segundosDeLlamada/60;
         switch(this.tarifa){
             case "rata"->{
                 this.precioTotal+=(minutos*0.06);
                 break;
             }
             case "mono"->{
                 this.precioTotal+=(minutos*0.12);
                 break;
             }
             case "bisonte"->{
                 this.precioTotal+=(minutos*0.30);
                 break;
             }
            
         }
     }

    public double getPrecioTotal() {
        return precioTotal;
    }
         
    @Override
    public String toString() {
        return "Nº " + this.getNumero() + " - " + this.getTiempoConversacion() + "s de conversacion - tarificados " + this.getPrecioTotal() + " euros";
    }
}
