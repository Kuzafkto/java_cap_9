package ArraysConObjetos.Ejercicio5;

public class Articulo {
    private String code="";
    public String desc="";
    public double buyPrice=0;
    public double sellPrice=0;
    public int stock=0;

    public Articulo(){
        this.code=generateCode();
    }
    public Articulo(String desc){
        this.code=generateCode();
        this.desc=desc;
    }
    public Articulo(String desc,double buy){
        this.code=generateCode();
        this.desc=desc;
        this.buyPrice=buy;
    }
    public Articulo (String desc,double buy,double sell){
        this.code=generateCode();
        this.desc=desc;
        this.buyPrice=buy;
        this.sellPrice=sell;
    }
    public Articulo(String desc,double buy,double sell,int stock){
        this.code=generateCode();
        this.desc=desc;
        this.buyPrice=buy;
        this.sellPrice=sell;
        this.stock=stock;
    }
    private String generateCode(){
        //El codigo será de 4 digitos y solo de números.
        String cod="";
        for(int i=0;i<4;i++){
            cod+=(int)(Math.random()*10);
        }
        return cod;
    }

    public String getCode(){
        return code;
    }
   //En este caso prefiero poner las variables "menos importantes" a publico y acceder a ellas mediante el código en vez de utilizar setters.

    @Override
    public String toString(){
        return this.code+"| "+this.desc+":\n"+"Precio de venta: "+this.sellPrice+"\nPrecio de compra: "+this.buyPrice+"\nStock: "+this.stock;
    }
}
