package Ejercicio2;
public class Coche extends Vehiculo{

    public Coche(String mar,String mod){
        super(mar,mod);
    }

    public void quemaRuedasCoche(){
        System.out.println("Quemando las ruedas de mi"+this.getModelo()+" a lo locoo");
    }

}
