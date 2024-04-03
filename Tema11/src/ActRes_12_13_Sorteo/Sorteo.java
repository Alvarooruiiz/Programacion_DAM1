package ActRes_12_13_Sorteo;

import java.util.*;

public class Sorteo<T extends Comparable<T>> {
    private final Set<T> elementos;

    public Sorteo() {
        this.elementos = new HashSet<>();
    }
    boolean add(T nuevo){
        return elementos.add(nuevo);
    }
    
    public Set<T>premiados(int numPremiados){
        Set<T> premiados = null;
        List<T> listaDesordenada = new ArrayList<>(elementos);
        Collections.shuffle(listaDesordenada);
        if(numPremiados<=elementos.size()){
            premiados=new HashSet<>();
            for(int i=0; i<numPremiados; i++){
                premiados.add(listaDesordenada.get(i));
            }
        }
        return premiados;
    }

    @Override
    public String toString() {
        return "Sorteo{" + "elementos=" + elementos + '}';
    }
    
    
}
