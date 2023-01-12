package Ejercicio3;
public class Pinguino extends Ave{
    public Pinguino (){
        super();
    }
    public Pinguino (Sexo s){
        super(s);
    }
    public void Migrar(){
        System.out.println("Los pinguinos no migran");
    }
    @Override
    public void volar(){
        System.out.println("Los pinguinos no volamos :c");
    }
    public void nadar(){
        System.out.println("Estoy nadando como un rayo");
    }
}
