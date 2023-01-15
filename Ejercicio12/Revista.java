public class Revista extends Publicacion{
    
    //Atributos
    private int num;

    //Constructor
    Revista(String isbn, String titulo, int anio, int num){
        super(isbn, titulo, anio);
        this.num = num;
    }
}