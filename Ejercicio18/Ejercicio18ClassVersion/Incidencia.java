package Ejercicio18.Ejercicio18ClassVersion;

public class Incidencia {
    private static int pendientes=0;
    private static int siguienteCodigo=1;
    private int puesto;
    private String incidencia;
    private String resolucion;
    private int codigo;
    private String estado;
    Incidencia(int puesto,String incidencia){
        this.puesto=puesto;
        this.incidencia=incidencia;
        this.resolucion="";
        pendientes++;
        this.estado="Pendiente";
        this.codigo=siguienteCodigo++;  
    }

    public static int getPendientes() {
        return pendientes;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public String getResolucion() {
        return resolucion;
    }   
    public int getPuesto() {
        return puesto;
    }

    public String getEstado() {
        return estado;
    }

    public void resuelve(String resolucion){
        this.resolucion=resolucion;
        this.pendientes--;
        this.estado="Resuelta";
    }
    @Override
    public String toString() {
        return "Incidencia "+this.codigo+" - Puesto: "+this.puesto+" - "+this.incidencia+" - "+this.estado+(this.estado.equals("Pendiente")?"":" - "+this.resolucion);
    }   
}
