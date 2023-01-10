package Ejercicio1;
public class Caballo {
    private String raza;
    private String nombre;
    private int edad;
    private int peso;
    private int carrerasGanadas;
     Caballo(String n,String r,int e,int p, int c){
        this.nombre=n;
        this.raza=r;
        this.edad=e;
        this.peso=p;
        this.carrerasGanadas=c;
     }
     @Override
     public String toString(){
        return "Nombre: "+this.nombre+"\nEdad: "+this.edad+"\nPeso: "+this.peso+"\nCarreras Ganadas: "+this.carrerasGanadas;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getPeso(){
        return peso;
    }

    public void setPeso(int peso){
        this.peso=peso;
    }

    public int getCarrerasGanadas(){
        return carrerasGanadas;
    }

    public void setCarrerasGanadas(int carrerasGanadas){
        this.carrerasGanadas=carrerasGanadas;
    }
    public void relinchar(){
        System.out.println("jiiiiiii, iiiiou");
    }

    public void cabalgar() {
        System.out.println("Estoy cabalgando");
    }

    public void trotar(){
        System.out.println("Estoy trotando tranquilamente");
    }

    public void correr(){
        if(this.edad>25){
            System.out.println("Soy muy viejo para correr :c");
        }else{
            System.out.println("A correeeeeeeer");
        }
    }
    public void rampar(){
        System.out.println("Mira mira, a dos pata mama, como el logo de Ferrari");
    }
}
