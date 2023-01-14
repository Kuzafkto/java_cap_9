package Ejercicio8;

public class Terminal2 {
    private int tiempoEnLlamada;
    private String telefono;
    public int getTiempoenLlamada() {
        return this.tiempoEnLlamada;
    }

    public String getTelefono(){
        return this.telefono;
    }

    private Terminal2(){
        this.telefono="678 12 34 56";
        this.tiempoEnLlamada=0;
    }

    private Terminal2(String telefono){
        this();
        if(telefono.length()>0){
            this.telefono=telefono;
        }
    }
    private void enLlamada(int tiempo){
        this.tiempoEnLlamada+=tiempo;
    }
    public void llama(Terminal2 t,int tiempo){
        this.enLlamada(tiempo);
        t.enLlamada(tiempo);
    }
    public void recibe(int tiempo){
        this.enLlamada(tiempo);
    }
}
