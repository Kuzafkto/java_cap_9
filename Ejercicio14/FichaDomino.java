package Ejercicio14;

public class FichaDomino {
    private int side1;
    private int side2;

    public FichaDomino (int i, int j){
        if(i<0||i>6||j<0||j>6){
            System.out.println("Error, los lados deben ser mayores a 0 y menores a 7");
        }else{
            this.side1=i;
            this.side2=j;
        }
    }

    public int getSide1(){
        return this.side1;
    }

    public int getSide2(){
        return this.side2;
    }
    public FichaDomino voltea(){
        return new FichaDomino(side2, side1);
    }
    
    public boolean encaja(FichaDomino f){ 
        if(this.side1==f.side2||this.side1==f.side1||this.side2==f.side1||this.side2==f.side2){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "["+(side1==0?" ":this.side1)+"|"+(side2==0?" ":this.side2)+"]";
    }
}
