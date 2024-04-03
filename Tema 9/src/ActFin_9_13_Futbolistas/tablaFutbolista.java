package ActFin_9_13_Futbolistas;

import java.util.Arrays;

public class tablaFutbolista {
   private Futbolista[] tFutbolista;
   public static int cont;
   
   public tablaFutbolista(){
       this.tFutbolista = new Futbolista[2];
       
   }
   
   public void insertarFutbolista(Futbolista f){
       this.tFutbolista[cont]=f;
       cont++;
   }

    public Futbolista[] gettFutbolista() {
        return tFutbolista;
    }

    public void settFutbolista(Futbolista[] tFutbolista) {
        this.tFutbolista = tFutbolista;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        tablaFutbolista.cont = cont;
    }
   
   public void ordenar(){
       Arrays.sort(tFutbolista);
   }

    @Override
    public String toString() {
        return "tablaFutbolista{" + "tFutbolista=" + Arrays.toString(tFutbolista) + '}';
    }
   
   
}
