package Ejercicio3;

public abstract class Animal {
    private Sexo sexo;
    public Animal (){
        this.sexo=Sexo.MACHO;
    }
    public Animal(Sexo s){
        this.sexo=s;
    }
    public Sexo getSexo(){
        return this.sexo;
    }
    @Override
    public String toString(){
        return "Sexo: "+this.sexo+"\n";
    }
    public void dormir(){
        System.out.println("Zzzzzzzz");
    }
    public void comer(String comida){
        System.out.println("Estoy comiendo "+comida+", ñom ñom ñom ñom");
    }
    

}
