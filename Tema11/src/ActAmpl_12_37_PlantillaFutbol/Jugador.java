package ActAmpl_12_37_PlantillaFutbol;

public class Jugador {
    private int dorsal;
    private String dni;
    private String nombre;
    private String posCampo;

    public Jugador() {
    }

    
    public Jugador(int dorsal, String dni, String nombre, String posCampo) {
        this.dorsal = dorsal;
        this.dni = dni;
        this.nombre = nombre;
        this.posCampo = posCampo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosCampo() {
        return posCampo;
    }

    public void setPosCampo(String posCampo) {
        this.posCampo = posCampo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "dorsal=" + dorsal + ", dni=" + dni + ", nombre=" + nombre + ", posCampo=" + posCampo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.dorsal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        return this.dorsal == other.dorsal;
    }
    
}
