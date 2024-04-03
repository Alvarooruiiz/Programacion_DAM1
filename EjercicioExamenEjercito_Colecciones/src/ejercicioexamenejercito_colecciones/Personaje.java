/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamenejercito_colecciones;

/**
 *
 * @author alvar
 */
public abstract class Personaje {
    private String codigo;
    private int vida;

    public Personaje(String codigo, int vida) {
        this.codigo = codigo;
        this.vida = vida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Personaje{" + "codigo=" + codigo + ", vida=" + vida + '}';
    }
    
}
