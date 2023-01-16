package Ejercicio12;

public class Revista extends Publicacion{
    private int num;
    public Revista (String i,String n,int y, int nu){
        super(i, n, y);
        this.num=nu;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
