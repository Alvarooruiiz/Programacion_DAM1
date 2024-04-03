package ActFin_9_13_Futbolistas;

public class Futbolista implements Comparable <Futbolista>{

    private int dni;
    private String nombre;
    private int edad;
    private int numeroGoles;

    public Futbolista(int dni, String nombre, int edad, int numeroGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    @Override
    public String toString() {
        return "FUTBOLISTA- DNI:" + dni + ", NOMBRE:" + nombre + ", EDAD:" + edad + ", NUMERO DE GOLES:" + numeroGoles;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        if (obj instanceof Futbolista) {
            return this.dni == ((Futbolista)obj).dni;
        }
            return false;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    @Override
    public int compareTo(Futbolista ob) {
        Futbolista otroSocio = (Futbolista) ob;
        int resultado=this.dni-ob.dni;
        if(resultado==0){
            resultado = this.getNombre().compareTo(otroSocio.getNombre());
            if (resultado == 0) {
                resultado=this.edad-ob.edad;
            }
        }   
        return resultado;
    }
    
}
