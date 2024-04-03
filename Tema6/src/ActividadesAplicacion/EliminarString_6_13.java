package ActividadesAplicacion;

import java.util.Scanner;
public class EliminarString_6_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la sentencia");
        String sent = sc.nextLine();
        String salida;
        int pos=0;
        boolean lea=false;
        
        do{
            sent(pos);
        }while (lea==false);
    }
}
