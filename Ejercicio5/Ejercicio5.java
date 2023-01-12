package Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        Pizza margar=new Pizza("margarita","megagigante");
        Pizza fung=new Pizza("funghi","familiar");
        Pizza fcheese=new Pizza("cuatro quesos","familiar");
        System.out.println(margar);
        System.out.println(fung);
        fung.sirve();
        System.out.println(fung);
        System.out.println(fcheese);
        fung.sirve();
        System.out.println("Hay un total de "+Pizza.getTotalPedidas()+" pizzas pedidas y "+Pizza.getTotalServidas()+" servidas.");
    }
}
