package ActAmp_9_28_Jornada;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Jornada implements Comparable<Jornada>{
    private final Empleado empleado;
    private LocalDate fecha;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private int horasTrabajadas;

    public Jornada(Empleado empleado, String fecha, String horaEntrada, String horaSalida) {
        this.empleado=empleado;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fecha=LocalDate.parse(fecha, f);
        
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("HH:mm");
        this.horaEntrada = LocalTime.parse(horaEntrada,f2);
        this.horaSalida = LocalTime.parse(horaEntrada,f2);
    }

 
    public long tiempoTrabajado(){
        Duration duracion = Duration.between(horaEntrada,horaSalida);
//        return (long)horaEntrada.until(horaSalida,ChronoUnits.MINUTES);
        return duracion.toMinutes();
    }

    @Override
    public int compareTo(Jornada o) {
        int resultado=this.empleado.getDni().compareTo(o.empleado.getDni());
        return resultado;
    }
    
       @Override
    public String toString() {
        return "Jornada{" + "empleado=" + empleado + ", fecha=" + fecha + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", horasTrabajadas=" + tiempoTrabajado() +" minutos" + '}' + "\n";
    }
}
