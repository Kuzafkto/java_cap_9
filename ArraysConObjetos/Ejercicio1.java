package ArraysConObjetos;
import Ejercicio3.Gato;
import Ejercicio3.Sexo;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Gato gatos[]=new Gato[4];
        for(int i=0;i<gatos.length;i++){
            System.out.print("Decida el sexo del gato "+(i+1)+"\n1.Hembra\n2.Macho\nIngrese la opción: ");
            int choice=sc.nextInt();
            while(choice<1||choice>2){
                System.out.print("Opción incorrecta, vuelva a ingresarla: ");
                choice=sc.nextInt();
            }
            System.out.println("Ingrese la raza del gato: ");
            String race=sc.nextLine();
            race=sc.nextLine();
            gatos[i]=new Gato(choice==1?Sexo.HEMBRA:Sexo.MACHO,race );
        }
        for (int i=0;i<gatos.length;i++){
            System.out.print("\nGato: "+(i+1)+":\nSexo: "+(gatos[i].getSexo()==Sexo.HEMBRA?"Macho":"Hembra ")+"\nRaza: "+gatos[i].getRaza());
        }
        sc.close();
    }
}
