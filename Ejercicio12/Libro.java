package Ejercicio12;

public class Libro extends Publicacion implements Prestable{
    private String state;
    public Libro (String i,String n,int y){
        super(i,n,y);
        this.state="no prestado";
    }
    @Override
    public void presta(){
        if(this.state.equals("prestado")){
            System.out.println("Lo siento, ese libro ya está prestado.");
        }else{
            this.state="prestado";
        }
    }
    @Override
    public void devuelve(){
        if(this.state.equals("no prestado")){
            System.out.println("Este libro ya está devuelto");
        }else{
            this.state="no prestado";
        }
    }
    @Override
    public boolean estaPrestado(){
        if(this.state.equals("prestado")){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return super.toString()+(estaPrestado()?" (prestado)":" (no prestado)");
    }
}
