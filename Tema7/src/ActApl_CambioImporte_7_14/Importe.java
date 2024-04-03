package ActApl_CambioImporte_7_14;

public class Importe {

    int importe;

    public static void importeCambio(int precio){
        int monedas=0;
        int billetes=0;
        int auxBilletes[]={500,200,100,50,20,10,5};
        int auxMonedas[]={50,20,10};
        
        for(int i=0; i<auxBilletes.length; i++){
            int n = precio/auxBilletes[i];
            billetes+=n;
            precio=precio-(n*auxBilletes[i]);
        }
        precio*=100;
        for(int i=0; i<auxMonedas.length; i++){
            int n = precio/auxMonedas[i];
            monedas+=n;
            precio=precio-(n*auxMonedas[i]);
        }
        
        System.out.println("La vuelta son " + billetes + " billetes y " + monedas + " monedas");
    }
}
