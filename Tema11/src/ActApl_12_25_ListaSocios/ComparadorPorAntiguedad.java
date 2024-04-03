package ActApl_12_25_ListaSocios;

import java.util.Comparator;

public class ComparadorPorAntiguedad implements Comparator<Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getFecIng().compareTo(o2.getFecIng());
    }
    
}
