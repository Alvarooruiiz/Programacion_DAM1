package examen;

public abstract class Personaje {
    private int codigo;
    private int vida;

    public Personaje(int codigo, int vida) {
        this.codigo = codigo;
        this.vida = vida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        String cadena = this.getClass().getSimpleName();
        cadena+= "Codigo: " + codigo + " - Nivel de vida: " + vida;
        return cadena;
    }
}


//Quitar vida extra
//Falta poner el tipo de privacidad de las variables en este caso private
//Poner los getter y setter
//El constructor debe estar completo
//En el toString la "cadena" tiene el toString de la clase en particular para no tener que hacerla luego en la clase Guerrero o Jefe