package ActRef_Ej18_Empresa;

import java.util.Scanner;

public class Incidencia {

    int codigo = 0;
    int numPuesto;
    String estado;
    String incidente;
    String resolucion;
    private static int pendientes = 0;

    public Scanner sc = new Scanner(System.in);

    public Incidencia(int numPuesto, String incidente) {
        this.numPuesto = numPuesto;
        this.incidente = incidente;
        this.estado = "Pendiente";
        this.codigo++;
        this.pendientes++;
    }

    static int getPendientes() {
        return pendientes;
    }

    public void resuelve(String resolucion) {
        this.estado = "Resuelta";
        this.resolucion = resolucion;
        this.pendientes--;
    }

    @Override
    public String toString() {
        if ("Pendiente".equals(this.estado)) {
            return "Incidencia" + this.codigo + " - Puesto: " + this.numPuesto + " - " + this.incidente + " - " + this.estado;
        } else {
            return "Incidencia" + this.codigo + " - Puesto: " + this.numPuesto + " - " + this.incidente + " - " + this.estado + " - " + this.resolucion;
        }

    }
}
