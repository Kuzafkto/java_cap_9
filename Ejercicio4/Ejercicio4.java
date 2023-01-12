package Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        
    Fraccion frac1=new Fraccion(20,50);
    Fraccion frac2=new Fraccion(7,14);

    System.out.println(frac1);
    System.out.println(frac2);
    System.out.println(frac2.simplifica());
    System.out.println(frac1.multiplica(frac2));
    }
}
