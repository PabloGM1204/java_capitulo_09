public class Libro extends Publicacion implements Prestable{

    //Atributo
    private boolean prestado;

    //Constructor
    Libro(String isbn, String titulo, int anio){
        super(isbn, titulo, anio);
        this.prestado = false;
    }

    //Metodos
    public void presta(){
        this.prestado = true;
    }

    public void devuelve(){
        this.prestado = false;
    }

    public boolean estaPrestado(){
        return this.prestado;
    }

    @Override
    public String toString(){
        return super.toString()+" ("+(this.prestado?"Esta prestado)":"No prestado)");
    }
}