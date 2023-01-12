package Ejercicio2;
import java.util.Scanner;;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Coche camaro=new Coche("Chevrolet", "Camaro");
        Coche mustang=new Coche("Ford", "Mustang");
        Bicicleta bmx=new Bicicleta("Mongoose ", "Legion L100");
        System.out.println(camaro);
        System.out.println();
        System.out.println(bmx);
        System.out.println();
        System.out.println(mustang);
        int choice=0;
        do{
            System.out.print("\nVEHÍCULOS\n=========\n1. Anda con la bicicleta\n2. Haz el caballito con la bicicleta\n3. Anda con el coche\n4. Quema rueda con el coche\n5. Ver kilometraje de la bicicleta\n6. Ver kilometraje del coche\n7. Ver kilometraje total\n8. Salir\nElige una opción (1-8): ");
            choice=sc.nextByte();
            int km=0;
            switch(choice){
                case 1:
                    System.out.print("Diga cuanto va a andar: ");
                    km=sc.nextInt();
                    bmx.andar(km);
                break;
                case 2:
                    bmx.caballitoConBici();
                break;
                case 3:
                    System.out.print("Diga cuanto va a andar: ");
                    km=sc.nextInt();
                    camaro.andar(km);
                break;
                case 4:
                    camaro.quemaRuedasCoche();
                break;
                case 5:
                    System.out.println("Mi "+bmx.getModelo()+" a recorrido "+bmx.getKilometrosRecorridos()+" kilometros");
                break;
                case 6:
                    System.out.println("Mi "+camaro.getModelo()+" a recorrido "+camaro.getKilometrosRecorridos()+" kilometros");
                break;
                case 7:
                    System.out.println("En total he recorrido "+Vehiculo.getKilometrosTotales()+" kilometos entre mis "+Vehiculo.getVehiculosCreados()+" vehiculos");
                break;
                default:
                    
            }
        }while(choice!=8);
        sc.close();
    }
}
