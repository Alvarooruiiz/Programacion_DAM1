package creaciondesoftware;

import java.util.*;

public class CreacionDeSoftware {

    public static Scanner sc = new Scanner(System.in);

    public static boolean pregunta(int i) {        
        boolean respuesta1 = false;
        String preguntasGeografia[] = {"¿Cual es la capital de España?", "¿Cuál es el rio mas largo del planeta?", "¿Cual es la capital de Italia?"};
        String respuestasGeografia[] = {"MADRID", "NILO", "ROMA"};
                
        String preguntasDeporte[] = {"¿Quién ha ganado el mundial en 2022?", "¿En qué año ganó el mundial España?", "¿Cuántas champions tiene el Real Madrid?"};
        String respuestasDeporte[] = {"ARGENTINA", "2010", "14"};

        System.out.println("Que tipo de pregunta quieres \n 1-> Geografia \n 2-> Deporte");
        System.out.println("-------------------------------------------------------");
        int selec = sc.nextInt();

        switch (selec) {
            case 1 -> {
                System.out.println(preguntasGeografia[i]);
                String preguntaGeografia = sc.next();
                System.out.println("-------------------------------------------------------");
                if (preguntaGeografia.equals(respuestasGeografia[i])) {
                    respuesta1 = true;
                    System.out.println("Muy bien!! Acertaste");
                } else {
                    System.out.println("Vayaaa... Lo siento la respuesta era " + respuestasGeografia[i]);
                }
                System.out.println("-------------------------------------------------------");
            }

            case 2 -> {
                System.out.println(preguntasDeporte[i]);
                String respuestaDeporte = sc.next();
                System.out.println("-------------------------------------------------------");
                if (respuestaDeporte.equals(respuestasDeporte[i])) {
                    respuesta1 = true;
                    System.out.println("Muy bien!! Acertaste");
                } else {
                    System.out.println("Vayaaa... Lo siento la respuesta era " + respuestasDeporte[i]);
                }
                System.out.println("-------------------------------------------------------");
            }

        }
        return respuesta1;
    }

    public static void main(String[] args) {
        boolean respuestasFinales[] = new boolean[3];
        int cont = 0;
        
        System.out.println("Bienvenido al trivial, recuerde que las respuestas deben ser en mayúsculas y sin tildes");

        for (int i = 0; i < respuestasFinales.length; i++) {
            respuestasFinales[i] = pregunta(i);
            if (respuestasFinales[i] == true) {
                cont++;
            }
        }
        
        System.out.println("Has acertado " + cont + " de " + respuestasFinales.length);

    }

}
