package Ejercicio16.Ejercicio16ClassVersion;

import javax.sound.sampled.Line;

public class Linea{
    public Punto p1;
    public Punto p2;

    public Linea(){
        this(new Punto(), new Punto(),true);
    }

    public Linea (Punto p){
        this(new Punto(),p,true);
    }
    public Linea(Punto p1,Punto p2, boolean clone){
        if(clone){
            this.p1=new Punto(p1.x, p1.y);
            this.p2=new Punto(p2.x,p2.y);
        }else{
            this.p1=p1;
            this.p2=p2;
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Linea formada por los puntos "+this.p1+" y "+this.p2;
    }
}
