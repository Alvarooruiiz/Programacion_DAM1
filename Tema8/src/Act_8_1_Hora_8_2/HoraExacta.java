/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act_8_1_Hora_8_2;

/**
 *
 * @author alvar
 */
public class HoraExacta extends Hora{
    protected int segundos;
    
    public HoraExacta(int hora, int minutos, int segundos){
        super(hora,minutos);
        if(!setSegundos(segundos)){
            System.out.println("El numero de segundos introducido es incorrecto");
        }
    }
    
    public boolean setSegundos(int segundos){
        boolean correcto=false;
        if(0<segundos && segundos<60){
            this.segundos=segundos;
            correcto=true;
        }
        return correcto;
    }
    
    @Override
    public void inc(){
        segundos++;
    }
    
    public String toString(){
        String resultado=(hora + ":" + minuto + ":" + segundos);
    return resultado;
    }
    
    public boolean sonIguales(Object o){
        boolean iguales=false;
        HoraExacta hAux =(HoraExacta) o;
        if(this.hora==hAux.hora && this.minuto==hAux.minuto && this.segundos==hAux.segundos){
            iguales=true;
        }
        return iguales;
    }
}
