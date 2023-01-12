package Ejercicio4;

public class Fraccion implements Cloneable{
    private int numerador;
    private int denominador;
    /*Añadido tras el trabajo del profe */
    Fraccion (){
        this.numerador=0;
        this.denominador=1;
    }
    Fraccion(int n, int d){
        this();
        if(d==0){
            System.out.println("Una fraccion no puede tener de denominador 0");
        
    }else{
        this.numerador = Math.abs(n);
        this.denominador = Math.abs(d);
    }
}

    Fraccion (Fraccion f){
        this(f.getNumerador(),f.getDenominador());
    }

    @Override 
    public Fraccion clone(){
        return new Fraccion(this.numerador,this.denominador);
    }

    public int getNumerador(){
        return numerador;
    }

    public int getDenominador(){
        return denominador;
    }

    public void setNumerador (int n ){
        this.numerador=n;
    }

    public void setDenominador(int d){
        this.denominador=d;
    }
    @Override
    public String toString() {
       boolean negativo=(this.numerador<0||this.denominador<0)&&!(this.numerador<0&&this.denominador<0);
       return negativo?"-":""+this.numerador+"/"+this.denominador;
      }

    public Fraccion invierte(){
        if(this.getNumerador()!=0){
            return new Fraccion(this.getDenominador(),this.getNumerador());
        }else{
            System.out.println("Error, el numerador no puede ser 0");
            return this.clone();
        }
    }

    public Fraccion multiplica(Fraccion f){
        return new Fraccion(this.numerador*f.getNumerador(),this.denominador*f.getDenominador());
    }
    public Fraccion multiplica(int n){
        return new Fraccion(this.numerador*n,this.denominador);
    }
     public Fraccion divide(int n){
        return this.divide(new Fraccion(n,1));
     }
    public Fraccion divide(Fraccion f){
        return this.multiplica(f.invierte());
    }

    public Fraccion simplifica(){
       int n = this.numerador;
       int d = this.denominador;
       for (int i = 2; i <=/*menor igual por si cae en un primo*/Math.abs(Math.min(n, d)); i++) {
        while (((n % Math.abs(i)) == 0) && ((d % Math.abs(i)) == 0)) {
          n /= i;
          d /= i;
        }
      }
      return new Fraccion(n, d);
    }
}
