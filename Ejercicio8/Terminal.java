package Ejercicio8;

public class Terminal {
    public String num;
    public int time;
    public Terminal(){
        this.num="0 0 0 0";
    }
    public Terminal (String n){
        this.num=n;
    }

    public String getNum(){
        return num;
    }

    public int getTime(){
        return time;
    }
   
    @Override
    public String toString(){
        return "Nº "+this.num+" - "+this.time+"s de conversación";
    }

    public void llama(Terminal t,int conv){
        this.time+=conv;
        t.time+=conv;
    }
}
