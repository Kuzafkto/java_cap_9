package Ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Zona principal=new Zona(1000);
        Zona compraVenta=new Zona(200);
        Zona vip=new Zona(25);

        int choice=0;
        while(choice!=3){
            System.out.print("\nSeleccione una opción\n---------------------\n1.Mostrar número de entradas libres\n2.Vender entradas\n3.Salir\n---------------------\nIngrese su opción: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Hay "+principal.getEntradasPorVender()+" entradas en la zona principal");
                    System.out.println("Hay "+compraVenta.getEntradasPorVender()+" entradas en la zona de compra-venta");
                    System.out.println("Hay "+vip.getEntradasPorVender()+" entradas en la zona VIP");
                break;
                case 2:
                System.out.print("\nElige de que zona quieres comprar entradas\n1-Principal\n2-Compra-venta\n3-VIP\nElección: ");
                choice=sc.nextInt();
                while (choice>3||choice<1){
                    System.out.print("Opción invalida, ingresela de nuevo: ");
                    choice=sc.nextInt();
                }
                System.out.print("Cuantas entradas quiere?: ");
                int amount=sc.nextInt();
                switch(choice){
                    case 1:
                        principal.vender(amount);
                    break;
                    case 2:
                        compraVenta.vender(amount);
                    break;
                    case 3:
                    vip.vender(amount);
                    break;
                }
                choice=0;
                break;

                default:
                break;
            }
        }
        sc.close();
    }
}
