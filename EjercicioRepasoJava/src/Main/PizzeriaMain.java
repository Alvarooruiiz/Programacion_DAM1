package Main;

import Pizza.Cola;
import Pizza.Pizza;
import Pizza.PizzaClasica;

public class PizzeriaMain {

    public static Pizza elegirPizza() {
        
    }
    
    public static void pausa(Pizza pizza){
        try{
            Thread.sleep(pizza.getSegundosenHorno()*1000);
        }catch(InterruptedException ex){
            
        }
    }

    public static int menu() {

        int opcion = 0;

        do {
            System.out.println(" -- MENU --");
            System.out.println("1. Insertar pizza");
            System.out.println("2. Mostrar pizzas clasicas en espera con borde relleno de queso");
            System.out.println("3. Encendido de horno");
            System.out.println("4. Salir");
            opcion = EntradaTeclado.pedirEntero("Introduzca una opcion: ");
        } while ((opcion < 0) || (opcion > 4));

        return opcion;
    }

    public static void main(String[] args) {
        int opcion, numeroPizzas, numPizzasbordeRelleno = 0;
        Cola<Pizza> pizzeria = new Cola<>(3);
        Pizza pizza;
        do {
            opcion = menu();
            switch (opcion) {
                case 1 -> {
                    pizza = elegirPizza();
                    System.out.println(pizzeria.push(pizza)
                            ? "Se ha añadido su pizza e el horno"
                            : "El horno esta lleno. Espere, por favor");
                }

                case 2 -> {
                    numeroPizzas = pizzeria.getNumElementos();
                    for (int i = 1; i <= numeroPizzas; i++) {
                        pizza = pizzeria.pop();
                        if (pizza instanceof PizzaClasica pizzaClasica) {
                            if (pizzaClasica.isBordeRelleno()) {
                                numPizzasbordeRelleno++;
                            }
                        }
                        pizzeria.push(pizza);
                    }
                    System.out.println("El porcentaje de pizzas clasicas con borde relleno son " + numPizzasbordeRelleno);
                }
                
                case 3->{
                    numPizzas = pizzeria.getNumElementos();
                    for(int i=1;i<=numeroPizzas;i++)
                }
            }
        } while (opcion != 4);
    }
}
