package ActAmp_9_28_Jornada;

import java.util.Arrays;

public class Main {
    private static void mostrarEmpleados(Empleado[] empleado){
        for(Empleado e : empleado){
            System.out.println(e.toString());
        }
    }
    
    public static void main(String[] args) {
//        Jornada j1 = new Jornada();
//        
//        Empleado e1 = new Empleado(732, "1-7-2005", "8:20", "15:20");
//        j1.insertarEmpleado(e1);
//        Empleado e2 = new Empleado(432, "12-3-2001", "8:20", "15:20");
//        j1.insertarEmpleado(e2);
//        
//        j1.ordenar();
//        System.out.println(j1);

        Jornada[] j1 = new Jornada[]{
            new Jornada(new Empleado("732"), "10-07-2005", "08:20", "15:20"),
            new Jornada(new Empleado("432"), "12-03-2001", "08:20", "15:20"),
            new Jornada(new Empleado("432"), "01-03-2001", "08:20", "15:20"),
        };
        

        Arrays.sort(j1);
        System.out.println(Arrays.toString(j1));
    }
}
