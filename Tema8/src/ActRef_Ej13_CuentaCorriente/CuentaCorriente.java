/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActRef_Ej13_CuentaCorriente;

public class CuentaCorriente {
    private int numeroDeCuenta;
    private int saldo;

    public CuentaCorriente(int saldo) {
        this.numeroDeCuenta =(int)(Math.random() * 1000000000);
        this.saldo = saldo;
    }
    public CuentaCorriente() {
        this.numeroDeCuenta =(int)(Math.random() * 100000000);
        this.saldo = 0;
    }
    
    public void ingreso(int n){
        this.saldo+=n;
    }
    public void cargo(int n){
        this.saldo-=n;
    }
    
    public void transferencia(CuentaCorriente c, int n){
        this.saldo-=n;
        c.saldo+=n;
    }
    
    public String toString(){
        return "Numero de cta: " + this.numeroDeCuenta + " Saldo: " + this.saldo+ "€";
    }
}
