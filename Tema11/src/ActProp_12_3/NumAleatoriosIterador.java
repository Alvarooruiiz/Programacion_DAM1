package ActProp_12_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NumAleatoriosIterador {
    public Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        
        for(int i=0; i<10; i++){
            lista.add((int) (Math.random() * 10 + 1));
        }
        
        System.out.println(lista);
        Iterator<Integer> it = lista.iterator();
        
        while(it.hasNext()){
            int n=it.next();
            if(n==5){
                it.remove();
            }
        }
        System.out.println(lista);
    }
}
