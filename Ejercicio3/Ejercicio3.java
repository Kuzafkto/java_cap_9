package Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Perro hachiko=new Perro(Sexo.MACHO);
        Pinguino pengu= new Pinguino();
        Canario charles=new Canario(Sexo.HEMBRA);
        Gato james=new Gato(Sexo.MACHO);
        charles.cuidarHuevos();
        hachiko.dormir();
        hachiko.cazar();
        hachiko.correr();
        charles.volar();
        pengu.volar();
        pengu.nadar();
        james.comer("raton");
        james.bebe("leche");
    }
}
