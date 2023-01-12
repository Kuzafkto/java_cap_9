package Ejercicio3;

public class Mamifero extends Animal{
    public Mamifero(){
        super();
    }
    public Mamifero (Sexo s){
        super(s);
    }

    public void amamantar(){
        if(this.getSexo()==Sexo.MACHO){
            System.out.println("No puedo amamantar");
        }else{
            System.out.println("Puedo amamantar");
        }
    }
    public void esconderse(){
        System.out.println("Voy a esconderme");
    }

    public void correr(){
        System.out.println("A correr");
    }
}
