package ActApl_12_25_ListaSocios;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Club implements Serializable{
    private Map<String, Socio> club;

    public Club() {
        this.club = new TreeMap<>();
    }

    @Override
    public String toString() {
        return "Club{" + "club=" + club + '}';
    }
    
    public boolean anadirSocio(Socio s){
        if(!club.containsKey(s.getApodo())){
            club.put(s.getApodo(), s);
            return true;
        }else return false;
    }
    
    public boolean eliminarSocio(String apodo){
        return (club.remove(apodo)!=null);
        
    }
    
    public boolean modificarSocio(String clave, Socio nuevoSocio){
        if(club.containsKey(clave)){
            if(clave.equalsIgnoreCase(nuevoSocio.getApodo())){
                club.put(clave, nuevoSocio);
                return true;
            }else {
                club.remove(clave);
                club.put(nuevoSocio.getApodo(), nuevoSocio);
                return true;
            }
        }
        return false;
//        if(club.containsKey(clave)){
//            Set<Map.Entry<String, Socio>> vista = club.entrySet();
//            Iterator<Map.Entry<String, Socio>> it;
//            it= vista.iterator();
//            while(it.hasNext()){
//                Map.Entry<String, Socio> s = it.next();
//                if(s.getKey().equals(clave)){
//                    s.setValue(valores);
//                    return true;
//                }
//            }    
//        }
//        return false;
    }
    
    public void mostrarSocios(){
        System.out.println(club);
    }
    
    public boolean esta(String clave){
        if(club.containsKey(clave)){
            return true;
        }else return false;
    }
    
    public void ordenarPorApodos(){
        List<Socio> socios = new ArrayList<>(club.values());
        socios.sort((s1,s2) -> s1.getApodo().compareTo(s2.getApodo()));
        socios.forEach(s1 -> System.out.println(s1.toString()));
//        for(String apodo:club.keySet()){
//            System.out.println(apodo + " " + club.get(apodo).getNombre());
//        }
    }
    
    public void ordenarPorAntiguedad(){
        List<Map.Entry<String, Socio>> lista = new ArrayList<>(club.entrySet());
        Collections.sort(lista,(o1, o2)->o1.getValue().getFecIng().compareTo(o2.getValue().getFecIng()));
        for(Map.Entry<String,Socio> entry : lista){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void mostrarAnteriorFecha(LocalDate fec){
        for(String apodo : club.keySet()){
            if(club.get(apodo).getFecIng().isBefore(fec)){
                System.out.println(apodo + ": " + club.get(apodo).getNombre() + " Fecha Ingreso: " + club.get(apodo).getFecIng());
            }
        }
    }
}
