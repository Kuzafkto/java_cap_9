package Ejercicio3;

public class Ave extends Animal{
    public Ave (){
        super();
    }

    public Ave(Sexo s){
        super (s);
    }

    public void volar(){
        System.out.println("Estoy volando");
    }

    public void cuidarHuevos(){
        if(this.getSexo()==Sexo.MACHO){
            System.out.println("Estoy cuidando los huevos");
        }else{
            System.out.println("Yo no cuido los huevos porque soy hembra");
        }
    }

    public void hacerNido(){
        System.out.println("A contruir mi nido");
    }

}