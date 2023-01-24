/*
 * 
 * Modifica el programa “Colección de discos” como se indica a continuación:
a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
posiciones del array, el programa muestre un mensaje de error. No se permitirá
introducir los datos de ningún disco hasta que no se borre alguno de la lista.
b) Mejora la opción “Borrar” de tal forma que se verifique que el código
introducido por el usuario existe.
c) Modifica el programa de tal forma que el código del disco sea único, es decir
que no se pueda repetir.
d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
listado completo, un listado por autor (todos los discos que ha publicado un
determinado autor), un listado por género (todos los discos de un género determinado) y un listado de discos cuya duración esté en un rango determinado
por el usuario.

* @author Kuzafkto
 */

package ArraysConObjetos.Ejercicio4;

//En este caso voy a copiar directamente el ejemplo de la colección de discos y mejorarlo
import java.util.Scanner;
public class Ejercicio4 {
  public static void main(String[] args) {
    // N determina el tamaño del array
    final int N = 50;

    //Crea el array de discos
    Disco[] discos = new Disco[N];

    // Crea todos los discos que van en cada una de las celdas del array
    for(int i = 0; i < N; i++) {
      discos[i] = new Disco();
    }

    // Carga varios discos
    discos[0] = new Disco(
      "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
    discos[1] = new Disco(
      "FGHQ64", "Metallica", "Black album", "hard rock", 46);
    discos[2] = new Disco(
      "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

    int opcion;
    Scanner s = new Scanner(System.in);
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int duracionIntroducida;

    do {
      System.out.println("\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
      case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");
        System.out.print("Elija el metodo de listado:\n1.Completo\n2.Por autor\n3.Por genero\n4.Por duración: ");
        opcion=Integer.parseInt(s.nextLine());
        switch (opcion){
            case 1:
            for(Disco d : discos) {
                if (!d.getCodigo().equals("LIBRE")) {
                  System.out.println(d);
                }
              }
            break;
            case 2:
            System.out.print("Ingrese el autor: ");
            String author=s.nextLine();
            for(Disco d : discos) {
                if (!d.getCodigo().equals("LIBRE")&&d.getAutor().equals(author)){
                  System.out.println(d);
                }
              }
            break;
            case 3:
            System.out.print("Ingrese el genero: ");
            String genre=s.nextLine();
            for(Disco d : discos) {
                if (!d.getCodigo().equals("LIBRE")&&d.getGenero().equals(genre)) {
                  System.out.println(d);
                }
              }
            break;
            case 4:
            int min=0;
            int max=0;
            do{
                System.out.print("Ingrese el rango de la duración\nMinimo: ");
                 min=Integer.parseInt(s.nextLine());
                System.out.print("\nMáximo: ");
                 max=Integer.parseInt(s.nextLine());

                if(max<min||max<0||min<0){
                    System.out.println("Error, los datos han sido ingresados incorrectamente, vuelva a ingresarlos.\n");
                }
            }while(max<min||max<0||min<0);

            for(Disco d : discos) {
                if (!d.getCodigo().equals("LIBRE")&&d.getDuracion()<=max&&d.getDuracion()>=min){
                  System.out.println(d);
                }
              }
            break;
        }
        break;
        
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        boolean full=false;
        // Busca la primera posición libre del array
        int primeraLibre = -1;
        do {
          primeraLibre++;
          if(primeraLibre>=discos.length){
            System.out.println("Error, el array de discos está lleno, por favor borre un disco para introducir uno nuevo");
            full=true;
            break;
        }
        } while (!((discos[primeraLibre].getCodigo()).equals("LIBRE")));
        
        if(!full){
            System.out.println("Por favor, introduzca los datos del disco.");  
            System.out.print("Código: ");
            codigoIntroducido = s.nextLine();
            boolean repeated=false;
            do{
                repeated=false;
                for(int i=0;i<discos.length;i++){
                    if(discos[i].getCodigo().equals(codigoIntroducido)){
                        repeated=true;
                    }
                }
                if(repeated){
                    System.out.print("El código introducido ya está repetido, por favor vuelva a ingresarlo: ");
                    codigoIntroducido = s.nextLine();
                }
            }while(repeated);
            System.out.print("Autor: ");
            autorIntroducido = s.nextLine();
            System.out.print("Título: ");
            tituloIntroducido = s.nextLine();
            System.out.print("Género: ");
            generoIntroducido = s.nextLine();
            System.out.print("Duración: ");
            duracionIntroducida = Integer.parseInt(s.nextLine());
            discos[primeraLibre] = new Disco(
              codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida);    
        }
        break;
        
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido = s.nextLine();
        int i = -1;
        do {
          i++;
        } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));
        
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
  
        System.out.println("Código: " + discos[i].getCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = s.nextLine();
        boolean repeated=false;
            do{
                repeated=false;
                for(int j=0;j<discos.length;j++){
                    if(discos[j].getCodigo().equals(codigoIntroducido)){
                        repeated=true;
                    }
                }
                if(repeated){
                    System.out.print("El código introducido ya está repetido, por favor vuelva a ingresarlo: ");
                    codigoIntroducido = s.nextLine();
                }
            }while(repeated);
        if (!codigoIntroducido.equals("")) {
          discos[i].setCodigo(codigoIntroducido);
        }
        
        System.out.println("Autor: " + discos[i].getAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = s.nextLine();
        if (!autorIntroducido.equals("")) {
          discos[i].setAutor(autorIntroducido);
        }
        
        System.out.println("Título: " + discos[i].getTitulo());
        System.out.print("Nuevo título: ");
        tituloIntroducido = s.nextLine();
        if (!tituloIntroducido.equals("")) {
          discos[i].setTitulo(tituloIntroducido);
        }
        
        System.out.println("Género: " + discos[i].getGenero());
        System.out.print("Nuevo género: ");
        generoIntroducido = s.nextLine();
        if (!generoIntroducido.equals("")) {
          discos[i].setGenero(generoIntroducido);
        }
        
        System.out.println("Duración: " + discos[i].getDuracion());
        System.out.print("Duración: ");
        final String duracionIntroducidaString = s.nextLine();
        if (!duracionIntroducidaString.equals("")) {
          discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        
        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido = s.nextLine();
        boolean exists=false;
        for(int j=0;j<discos.length;j++){
            if(discos[j].getCodigo().equals(codigoIntroducido)){
                exists=true;
            }
        }
        if(exists){
            i = -1;
            do {
              i++;
            } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));
            discos[i].setCodigo("LIBRE");
            System.out.println("Album borrado.");
        }else{
            System.out.println("Error, el codigo introducido no existe");
        }
       
        break;
        
      default:
      
      } // switch
    } while (opcion != 5);
    s.close();
  }
}
