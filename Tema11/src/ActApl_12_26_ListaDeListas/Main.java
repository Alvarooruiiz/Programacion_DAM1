package ActApl_12_26_ListaDeListas;

import java.util.*;

public class Main {

    public static List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {
        List<List<String>> listaGrupos = new ArrayList<>();
        for (int i = 0; i < numGrupos; i++) {
            listaGrupos.add(new ArrayList<>());
        }
        for (int i = 0; i < lista.size(); i++) {
            listaGrupos.get(i % listaGrupos.size()).add(lista.get(i));
        }
        return listaGrupos;
    }

    public static void main(String[] args) {
        String [] array = {"1","2","3","4","5","6","7","8","9","10"};
        List<String> listaEnteros = new ArrayList<>(Arrays.asList(array));
        Collections.shuffle(listaEnteros);
        
        System.out.println(repartoAlumnos(listaEnteros, 3));
    }
}
