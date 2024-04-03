package Contenedor;

import examendual_t7_88.Componentes;
import java.util.Arrays;

public class Contenedor {
    private Componentes[] contenedor;
    private int tam;
    private String codigo;
    
    public Contenedor(int tam){
        if(tam<=5 && tam>0){
            this.contenedor = new Componentes[tam];
        }
        
    }
    
    public boolean add(Componentes c){
        boolean añadido=false;
        for (Componentes contenedor1 : this.contenedor) {
            if (c.getCodigo().equals(contenedor1.getCodigo())) {
                return añadido;
            }
        }
        while(!añadido){
            for(int i=0; i<this.contenedor.length; i++){
                if(contenedor[i]==null){
                    contenedor[i]=c;
                    añadido=true;
                }
            }
        }
        return añadido;
    }
    
    public Componentes eliminar(String cod){
        boolean eliminado=false;
        int cont=0;
        
        while(!eliminado){
            for(int i=0; i<this.contenedor.length; i++){
                if(this.contenedor[i].getCodigo().equals(cod)){
                    this.contenedor[i]=null;
                    eliminado=true;
                }
            }
        }
        
        if(this.contenedor[cont]==null){
            cont++;
        }else return this.contenedor[cont];
        
        return this.contenedor[cont];
    }

    @Override
    public String toString() {
        return "Contenedor{" + "contenedor=" + Arrays.toString(contenedor) + '}';
    }
}
