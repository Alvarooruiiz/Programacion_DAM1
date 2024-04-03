/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActAmp_9_34_Cartas;

/**
 *
 * @author alvar
 */
public class CartaEspanola extends Carta{
    private static String[] nombrePalos={"Espadas","Oro","Bastps","Copas"};
    
    public CartaEspanola(int palo, int numero){
        super(palo,numero);
        
        if((numero == 8) || (numero == 9)){
            this.setNumero(7);
        }
    }

    public String getPalo(){
        return nombrePalos[this.palo-1];
    }
    
    
}
