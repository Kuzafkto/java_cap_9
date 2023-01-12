package Ejercicio5;

public class Pizza {
    private static int totalServ=0;
    private static int totalPed=0;
    private String type;
    private String size;
    private String state;

    public Pizza(){
        this.type="margarita";
        this.size="mediana";
        this.state="pedida";
        totalPed++;
    }
    public Pizza (String t,String s){
        if(t.equals("margarita")||t.equals("cuatro quesos")||t.equals("funghi")){
        this.type=t;
    }else{
        System.out.println("Ese tipo de pizza no existe");
    }
        if(s.equals("mediana")||s.equals("familiar")){
        this.size="mediana";
        this.state="pedida";
        totalPed++;
        }else{
            System.out.println("Ese tamaño de pizza no existe");
        }
     
    }

    public static int getTotalPedidas(){
        return Pizza.totalPed;
    }

    public static int getTotalServidas(){
        return Pizza.totalServ;
    }

    public void sirve(){
        if(this.state.equals("pedida")){
        this.state="servida";
        totalPed--;
        totalServ++;
        }else{
            System.out.println("Esta pizza ya está pedida");
        }
    }
    @Override
    public String toString(){
        return "pizza "+this.type+" "+this.size+", "+this.state;
    }
}
