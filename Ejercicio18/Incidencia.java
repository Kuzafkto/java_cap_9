package Ejercicio18;

public class Incidencia {
    private static int counter=1;
    private static int pendientes=0;
    private int number;
    private String problem="";
    private int puesto;
    private String solution="";
    public static int getPendientes(){
        return pendientes;
    }
    public Incidencia(int p,String prob){
        if(p<0){
            System.out.println("El puesto no puede ser negativo");
        }else{
            this.number=counter;
            counter++;
            this.puesto=p;
            this.problem=prob;
            pendientes++;
        }
    }
    public void resuelve(String r){
        this.solution=r;
        pendientes--;
    }
    @Override
    public String toString(){
        return "Incidencia "+this.number+" - Puesto: "+this.puesto+" - "+this.problem+" - "+(solution.equals("")?"Pendiente":"Resuelta - "+this.solution);
    }
}
