public class Publicacion{
    
    //Atributos
    private String isbn;
    private String titulo;
    private int anio;

    //Constructor
    Publicacion(String isbn, String titulo, int anio){
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
    }

    //Metodos
    public String toString(){
        return "ISBN: "+this.isbn+", título: "+this.titulo+", año de publicación: "+this.anio;
    }
}