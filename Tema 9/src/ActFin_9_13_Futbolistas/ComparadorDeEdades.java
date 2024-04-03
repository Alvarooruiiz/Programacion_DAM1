package ActFin_9_13_Futbolistas;

import java.util.Comparator;

public class ComparadorDeEdades implements Comparator<Futbolista>{
    @Override
    public int compare(Futbolista ob1, Futbolista ob2){
        return ((Futbolista)ob1).getEdad()-((Futbolista)ob2).getEdad();
    }
}
