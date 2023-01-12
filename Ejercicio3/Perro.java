package Ejercicio3;

public class Perro extends Mamifero{
    private String raza;
    public Perro(){
        super();
    }
    public Perro (Sexo s ){
        super (s);
        this.raza="siames";
    }

    public Perro(String r){
        super(Sexo.HEMBRA);
        this.raza=r;
    }

    public Perro(Sexo s, String r){
        super(s);
        this.raza=r;
    }

    public String getRaza(){
        return raza;
    }

    public void ladra(){
        System.out.println("Guau guau guau guau");
    }
    public void perseguirCola(){
        System.out.println("Sigo mi cola sigo mi cola sigo mi cola sigo mi cola sigo mi cola...");
    }

    public void cazar(){
        System.out.println("Estoy cazando perdices");
    }

    
}
