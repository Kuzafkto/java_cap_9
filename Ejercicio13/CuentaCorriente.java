package Ejercicio13;

import java.text.DecimalFormat;

public class CuentaCorriente {
    private double saldo;
    private String accountNumber="";
    public CuentaCorriente(){
        this.saldo=0;
        for(int i=0;i<10;i++){
            this.accountNumber+=(int)(Math.random()*10);
        }
    }
    public CuentaCorriente (double s){
        this.saldo=s;
        for(int i=0;i<10;i++){
            this.accountNumber+=(int)(Math.random()*10);
        }
    }

    public void cargo(double s){
        if (s<0){
            System.out.println("La cantidad del cargo no puede ser negativa");
        }else{
            this.saldo-=s;
        }
    }
    public void ingreso(double d){
        if (d<0){
            System.out.println("La cantidad a ingresar no puede ser negativa");
        }else{
            this.saldo+=d;
        }
    }
    public void transferencia(CuentaCorriente c, double d){
        if (d<0){
            System.out.println("La cantidad a transferir no puede ser negativa");
        }else{
            this.saldo-=d;
            c.saldo+=d;
        }
    }

    @Override
    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Número de cta: "+this.accountNumber+" Saldo: "+formatoEuros.format(saldo)+" euros";
    }
}
