package Ejercicio16;

public class Linea{
    private Punto a;
    private Punto b;
    public Linea(Punto x, Punto y) {
        this.a=x;
        this.b=y;
    }
    @Override
    public String toString(){
        return "Línea formada por los puntos "+(a.toString())+" y "+(b.toString());
    }
    
}
