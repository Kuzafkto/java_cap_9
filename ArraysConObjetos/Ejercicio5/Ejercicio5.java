package ArraysConObjetos.Ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        //Debido a que no tenemos array list decidiremos directamente crear un array grande.
        Articulo almacen[]=new Articulo[50];
        int counter=0;//Un counter para cuando asignemos objetos.
        //Debo de inicializar el array con valores a 0 porque de lo contrario el getCode no funciona.
        //Notes: no hice un metodo de chequearCódigo;
        for (int i=0;i<almacen.length;i++) {
            almacen[i]=new Articulo();
        }
        while (choice!=7){
            System.out.print("Elija una opción:\n1.Listado\n2.Alta\n3.Baja\n4.Modificación\n5.Entrada de mercancía\n6.Salida de mercancía\n7.Salir\n");
            choice =sc.nextInt();
            switch(choice){
                case 1:
                    for(int i=0;almacen[i].desc!=""&&i<almacen.length;i++){
                        if(almacen[i]!=null){
                            System.out.println(almacen[i]);
                        }else{
                            System.out.println("(Este objeto esta vacio)");
                        }
                        System.out.println("----------------------");
                    }
                break;
                case 2:
                    almacen[counter]=new Articulo();
                    System.out.print("Ingrese la descripción del producto: ");
                    almacen[counter].desc=sc.nextLine();
                    almacen[counter].desc=sc.nextLine();
                    System.out.print("Ingrese el precio de compra: ");
                    double price=sc.nextDouble();
                    while(price<0){
                        System.out.print("Error, el precio no puede ser negativo, vuelva a ingresarlo: ");
                        price=sc.nextDouble();
                    }
                    almacen[counter].buyPrice=price;
                    System.out.print("Ingrese el precio de venta: ");
                    price=sc.nextDouble();
                    while(price<0){
                        System.out.print("Error, el precio no puede ser negativo, vuelva a ingresarlo: ");
                        price=sc.nextDouble();
                    }
                    almacen[counter].sellPrice=price;
                    System.out.print("Ingrese el stock del producto: ");
                    int stock=sc.nextInt();
                    while (stock<0){
                        System.out.print("El stock no puede ser negativo, vuelva a ingresarlo: ");
                        stock=sc.nextInt();
                    }
                    almacen[counter].stock=stock;

                    counter++;
                break;
                case 3:
                    System.out.print("Ingrese el código del item a bajar: ");
                    String code=sc.nextLine();
                     code=sc.nextLine();
                    boolean found=false;
                    for(int i=0;i<almacen.length;i++){
                        if(almacen[i].getCode().equals(code)){
                            almacen[i]=new Articulo();
                            System.out.println("El item se ha dado de baja correctamente");
                            found=true;
                        }
                    }
                    if(!found){
                        System.out.println("Error, no se ha encontrado el objeto con el codigo: "+code);
                    }
                break;
                case 4:
                System.out.print("Ingrese el código del item a modificar: ");
                 code=sc.nextLine();
                 code=sc.nextLine();
                 found=false;
                 for(int i=0;i<almacen.length;i++){
                    if(almacen[i].getCode().equals(code)){
                        almacen[i]=new Articulo();
                        System.out.println("Seleccione lo que desea modificar del item:\n1.Descripción\n2.Precio de compra\n3.Precio de venta\n4.Stock");
                        choice=sc.nextInt();
                        while(choice<0||choice>4){
                            System.out.print("Opción no valida, vuelva a ingresarla: ");
                            choice=sc.nextInt();
                        }
                        switch(choice){
                            case 1:
                                System.out.print("Ingrese la nueva descripción: ");
                                almacen[i].desc=sc.nextLine();
                                almacen[i].desc=sc.nextLine();
                            break;
                            case 2:
                            System.out.print("Ingrese el nuevo precio de compra: ");
                            price=sc.nextDouble();
                            price=sc.nextDouble();
                            while(price<0){
                                System.out.println("El precio no puede ser negativo, vuelva a ingresarlo: ");
                                price=sc.nextDouble();
                            }
                            almacen[i].buyPrice=price;
                            break;  
                            case 3:
                            System.out.print("Ingrese el nuevo precio de venta: ");
                            price=sc.nextDouble();
                            price=sc.nextDouble();
                            while(price<0){
                                System.out.println("El precio no puede ser negativo, vuelva a ingresarlo: ");
                                price=sc.nextDouble();
                            }
                            almacen[i].sellPrice=price;
                            break;
                            case 4:
                            System.out.print("Ingrese el nuevo stock del producto: ");
                             stock=sc.nextInt();
                             stock=sc.nextInt();

                            while(stock<0){
                                System.out.print("El stock no puede ser negativo, vuelva a ingresarlo: ");
                                stock=sc.nextInt();
                            }
                            almacen[i].stock=stock;
                            break;
                        }
                        found=true;
                    }
                }
                if(!found){
                    System.out.println("Error, no se ha encontrado el objeto con el codigo "+code);
                }
                break;
                case 5:
                System.out.print("Ingrese el código del item a entrar: ");
                found=false;
                 code=sc.nextLine();
                 code=sc.nextLine();
                for(int i=0;i<almacen.length;i++){
                    if(almacen[i].getCode().equals(code)){
                        System.out.print("Ingrese la cantidad de items a añadir al stock: ");
                        int amount=sc.nextInt();
                        while (amount<0){
                            System.out.print("La cantidad no puede ser menor a 0, por favor vuelva a ingresarla: ");
                            amount=sc.nextInt();
                        }
                        almacen[i].stock+=amount;
                        System.out.println("Se han añadidos los items correctamente");
                        found=true;
                    }
                }
                if(!found){
                    System.out.println("Error, no se ha encontrado el objeto con el codigo: "+code);
                }
                break;
                case 6: 
                System.out.print("Ingrese el código del item a sacar: ");
                found=false;
                 code=sc.nextLine();
                 code=sc.nextLine();
                for(int i=0;i<almacen.length;i++){
                    if(almacen[i].getCode().equals(code)){
                        System.out.print("Ingrese la cantidad de items a sacar del stock: ");
                        int amount=sc.nextInt();
                        while (amount<0){
                            System.out.print("La cantidad no puede ser menor a 0, por favor vuelva a ingresarla: ");
                            amount=sc.nextInt();
                        }
                        if(almacen[i].stock-amount<0){
                            System.out.println("Error.La cantidad a sacar es menor que la cantidad disponible en el stock");
                        }else{
                            almacen[i].stock-=amount;
                            System.out.println("Se han quitado los items correctamente");
                        }
                        found=true;
                    }
                }
                if(!found){
                    System.out.println("Error, no se ha encontrado el objeto con el codigo: "+code);
                }
                break;
            }
        }
        sc.close();
    }
}
