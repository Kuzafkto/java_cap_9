package Ejercicio12;

public abstract class Publicacion {
     int year;
     String name;
     String isbn;

    public Publicacion(){
        this.isbn="";
        this.name="";
        this.year=0;
    }

    public Publicacion (String i,String n,int y){
        this.isbn=i;
        this.name=n;
        this.year=y;
    }

    @Override
    public String toString(){
        return "ISBN: "+this.isbn+", título: "+this.name+", año de publicación: "+this.year;
    }
}
