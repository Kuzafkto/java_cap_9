package Ejercicio13.Ejercicio13ClassVersion;

public class CuentaCorriente {
    private int saldo;
    private String numCuenta;

    private String generaCuenta(){
        String cuenta="";
        for(int i=0;i<10;i++){
            cuenta+=(int)(Math.random()*10);
        }
        return cuenta;
    }

    CuentaCorriente(int saldo){
        this.saldo=saldo;
        this.numCuenta=this.generaCuenta();
    }
    CuentaCorriente(){
        this.saldo=0;
        this.numCuenta=this.generaCuenta();
    }
    public void ingreso(int cant) throws ApunteException{
        if(cant<0){
            throw new ApunteException();
        }else{
            this.saldo+=cant;
        }

    }

    public void cargo (int cant) throws ApunteException{
        if(cant<0){
            throw new ApunteException();
        }else{
            this.saldo-=cant;
        }
    } 

    public void transferencia(CuentaCorriente c,int cant)throws ApunteException{
        if(cant<0){
            throw new ApunteException();
        }else{

            this.cargo(cant);
            c.ingreso(cant);
    
        } 
       }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Numero de cuenta "+ this.numCuenta+"Saldo: "+this.saldo+" euros";
    }
}
