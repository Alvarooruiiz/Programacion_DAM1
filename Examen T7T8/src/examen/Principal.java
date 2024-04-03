package examen;


import ejercicio2.Entrada;
import java.io.IOException;



public class Principal {

    public static int menu() {
        
        int opcion = 0;

        do {
            System.out.println("\n1- Mostrar los Ejercitos"
                    + "\n2 - Atacar al Ejercito 1"
                    + "\n3 - Atacar al Ejercito 2"
                    + "\n0 - Salir");
            opcion = Entrada.pedirEntero("Escriba su opcion");
        }while ((opcion < 0) || (opcion > 3));

        return opcion;
    }

    public static void main(String[] args) throws IOException {
        int n;
        Ejercito ej1 = new Ejercito();
        Ejercito ej2 = new Ejercito();
        do{
            n=menu();
            switch(n){
                case 1->{
                    System.out.println("--------Ejercito 1-------");
                    System.out.println(ej1.toString());
                    System.out.println("--------Ejercito 2-------");
                    System.out.println(ej2.toString());
                    break;
                }
                case 2->{
                    if(!ej1.ejercitoDerrotado()){
                        ej1.recibirAtaque();
                        System.out.println(ej1.toString());
                        if(ej1.ejercitoDerrotado()){
                            System.out.println("El ejercito 1 ha sido derrotado");
                        }
                    }
                   
                   break;
                }
                case 3->{
                    if(!ej2.ejercitoDerrotado()){
                        ej2.recibirAtaque();
                        System.out.println(ej2.toString());
                        if(ej2.ejercitoDerrotado()){
                            System.out.println("El ejercito 2 ha sido derrotado");
                        }
                    }
                   
                   break;
                }
            
        }
        }while(n!=0);
        
        
    }

}
