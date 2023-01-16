package Ejercicio12.Ejercicio12ClassVersion;

public class Libro extends Publicacion implements Prestable{
private boolean prestado;
    Libro(String isbn, String titulo, int ano) {
        super(isbn, titulo, ano);
        this.prestado=false;
    }

    @Override 
    public void presta(){
        if(this.prestado){
            System.out.println("Lo siento ese libro esta prestado");
        }else{
            this.prestado=true;
        }
        
    }
    
    @Override 
    public void devuelve(){
        this.prestado=false;
    }
 @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"("+(this.prestado?"prestado ":"no prestado ");
    }
}
