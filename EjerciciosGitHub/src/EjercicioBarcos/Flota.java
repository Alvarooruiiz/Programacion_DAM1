package EjercicioBarcos;

import java.util.*;

public class Flota {
    private Set<Barco> flota;
    private int cantidadMaxFlota;

    public Flota(int cantidadMaxFlota) {
        this.flota = new LinkedHashSet<>();
        this.cantidadMaxFlota=cantidadMaxFlota;
    }
    
    public int numBarcos(){
        return flota.size();
    }
    
    public boolean insertarBarco(Barco b){
        if(numBarcos()>=cantidadMaxFlota){
            return false;
        }else {
            flota.add(b);
            return true;
        }
    }
    
    public boolean eliminarBarco(Barco b){
        if(flota.contains(b)){
            flota.remove(b);
            return true;
        }else return false;
    }
    
    public double longitudPeriscopioFlota(){
//        Iterator<Barco> it = flota.iterator();
        double suma=0;
        
//        while(it.hasNext()){
//            if(it.next() instanceof Submarinos){
//                Submarinos s = (Submarinos) it.next();
//                suma+=s.longPersicopio();
//                        
//            }
//        }
        
        for(Barco b : flota){
            if(b instanceof Submarinos){
                suma+=((Submarinos) b).longPersicopio();
            }
        }
        return suma;
    }
    
    public ArrayList<Integer> listaLongitudes(){
        ArrayList<Integer> lista= new ArrayList<>();
        for(Barco b : flota){
            lista.add(b.getLongitud());
        }
        return lista;
    }
    
    public boolean recibeAtaque(){
        int min = Collections.min(listaLongitudes());
        
        ArrayList<Barco> lista = new ArrayList<>();
        lista.addAll(flota);
        if(flota.isEmpty()){
           return false;
       }else{
           Barco menor = lista.get(0);
           for(Barco b : lista){
               if(b.getLongitud()<menor.getLongitud()){
                   menor=b;
               }
           }
           flota.remove(menor);
           return true;
       }
    }
    
    public ArrayList<Barco> listadoBarcos(){
        ArrayList<Barco> lista = new ArrayList<>();
        lista.addAll(flota);
        return lista;
    }
}
