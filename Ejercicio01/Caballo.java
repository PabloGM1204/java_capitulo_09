public class Caballo {

    //Atributos
    private String nombre;
    private String color;
    private int edad;

    //Constructor
    Caballo(String n, String c, int e){
        this.nombre = n;
        this.color = c;
        this.edad = e;
    }

    //Getter
    String getNombre(){
        return this.nombre;
    }

    //Métodos
    public void relinchar(){
        System.out.println("Hiiiieeee");
    }

    public void cabalgar(){
        System.out.println("Toco toc Toco toc");
    }

    public void rumiar(){
        System.out.println("Ñam Ñam Ñam");
    }

}