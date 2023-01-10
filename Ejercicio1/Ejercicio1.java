package Ejercicio1;
public class Ejercicio1 {
    public static void main(String[] args) {
        
    Caballo caballo1=new Caballo("Juan","Purasangre",17,450,9);
    Caballo caballo2=new Caballo("Alberto","Blanco",8,400,1);

    caballo1.relinchar();
    caballo2.correr();
    System.out.println(caballo1);
    System.out.println(caballo2);
    
    }

}
