package ActAmp_9_31_Llamada;

import java.time.LocalDate;

public class Llamada implements Comparable<Llamada>{
    private int numeroCliente;
    private int numeroInterlocutor;
    private boolean llamadaSaliente;
    private LocalDate fechaHoraEntrada;
    private LocalDate fechaHoraSalida;
    private static double[] tarifa={0.05,0.04,0.03,0.02,0.01};
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public int getNumeroInterlocutor() {
        return numeroInterlocutor;
    }

    public void setNumeroInterlocutor(int numeroInterlocutor) {
        this.numeroInterlocutor = numeroInterlocutor;
    }

    public boolean isLlamadaSaliente() {
        return llamadaSaliente;
    }

    public void setLlamadaSaliente(boolean llamadaSaliente) {
        this.llamadaSaliente = llamadaSaliente;
    }

    public LocalDate getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public void setFechaHoraEntrada(LocalDate fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public LocalDate getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDate fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    @Override
    public int compareTo(Llamada o) {
        int resultado;
        resultado=(this.numeroCliente-o.numeroCliente);
        if(resultado==0){
            
        }
        return resultado;
    }   
}
