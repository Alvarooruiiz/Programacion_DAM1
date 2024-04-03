package ActApl_10_21_AgendaXML;

import java.util.Arrays;
import javax.xml.bind.annotation.*;


@XmlRootElement(name="Agenda")
@XmlType(propOrder = {"Nombre","Numero"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Contactos {
    @XmlAttribute(required=true)
    private Integer id;
    @XmlElement(name="Nombre")
    private String nombre;
    @XmlElement(name="Numero")
    private Integer numero;
    @XmlElementWrapper(name="Agenda")
    @XmlElement(name="Contacto")
    private Contactos[] listaContactos;
    

    public Contactos() {
    }

    public Contactos(Integer id, String nombre, Integer numero) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void nuevoContacto(Contactos nuevo){
        listaContactos = Arrays.copyOf(listaContactos, listaContactos.length+1);
        listaContactos[listaContactos.length-1]=nuevo;
    }
    
    @Override
    public String toString() {
        return "Contactos{" + "id=" + id + ", nombre=" + nombre + ", numero=" + numero + '}';
    }
    
    
}
