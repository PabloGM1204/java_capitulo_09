public class Punto{
    
    //Atributos
    private double x;
    private double y;

    //Constructor
    Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Metodos
    public String toString(){
        return "( "+this.x+", "+this.y+" )";
    }
}