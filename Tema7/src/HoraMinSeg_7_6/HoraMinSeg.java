package HoraMinSeg_7_6;

import java.util.Scanner;

public class HoraMinSeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora obj = new Hora();
        int num, nSeg;
        
        System.out.print("Hora: ");
        num=sc.nextInt();
        obj.setHora(num);
        System.out.print("Minutos: ");
        num=sc.nextInt();
        obj.setMin(num);
        System.out.print("Segundos: ");
        num=sc.nextInt();
        obj.setSeg(num);
        
        System.out.println("Introduzca el numero n de segundos a añadir");
        nSeg=sc.nextInt();
        
        for(int i=0; i<nSeg; i++){
            System.out.println(obj.getHora() + ":" + obj.getMin() + ":" + obj.getSeg());
            obj.nSegundos();
        }
    }
}
