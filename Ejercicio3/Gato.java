package Ejercicio3;

public class Gato extends Mamifero{
    private String raza;
    public Gato(){
        super();
    }
    public Gato (Sexo s ){
        super (s);
        this.raza="siames";
    }

    public Gato(String r){
        super(Sexo.HEMBRA);
        this.raza=r;
    }

    public Gato(Sexo s, String r){
        super(s);
        this.raza=r;
    }

    public String getRaza(){
        return raza;
    }
    public void maulla(){
        System.out.println("Miauuuu");
    }

    public void ronronea(){
        System.out.println("Prrrrrrr");
    }
    public void bebe(String bebida){
        if(bebida.equals("leche")){
            System.out.println("Que rico,leche, me encanta tomar leche");
        }else{
            System.out.println("Perdón pero yo solo tomo leche");
        }
    }
    public void limpiarse() {
        System.out.println("Me estoy lamiendo");
      }
      
      public void cazar() {
        System.out.println("Estoy cazando ratones");
      }
}
