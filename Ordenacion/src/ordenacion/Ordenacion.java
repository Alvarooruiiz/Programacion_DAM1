package ordenacion;

import java.util.Arrays;


public class Ordenacion {

    public static void main(String[] args) {
        
        int[] numeros = {29,10,14,37,14,25,3};
        System.out.println(Arrays.toString(numeros));
        
//        AlgoritmosOrdenacion.burbuja(numeros);
//        System.out.println(Arrays.toString(numeros));
        
//        AlgoritmosOrdenacion.insercionDirecta(numeros);
//        System.out.println(Arrays.toString(numeros));
//        
        AlgoritmosOrdenacion.seleccionDirecta(numeros);
        System.out.println(Arrays.toString(numeros));

        
    }

}
