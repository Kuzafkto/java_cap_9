package Ejercicio15;
import Ejercicio14.FichaDomino;
public class Ejercicio15 {
    public static void main(String[] args) {
        //Como hago para automatizar el nombre???
        FichaDomino ficha0=new FichaDomino((int)(Math.random()*7),(int)(Math.random()*7));
        FichaDomino ficha1=new FichaDomino(ficha0.getSide2(), (int)(Math.random()*7));
        FichaDomino ficha2=new FichaDomino(ficha1.getSide2(), (int)(Math.random()*7));
        FichaDomino ficha3=new FichaDomino(ficha2.getSide2(), (int)(Math.random()*7));
        FichaDomino ficha4=new FichaDomino(ficha3.getSide2(), (int)(Math.random()*7));
        FichaDomino ficha5=new FichaDomino(ficha4.getSide2(), (int)(Math.random()*7));
        FichaDomino ficha6=new FichaDomino(ficha5.getSide2(), (int)(Math.random()*7));
        FichaDomino ficha7=new FichaDomino(ficha6.getSide2(), (int)(Math.random()*7));
        System.out.println(ficha0+" "+ficha1+" "+ficha2+" "+ficha3+" "+ficha4+" "+ficha5+ " "+ficha6 +" " +ficha7);
    }
    }
