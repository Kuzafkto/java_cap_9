package Ejercicio2;
public abstract class Vehiculo {
    private static int vehiculosCreados=0;
    private static int kilometrosTotales=0;
    public static int getKilometrosTotales(){
        return Vehiculo.kilometrosTotales;
    }
    public static int getVehiculosCreados(){
        return Vehiculo.vehiculosCreados;
    }
    private String marca;
    private String modelo;
    private int kilometrosRecorridos;

    public Vehiculo(){
        this.marca="";
        this.modelo="";
        Vehiculo.vehiculosCreados++;
    }
    public Vehiculo(String mar,String mod){
        marca=mar;
        modelo=mod;
        kilometrosRecorridos=0;
        vehiculosCreados++;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getKilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }
    @Override
    public String toString(){
        return "Modelo: "+this.modelo+"\nMarca: "+this.marca;
    }
    public void andar(int km){
        System.out.println("A darme un paseo en mi "+this.modelo+", solo unos "+km+" kilometros");
        this.kilometrosRecorridos+=km;
        Vehiculo.kilometrosTotales+=km;
    }
}
