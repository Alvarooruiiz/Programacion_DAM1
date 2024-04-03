/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActAmp_9_34_Cartas;

/**
 *
 * @author alvar
 */
public class Carta {

    protected int palo;
    protected int numero;

    public Carta(int palo, int numero) {
        if (palo >= 1 && palo <= 4) {
            this.palo = palo;
        }
        if (numero >= 1 && numero <= 12) {
            this.numero = numero;
        }
    }

    public int getPalo() {
        return palo;
    }

    public void setPalo(int palo) {
        if (palo >= 1 && palo <= 4) {
            this.palo = palo;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero >= 1 && numero <= 12) {
            this.numero = numero;
        }
    }

}
