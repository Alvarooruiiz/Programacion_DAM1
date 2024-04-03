package NotaAlumnado;

import java.util.*;

public class NotaAlumnado {

    private String fecha;
    private double nota;
    private static Map<Integer, Set<NotaAlumnado>> notas;

    public NotaAlumnado(String fecha, double nota) {
        this.fecha = fecha;
        this.nota = nota;
        notas = new HashMap<Integer, Set<NotaAlumnado>>();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota del alumno: Fecha-> " + fecha + "| Nota->" + nota;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.fecha);
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
        final NotaAlumnado other = (NotaAlumnado) obj;
        return Objects.equals(this.fecha, other.fecha);
    }

    public static boolean introducirNota(Integer nie, NotaAlumnado nota) {

        if (notas.containsKey(nie)) {
            if (!notas.get(nie).contains(nota)) {
                notas.get(nie).add(nota);
                return true;
            }
        } else {
            Set<NotaAlumnado> notaSet = new HashSet<>();
            notaSet.add(nota);
            notas.put(nie, notaSet);
            return true;
        }
        return false;
    }

    public static boolean eliminarTodasNotasAlumnado(Integer nie) {
        if(notas.containsKey(nie)){
            notas.remove(nie);
            return true;
        }else return false;
    }
    
    public static Set<Integer> codigosAlumnado(){
         Set<Integer> setNotas = notas.keySet();
         
        return setNotas;
    }
    
    public static Iterator<NotaAlumnado> notasAlumnado(Integer nie){
        if (notas.containsKey(nie)) {
            System.out.println(notas.get(nie));
            return notas.get(nie).iterator();
        } else {
            return null;
        }
        

    }
}
