package ActFin_9_19_InterfazSocio;

import java.util.Arrays;

public class main {
    private static void mostrarSocio(Socio[] socio){
        for(Socio s : socio){
            System.out.println(s.toString());
        }
    }
    public static void main(String[] args) {
        
        Socio listaSocio[] = new Socio[2];
        listaSocio[0]= new Socio(1,"Jose",10,"1-12-1990");
        listaSocio[1] = new Socio(2,"Alberto",19,"23-3-2002");

        

        Arrays.sort(listaSocio);
        System.out.println("");
        mostrarSocio(listaSocio);
        
        Arrays.sort(listaSocio,(Socio o1,Socio o2)->{
            int resultado;
            resultado=o1.getEdad()-o2.getEdad();
            if(resultado==0){
                resultado = o1.getId()-o2.getId();
            }
            return resultado;
                });
        
        mostrarSocio(listaSocio);
    }
}
