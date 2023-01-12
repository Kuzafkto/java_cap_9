package Ejercicio3;

public class Canario extends Ave{
    public Canario (){
        super ();
    }
    public Canario(Sexo s){
        super(s);
    }

    public void cantar(){
        System.out.println("Estoy cantando una bonita cancion");
    }

    public void pia(){
        System.out.println("Pio pio pio pio pio pio pio");
    }

    public void repitePalabra(){
        System.out.println("Yo no repito yo canto, soy canario no loro");
    }

}
