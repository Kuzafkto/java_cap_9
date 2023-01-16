package Ejercicio12.Ejercicio12ClassVersion;

public class Publicacion{
    String isbn;
    String titulo;
    int ano;

    Publicacion(String isbn,String titulo, int ano){
        this.isbn=isbn;
        this.titulo=titulo;
        this.ano=ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "ISBN: "+this.isbn+", título: "+this.titulo+", año de publicación: "+this.ano;
    }
}
