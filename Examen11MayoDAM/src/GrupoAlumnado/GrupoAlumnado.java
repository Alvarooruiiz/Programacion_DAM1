
package GrupoAlumnado;

import Alumno.*;
import NotaAlumnado.NotaAlumnado;
import java.util.*;

public class GrupoAlumnado {
    List<Alumnado> lista;

    public GrupoAlumnado() {
        this.lista = new ArrayList<>();
    }
    
    public boolean inscribirAlumnado(Alumnado alumnado){
        if(lista.contains(alumnado)){
            return false;
        }else{
            lista.add(alumnado);
            return true;
        }
    }
    
    public boolean eliminarAlumnado(Alumnado alumnado){
        if(lista.contains(alumnado)){
            lista.remove(alumnado);
            NotaAlumnado.eliminarTodasNotasAlumnado(alumnado.getNie());
            return true;
        }
        return false;
    }
    
    public boolean insertarNotaAlumnado(Integer nie, NotaAlumnado nota){
        for (Alumnado alumnado : lista) {
            if(alumnado.getNie()==nie){
                NotaAlumnado.introducirNota(nie, nota);
                return true;
            }
        }
        return false;
    }

    public Alumnado encontrarPorNie(Integer nie){
        for (Alumnado alumnado : lista) {
            if(alumnado.getNie()==nie){
                return alumnado;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "GrupoAlumnado-> " + lista;
    }
    
//    public boolean mostrarAlumnosNEAE(){
//        for (Alumnado alumnado : lista) {
//            if(alumnado instanceof AlumnadoNEAE){
//                System.out.println(alumnado + " " + NotaAlumnado.notasAlumnado(alumnado.getNie());
//            }
//        }
//    }
}
