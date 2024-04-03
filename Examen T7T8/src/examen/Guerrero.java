package examen;

public class Guerrero extends Personaje {
    public static int contadorGuerreros;
    
    static {
        contadorGuerreros=0;
    }

    public Guerrero() {
        super(Integer.parseInt("2"+contadorGuerreros++), 15);
    }



}

// El valor de los datos se introducen en super
// Static implica que la variable pertenece a la clase
// El toString no es necesario porque ya estaba hecho en la clase personaje