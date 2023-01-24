public class TestFile {
    public static void main(String[] args) {
        PilotoFormula1 soloNombre=new PilotoFormula1("Juan");
        PilotoFormula1 vacio=new PilotoFormula1();
        PilotoFormula1 dniYNombre=new PilotoFormula1(2012,"Roberto");
        PilotoFormula1 completo=new PilotoFormula1(Sexo.MUJER,2033,"completo");
        System.out.println(soloNombre);
        System.out.println(vacio);
        System.out.println(dniYNombre);
        System.out.println(completo);
    }
}
