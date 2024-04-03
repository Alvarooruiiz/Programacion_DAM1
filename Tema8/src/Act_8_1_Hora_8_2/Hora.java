/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act_8_1_Hora_8_2;


public class Hora {
    int hora;
    int minuto;
    
    public Hora(int hora, int minuto){
        this.hora=hora;
        this.minuto=minuto;
    }
    
    void inc(){
        minuto++;
    }
    
    boolean setMinutos(int valor){
        boolean correcto=false;
        if(0<=valor && valor<60){
            this.minuto=valor;
            correcto=true;
        }
        return correcto;
    }
    
    boolean setHora(int valor){
        boolean correcto=false;
        if(0<=valor && valor<24){
            this.minuto=valor;
            correcto=true;
        }
        return correcto;
    }
    
    public String toString(){
        String horaFinal;
        horaFinal=hora + " : " + minuto;
        
        return horaFinal;
    }
    
}
