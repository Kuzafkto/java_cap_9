package Ejercicio3;

public class Lagarto extends Animal{
    public Lagarto (){
        super ();
    }
    public Lagarto (Sexo s){
        super(s);
    }
    public void cambiarDePiel(){
        System.out.println("Voy a cambiar de piel");
    }
    public void ponerHuevo(){
        if(this.getSexo()==Sexo.MACHO){
            System.out.println("Soy macho, no puedo poner huevos");
        }else{
            System.out.println("Estoy poniendo un huevo");
        }
    }
    public void reptar(){
        System.out.println("Estoy reptando");
    }
}
