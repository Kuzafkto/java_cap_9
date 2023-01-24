package Ejercicio17;

public class Rectangulo{
    private int base;
    private int altura;
    private static int rectangulosCreados;
    public Rectangulo (int x,int y){
        if(x<0){
            System.out.println("La altura no puede ser menor a 0");
        }else{
            this.altura=x;
        }
        if(y<0){
            System.out.println("La base no puede ser menor a 0");
        }else{
            this.base=y;
            rectangulosCreados++;
        }
    }
    public static int getRectangulosCreados(){
        return rectangulosCreados;
    }
    
    @Override
    public String toString(){
        String ret="";
        for(int i=0;i<this.base;i++){
            for(int j=0;j<this.altura;j++){
                    ret+="*";
            }
            ret+="\n";
        }
        return ret;
    }
}
