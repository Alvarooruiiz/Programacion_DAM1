package ActRes_12_12;

import java.util.*;

public class main {

    public static <E> Set<E> union(Set<E> c1, Set<E> c2) {
        Set<E> res = new HashSet<>(c1);
        res.addAll(c2);
        return res;
    }
    
    public static <E> Set<E> interseccion(Set<E> c1, Set<E> c2){
        Set<E> resInt = new HashSet<>(c1);
        resInt.retainAll(c2);
        return resInt;
    }

    public static void main(String[] args) {
        Set<Integer> lista = new HashSet<>();
        Set<Integer> lista2 = new HashSet<>();
        
        for(int i=0; i<10; i++){
            lista.add((int) (Math.random() * 10 + 1));
        }
        for(int i=0; i<10; i++){
            lista2.add((int) (Math.random() * 10 + 1));
        }
        
        System.out.println("Lista1: " + lista);
        System.out.println("Lista2: " + lista2);
        
        Set<Integer> union=union(lista,lista2);
        Set<Integer> interseccion=interseccion(lista,lista2);
        
        System.out.println("Union " + union);
        System.out.println("Interseccion " + interseccion);
    }
}
