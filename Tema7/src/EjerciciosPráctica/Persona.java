package EjerciciosPráctica;

public class Persona {
    int edad;
    String nombre;
    double estatura;
    
    public void saludar(){
        System.out.println("Hola buenas " + this.nombre);
}
    public void crecer(double crecimiento){
        this.estatura+=crecimiento;
    }
    
    public void cumpliAños(){
        this.edad++;
    }
}


