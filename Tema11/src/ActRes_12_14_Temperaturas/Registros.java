package ActRes_12_14_Temperaturas;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Registros implements Comparable<Registros>,Serializable{
    
    private String hora;
    private double temperatura;

    public Registros(double temperatura) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        this.hora = LocalTime.now().format(formato);
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Registros{" + "Temperatura: " + temperatura + ", hora: " + hora + '}';
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public int compareTo(Registros o) {
        return hora.compareTo(o.hora);
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Registros other = (Registros) obj;
        return Objects.equals(this.hora, other.hora);
    }
    
    
    
}
