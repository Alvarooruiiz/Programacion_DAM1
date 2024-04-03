package AcrRes_12_10_Insertar;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        for(int i=0; i<20; i++){
            int num=(int)Math.floor(Math.random()*9+1);
            lista.add(num);
        }
        
        HashSet<Integer> hSet = new HashSet<>();
    }
}
