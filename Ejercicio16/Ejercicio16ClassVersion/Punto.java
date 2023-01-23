package Ejercicio16.Ejercicio16ClassVersion;

public class Punto {
    public double x;
    public double y;
    
    Punto(){
        this.x=0;
        this.y=0;
    }
    Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "("+this.x+","+this.y+")";
    }
}
