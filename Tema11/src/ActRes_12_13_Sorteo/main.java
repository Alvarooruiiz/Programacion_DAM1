package ActRes_12_13_Sorteo;

import java.util.*;

public class main {
    
    public static void main(String[] args) {
        Sorteo<Integer> s = new Sorteo<>();
        for(int i=0; i<100; i++){
            s.add(i);
        }
        System.out.println(s);
        System.out.println(s.premiados(5));
    }
}

