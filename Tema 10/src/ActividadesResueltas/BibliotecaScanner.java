package ActividadesResueltas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BibliotecaScanner {

    public static Scanner sc = new Scanner(System.in);

    public static char pedirChar(String cadena) {
        char letra = ' ';
        System.out.println(cadena);
        letra = sc.next().charAt(0);
        
        sc.nextLine();
        
        return letra;
    }

    public static String pedirCadena(String cadena) {
        String texto="";
        System.out.println(cadena);
        texto=sc.nextLine();
        
        sc.nextLine();
        
        return texto;
    }

    public static int pedirInt(String cadena) {
        int num=0;
        
        boolean error;
        
        do{
            try{
                error=false;
                System.out.println(cadena);
                num=sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("El dato introducido no es correcto");
                error=true;
            }finally{
                sc.nextLine();
            }
        }while(error);
        return num;
    }

    public static float pedirFloat(String cadena) {
        float num=0;
        boolean error;
        
        do{
            try{
                error=false;
                System.out.println(cadena);
                num=sc.nextFloat();
            }catch(InputMismatchException e){
                System.out.println("El dato introducido no es correcto");
                error=true;
            }finally{
                sc.nextLine();
            }
        }while(error);
        return num;
    }

    public static double pedirDouble(String cadena) {
        double num=0;
        boolean error;
        
        do{
            try{
                error=false;
                System.out.println(cadena);
                num=sc.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("El dato introducido no es correcto");
                error=true;
            }finally{
                sc.nextLine();
            }
        }while(error);
        return num;
    }

    public static long pedirLong(String cadena) {
        long num=0;
        boolean error;
        
        do{
            try{
                error=false;
                System.out.println(cadena);
                num=sc.nextLong();
            }catch(InputMismatchException e){
                System.out.println("El dato introducido no es correcto");
                error=true;
            }finally{
                sc.nextLine();
            }
        }while(error);
        return num;
    }

}
