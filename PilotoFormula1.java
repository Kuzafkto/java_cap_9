public class PilotoFormula1 {
    private Sexo sex=Sexo.NO_BINARIO;
    private int dni=0;
    private String name="";
    public PilotoFormula1(Sexo s,int d, String n){
        sex=s;
        dni=d;
        name=n;
    }
    public PilotoFormula1(int d, String n){
        dni=d;
        name=n;
    }
    public PilotoFormula1(Sexo s, String n){
        sex=s;
        name=n;
    }
    public PilotoFormula1(Sexo s, int d){
        sex=s;
        dni=d;
    }
    public PilotoFormula1(String n){
        name=n;
    }
    public PilotoFormula1(Sexo s){
        sex=s;
    }
    public PilotoFormula1 (int d){
        dni=d;
    }
    public PilotoFormula1 (){
        sex=Sexo.NO_BINARIO;
        dni=0;
        name="";
    }  
    public Sexo getSexo(){
        return sex;
    }
    public int getDNI(){
        return dni;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Nombre: "+this.name+"\n"+"Sexo: "+this.sex+"\n"+"DNI: "+this.dni+"\n";
    }
}
