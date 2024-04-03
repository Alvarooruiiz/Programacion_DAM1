package ActRef_Ej11_CorteIslandes;

public class TarjetaRegalo {
    double saldo;
    int num=(int)(Math.floor(Math.random()*100000));
    
    public TarjetaRegalo(double saldo){
        this.saldo=saldo;
    }
    
    public void gasta(double dinero){
        if(this.saldo<dinero){
            System.out.println("No tiene suficiente saldo para gastar " + dinero);
        }else{
            this.saldo-=dinero;
        }
    }
    
    public TarjetaRegalo fusionaCon(TarjetaRegalo tr2){
        TarjetaRegalo tr3 = new TarjetaRegalo(this.saldo+tr2.saldo);
        this.saldo=0;
        tr2.saldo=0;
        return tr3;
    }
    
    @Override
    public String toString(){
        return "Tarjeta nº " + this.num + " - Saldo: " + this.saldo + "€";
    }
}
