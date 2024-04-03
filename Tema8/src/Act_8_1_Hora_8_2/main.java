/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act_8_1_Hora_8_2;

/**
 *
 * @author alvar
 */
public class main {
    public static void main(String[] args) {
        Hora h = new Hora(14,23);
        h.inc();
        System.out.println(h);
        
        HoraExacta  h2 = new HoraExacta(15,23,54);
        HoraExacta  h3 = new HoraExacta(15,23,54);
        
        System.out.println(h2.sonIguales(h3));
        h3.inc();
        System.out.println(h3);
        System.out.println(h2.sonIguales(h3));
        System.out.println(h2.toString());
    
    }
}
