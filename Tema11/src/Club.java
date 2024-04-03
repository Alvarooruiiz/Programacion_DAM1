
import java.util.*;

public class Club {
    private Map<String, Socio> socios;

    public Club() {
        socios = new HashMap<String, Socio>();
    }

    public void altaSocio(String apodo, String nombre, Date fechaIngreso) {
        Socio socio = new Socio(nombre, fechaIngreso);
        socios.put(apodo, socio);
    }

    public void bajaSocio(String apodo) {
        socios.remove(apodo);
    }

    public void modificarSocio(String apodo, String nombre, Date fechaIngreso) {
        Socio socio = new Socio(nombre, fechaIngreso);
        socios.put(apodo, socio);
    }

    public void listarSociosPorApodo() {
        for (String apodo : socios.keySet()) {
            System.out.println(apodo + ": " + socios.get(apodo).getNombre());
        }
    }

    public void listarSociosPorAntiguedad() {
        List<Map.Entry<String, Socio>> list = new LinkedList<Map.Entry<String, Socio>>(socios.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Socio>>() {
            public int compare(Map.Entry<String, Socio> o1, Map.Entry<String, Socio> o2) {
                return o1.getValue().getFechaIngreso().compareTo(o2.getValue().getFechaIngreso());
            }
        });
        for (Map.Entry<String, Socio> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getNombre());
        }
    }

    public void listarSociosConAltaAnteriorAUnAnoDeterminado(Date fecha) {
        for (String apodo : socios.keySet()) {
            if (socios.get(apodo).getFechaIngreso().before(fecha)) {
                System.out.println(apodo + ": " + socios.get(apodo).getNombre());
            }
        }
    }
}

