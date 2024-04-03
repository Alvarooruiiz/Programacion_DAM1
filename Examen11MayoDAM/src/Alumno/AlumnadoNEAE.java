package Alumno;

public class AlumnadoNEAE extends Alumnado implements Calculable{
    
    private double coefi;
    
    public AlumnadoNEAE(String nombre, double coefi) {
        super(nombre);
        this.coefi=coefi;
    }

    public double getCoefi() {
        return coefi;
    }

    public void setCoefi(double coefi) {
        this.coefi = coefi;
    }

    @Override
    public String toString() {
        return super.toString() + " | Coeficiente-> " + coefi;
    }
    
    

    @Override
    public double calculoNota(double notaInicial) {
        return notaInicial*coefi;
    }
    
    
    
}
