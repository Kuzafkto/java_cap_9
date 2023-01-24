package Ejercicio17;

public class Piramide {
    private static int piramidesCreadas;
    public int altura;

    public Piramide(int x){
        if(x<0){
            System.out.println("La altura no puede ser menor a 0");
        }else{
            this.altura=x;
            piramidesCreadas++;
        }
       
    }

    public static int getPiramidesCreadas(){
        return piramidesCreadas;
    }

    @Override
    public String toString(){
        String ret="";
        for(int i=1;i<=altura;i++){
            for(int m=0;m<altura-i;m++){
                ret+=" ";
            }
            for(int j=0;j<i*2-1;j++){
                ret+="*";
            }
            ret+="\n";
        }
        return ret;
    }
}
