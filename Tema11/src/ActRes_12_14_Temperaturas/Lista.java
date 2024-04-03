package ActRes_12_14_Temperaturas;

import java.io.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Lista implements Serializable {

    final private Set<Registros> lista;
    final private LocalDate fecha;

    public Lista() {
        this.lista = new HashSet<>();
        this.fecha = LocalDate.now();
    }

    public boolean add(Registros nuevo) {
        return lista.add(nuevo);
    }

    public double getMax() {
        //El compare devuelve un entero
        return (Collections.max(lista, (r1, r2) -> (int)(r1.getTemperatura() - r2.getTemperatura()))).getTemperatura();
    }
    public double getMin() {
        //El compare devuelve un entero
        return (Collections.min(lista, (r1, r2) -> (int)(r1.getTemperatura() - r2.getTemperatura()))).getTemperatura();
    }

    public double calcularPromedio() {
        int total = 0;
        Iterator<Registros> it = lista.iterator();
        while (it.hasNext()) {
            total += it.next().getTemperatura();
        }

        return (double) total / lista.size();
    }

    @Override
    public String toString() {
        return "Lista{" + "lista=" + lista + '}';
    }

    public boolean guardarFichero() {
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("registros" + fecha + ".dat"))) {
            out.writeObject(lista);
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
