package Ejercicio2;
public class Bicicleta extends Vehiculo{
    public Bicicleta(String mar,String mod){
        super(mar,mod);
    }

    public void caballitoConBici(){
        System.out.println("De caballito con mi bici "+this.getModelo()+" como el logo de ferrariii");
    }
}
