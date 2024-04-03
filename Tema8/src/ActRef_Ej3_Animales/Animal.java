package ActRef_Ej3_Animales;

public class Animal {
    char sexo;
    String gestacion;
    String nombreEspecie;
    
    public Animal(char sexo, String gestacion, String nombreEspecie){
        this.gestacion=gestacion;
        this.sexo=sexo;
        this.nombreEspecie= nombreEspecie;
    }

    public char getSexo() {
        return sexo;
    }

    public String getGestacion() {
        return gestacion;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }
    
    
}
