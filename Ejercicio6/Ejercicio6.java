package Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {
        Tiempo time1=new Tiempo(1,80,30);
        Tiempo time2=new Tiempo(2,30);
        System.out.println(time1);
        System.out.println(time2);
        time1.resta( 30, 40);
        time2.suma(1, 120, 80);
        System.out.println(time1);
        System.out.println(time2);
    }
}
