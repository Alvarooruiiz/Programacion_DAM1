/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracto;

/**
 *
 * @author richi
 */
public class Rectangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura, String color){
        super(color);
        if (base > 0)
            this.base = base;
        else
            this.base = 1;
        
        if (altura > 0)
            this.altura = altura;
        else
            this.altura = 1;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        if (base > 0)
            this.base = base;
        else
            this.base = 1;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
        else
            this.altura = 1;
    }

    @Override
    public double area() {
        
        return this.base*this.altura;
    }

    @Override
    public double perimetro() {
        
        return (2*this.base)+(2*this.altura);
    }
    
    public String toString(){
        String cadena = "";
        
        cadena += "\n --RECTANGULO--";
        cadena += "\nBase: " + this.base;
        cadena += "\nAltura: " + this.altura;
        cadena += super.toString();
        
        return cadena; 
    }
}
