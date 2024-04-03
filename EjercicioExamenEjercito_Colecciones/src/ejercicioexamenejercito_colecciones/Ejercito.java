package ejercicioexamenejercito_colecciones;

import java.util.*;

public class Ejercito {

    LinkedHashSet<Personaje> ejercito;
    private int numIntegrantes;

    public Ejercito(LinkedHashSet<Personaje> ejercito) {
        this.ejercito = new LinkedHashSet<>();
        numIntegrantes = (int) (Math.random() * (3 - 6 + 1) + 6);
        for (int i = 0; i < numIntegrantes - 1; i++) {
            ejercito.add(new Guerrero());
        }
        ejercito.add(new Jefe());
    }

    public void mostrarEjercito() {
        System.out.println(ejercito);
    }

    public boolean algunGuerreroVivo() {
        for (Personaje p : ejercito) {
            if (!(p instanceof Jefe)) {
                if (p.getVida() >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean jefeDerrotado() {
        for (Personaje p : ejercito) {
            if ((p instanceof Jefe)) {
                if (p.getVida() <= 0 && ((Jefe) p).getvExtra() <= 0) {
                    return true;
                }
            }

        }
        return false;
    }
    
    public boolean ejercitoDerrotado(){
        return jefeDerrotado();
    }
    
    public void ataque(){
        int numAtq = (int)(Math.random()*10);
        int posAtaque=(int)(Math.random()*numIntegrantes);
        if(algunGuerreroVivo()){
            
        }
    }
}
