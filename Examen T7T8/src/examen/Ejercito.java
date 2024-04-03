package examen;

public class Ejercito {
    
    private Personaje[] ejercito;

    public Ejercito() {
        int nRdn=(int) (Math.floor(Math.random()*(6-3+1)+3));
        this.ejercito = new Personaje[nRdn];
        for(int i=0; i<ejercito.length-1; i++){
            this.ejercito[i]= new Guerrero();
        }
        this.ejercito[ejercito.length-1]= new Jefe();  
    }

    @Override
    public String toString() {
        String cadena="";
        for(Personaje p : ejercito){
                cadena+= "\n" + p.toString();
                }
        return cadena;
    }
    
    public boolean hayGuerrerosVivos(){
        boolean vivo = false;
        
        //El && !vivo es que si encuentra algun vivo true sale instantaneamente 
        for(int indice = 0; indice < ejercito.length-1 && !vivo; indice++){
            if(ejercito[indice].getVida()>0){
                vivo=true;
            }
        }
        return vivo;
    }
    
    public boolean ejercitoDerrotado(){
        Jefe jefe = (Jefe)ejercito[ejercito.length-1];
        return ((jefe.getVida()<=0) && (jefe.getVidaExtra()<=0));
        //Otra opcion es hacerlo directamente en vez de creando el jefe asi:
        // ((ejercito[ejercito.length-1].getVida()<=0) && ((jefe)ejercito[ejercito.length-1].getVidaExtra()<=0));
        /* lo de (jefe) es porque al estar llamando a la vidaExtra que solo tienen los ejefes hay que castearlo (polimorfismo) y 
        porque el ejercito es de la clase personaje 
        */
    }
    
    public void recibirAtaque(){
        int valorAtaque = (int)(Math.random()*11);
        int posicion;
        
        if(hayGuerrerosVivos()){
            posicion = (int)(Math.random()*ejercito.length-1);
            ejercito[posicion].setVida(ejercito[posicion].getVida()-valorAtaque);
        }else {
            Jefe jefe = (Jefe)ejercito[ejercito.length-1];
            if(ejercito[ejercito.length-1].getVida()>0){
                jefe.setVida(jefe.getVida()-valorAtaque);
            }else{
                jefe.setVidaExtra(jefe.getVidaExtra()-valorAtaque);
            }
        }
    }
    
}

// El numero de soldados del array (que es aleatorio) lo inicialio dentro del constructor
// 