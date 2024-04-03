package ActApl_PaletaColores_7_13;

import java.util.Arrays;
import java.util.Objects;

public class Colores {
    String paletaColores;
    
    public Colores(){
        this.paletaColores="Negro,Blanco,Gris,Verde";
    }
    
    public void añadirColores(String colorNuevo){
        this.paletaColores += "," + colorNuevo;
    }
    
    public void mostrarPaletaColores(){
        System.out.println(this.paletaColores);
    }
    
    public String[] coloresAleatorios(int n){
        String aux[]= this.paletaColores.split(",");
        String paletaFinal[] = new String[n];
        int aux2[]= new int[n];
        boolean val=true;
        int numAux=0;
        
        for(int i=0; i<n; i++){
            while(val==true){
                numAux =(int) (Math.random() * aux.length);
                aux2[i]=numAux;
                val=contains(aux2,numAux);
            }
            
            
            paletaFinal[i]=aux[numAux];
        }
        return paletaFinal;
    }
    
    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
