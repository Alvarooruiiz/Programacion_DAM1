package examendual_t7_88;

import java.util.Objects;

public class Componentes {
    private String codigo;
    private int ancho;
    private int largo;

    public Componentes(String codigo, int ancho, int largo) {
        this.codigo = codigo;
        if(ancho>0){
            this.ancho = ancho;
        }else this.ancho=0;
        
        if(largo>0){
            this.largo=largo;
        }else this.largo=0;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    
    
    public int superficie(){
        return this.ancho*this.largo;
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
        final Componentes other = (Componentes) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        return "Componentes{" + "codigo=" + codigo + ", ancho=" + ancho + ", largo=" + largo + '}';
    }
    
    
}
