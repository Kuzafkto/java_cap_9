package Ejercicio6;

//Tiempo class version made during class
public class Tiempo2 implements Cloneable{
    private int segundos;

   private int getHorasEnTiempo(){
        return Math.abs(this.segundos/3600);
    }

    private int getMinutosEnTiempo(){
        return Math.abs(this.segundos%3600/60);
    }

    private int getSegundosEnTiempo() {
        return Math.abs(this.segundos%3600%60);
    }
    public int getSegundos(){
        return this.segundos;
    }
    Tiempo2(){
        this.segundos=0;
    }
    Tiempo2(int segundos){
        this.segundos=segundos;
    }
    Tiempo2(int h,int m,int s){
        this.segundos=h*3600+m*60+s;
    }

    Tiempo2(Tiempo2 t){
        this(t.getSegundos());
    }
    @Override
    public Tiempo2 clone(){
        return new Tiempo2(this.getSegundos());
    }

    public Tiempo2 suma(Tiempo2 t){
           return new Tiempo2(this.segundos+t.getSegundos());
    }
    public Tiempo2 resta(Tiempo2 t){
        return new Tiempo2(this.segundos-t.getSegundos());
    }

    @Override
    public String toString(){
        return(this.segundos<0?"-":"")+this.getHorasEnTiempo()+"h "+this.getMinutosEnTiempo()+"m "+this.getSegundosEnTiempo()+"s "+(this.segundos<0?")":"");
    }
}
