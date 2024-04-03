package ActApl_ConjuntoDinamico_7_21;

import java.util.Arrays;
import java.util.Objects;

public class Conjunto {

    Integer conjunto[];

    public Conjunto() {
        conjunto = new Integer[0];
    }

    public int numeroElenmetos() {
        return conjunto.length;
    }

    public void insertar(Integer nuevo) {
        if (pertenece(nuevo) == false) {
            conjunto = Arrays.copyOf(conjunto, conjunto.length + 1);
            conjunto[conjunto.length - 1] = nuevo;
        }
    }

    public void insertar(Integer otroConjunto[]) {
        Conjunto aux = repetir(otroConjunto);

        for (int i = 0; i < aux.conjunto.length; i++) {
            this.insertar(aux.conjunto[i]);
        }
    }

    public void eliminarElemento(Integer elemento) {
        for (int i = obtenerPosicion(elemento) + 1; i < conjunto.length; i++) {
            conjunto[i - 1] = conjunto[i];
        }
        conjunto = Arrays.copyOf(conjunto, conjunto.length - 1);
    }

    public void eliminarOtroConjunto(Integer otroConjunto[]) {
        Conjunto aux = repetir(otroConjunto);
        for (int i = 0; i < aux.conjunto.length; i++) {
            this.eliminarElemento(aux.conjunto[i]);
        }
    }
    
    public Integer obtenerPosicion(Integer elemento){
        Integer posicion;
        
        for(int i=0; i<conjunto.length; i++){
            if(Objects.equals(conjunto[i], elemento)){
                posicion=i;
                return posicion;
            }
        }
        return null;
    }

    public boolean pertenece(Integer num) {
        boolean esta = false;
        int i = 0;

        while (esta == false && i < conjunto.length) {
            if (Objects.equals(conjunto[i], num)) {
                esta = true;
            }
            i++;
        }
        return esta;
    }

    public void muestra() {
        System.out.println(Arrays.toString(conjunto));
    }

    private Conjunto repetir(Integer x[]) {
        Conjunto aux = new Conjunto();

        for (int i = 0; i < x.length; i++) {
            aux.insertar(x[i]);
        }

        for (int i = 0; i < this.conjunto.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (Objects.equals(conjunto[i], x[j])) {
                    aux.eliminarElemento(x[j]);
                }
            }
        }
        return aux;
    }

    static boolean incluido(Conjunto c1, Conjunto c2) {
        Conjunto aux = c1.repetir(c2.conjunto);

        return aux.equals(c2.conjunto);
    }

    static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto aux;
        aux = c1;
        aux.insertar(c2.conjunto);

        return aux;
    }

    static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto aux = c1.repetir(c2.conjunto);

        return aux;
    }

    static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto aux;
        aux = union(c1,c1);
        aux.eliminarOtroConjunto(c2.conjunto);

        return aux;
    }
}
