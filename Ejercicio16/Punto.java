package Ejercicio16;

public class Punto {
    private double x;
    private double y;

    public Punto(double i, double j){
        this.x=i;
        this.y=j;
    }
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
    @Override
    public String toString(){
        return "("+this.x+", "+this.y+")";
    }
}
