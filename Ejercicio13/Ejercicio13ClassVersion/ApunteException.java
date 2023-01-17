package Ejercicio13.Ejercicio13ClassVersion;

public class ApunteException extends Exception{
    public int code=100;
    public String msg;

    ApunteException(){
        this.code=100;
        this.msg="Es imposible realizar un importe o cargo con un valor negativo";
    }

    @Override
    public String toString() {
        return "Code: "+this.code+"\nMessage: "+this.msg;
    }
}
