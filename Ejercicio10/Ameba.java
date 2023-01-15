package Ejercicio10;

public class Ameba {
    private int weight;
    public Ameba(){
        this.weight=3;
    }
    public Ameba(int p){
        this.weight=p;
    }
    //Decidi añadir fagocitar como un proceso privado debido a que el usuario no debería de poder acceder a el pero es un proceso que se repite en cada funcion que la ameba hace.
    private void fagocitar(){
        if (this.weight>0){
            this.weight--;
        }
    }
    public void come(int c){
        this.weight+=c;
        this.fagocitar();
    }
    public void come(Ameba a){
        this.weight+=a.weight;
        a.weight=0;
        this.fagocitar();
    }

    @Override
    public String toString(){
        return "Soy una ameba y peso "+this.weight+" microgramos.";
    }
}
