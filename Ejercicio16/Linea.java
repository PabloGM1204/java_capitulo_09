public class Linea{
    
    //Atributos
    private Punto orig;
    private Punto dest;

    //Constructor
    Linea(Punto orig, Punto dest){
        this.orig = orig;
        this.dest = dest;
    }

    //Metodos
    public String toString(){
        return "La linea formada por los puntos "+this.orig+" y "+this.dest;
    }
}