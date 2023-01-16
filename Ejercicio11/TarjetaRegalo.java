package Ejercicio11;

import java.text.DecimalFormat;

public class TarjetaRegalo {
    private double saldo;
    private String key="";
    public TarjetaRegalo(){
        this.saldo=0;
        for(int i=0;i<5;i++){
            this.key+=(int)(Math.random()*10);
        }
    }

    public TarjetaRegalo(double s){
        this.saldo=s;
        for(int i=0;i<5;i++){
            this.key+=(int)(Math.random()*10);
        }    
    }

    public void gasta(double d){
        if(this.saldo-d<0){
            System.out.println("No tiene suficiente saldo para gastar "+d+" euros");
        }else{
            this.saldo-=d;
        }
    }
    @Override
    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Tarjeta nº "+this.key+" - Saldo "+formatoEuros.format(this.saldo)+" euros";
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        TarjetaRegalo tarj=new TarjetaRegalo(this.saldo+t.saldo);
        this.saldo=0;
        t.saldo=0;
        return tarj;
    }
}
