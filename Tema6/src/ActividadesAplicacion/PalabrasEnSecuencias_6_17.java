package ActividadesAplicacion;

import java.util.Scanner;

public class PalabrasEnSecuencias_6_17 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Introduzca n");
        int n=sc.nextInt();
        int x=0,nAux=n;
        
        
        System.out.println("Introduzca la palabra a dividir");
        String palabra=sc.next();
        int longi=palabra.length();
        int excedente=longi%n;
        int rest=longi-excedente;
        
        String aux;
        
        for(int i=0; i<longi/4; i++){
            aux= palabra.substring(x,n);
            System.out.println(aux);
            x=x+nAux;
            n=n+nAux;
            
        }
        
        if(excedente!=0){
            for(int i=(longi-excedente); i<longi; i++){
                System.out.print(palabra.charAt(i));
            }
        }
        System.out.println();
        
    }
}
