package ejercicio2;

import java.io.*;
import java.util.Scanner;


public class Ejercicio2 {

    public static Empleado crearEmpleado() {
        char tipoEmpleado;
        Empleado em;
        Scanner sc= new Scanner(System.in);
        String nombre=EntradaTeclado.pedirCadena("Introduzca el nombre: ");
        int edad=EntradaTeclado.pedirEntero("Introduzca la edad: ");
        
        do {
            tipoEmpleado = EntradaTeclado.pedirCadena("Trabajada a tiempo completo o tiempo parcial(c-p)").toLowerCase().charAt(0);
        } while ((tipoEmpleado != 'c') && (tipoEmpleado != 'p'));

        if (tipoEmpleado == 'c') {
            int salario=EntradaTeclado.pedirEntero("Introduzca su salario: ");
            em = new Empleado(nombre, edad,salario);
        } else {
            int numHorasTrabajadas=EntradaTeclado.pedirEntero("Introduzca el numero de horas trabajadas: ");
            em = new EmpleadoTiempoParcial(nombre,edad,numHorasTrabajadas);
        }
        return em;
    }

    public static void guardarEmpleados(Empleado[] empleados) {
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("empleados.dat"))) {
            out.writeObject(empleados);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static Empleado[] cargarEmpleados() {
        Empleado[] emAux = null;
        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("empleados.dat"))) {
            emAux = (Empleado[]) in.readObject();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return emAux;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Empleado emp1 = crearEmpleado();
        Empleado emp2 = crearEmpleado();

        Empleado[] empleados = {emp1, emp2};

        guardarEmpleados(empleados);

        Empleado[] empleadosCargados = cargarEmpleados();

        if (empleadosCargados != null) {
            System.out.println(" - Empleados cargados del archivo - ");
            for (Empleado empleado : empleadosCargados) {
                System.out.println(empleado.toString());
                System.out.println("---------------");
            }
        }
    }
}
