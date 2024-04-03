package EjerciciosPráctica;


public class PersonaMain {
    public static void mostrarMensaje(Persona p){
        System.out.println("Mi nombre es " + p.nombre + " y mi edad es " + p.edad);

}
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        p1.nombre="Alvaro";
        p1.edad=20;
        mostrarMensaje(p1);
        p2.nombre="Chema";
        p2.saludar();
    }
}
