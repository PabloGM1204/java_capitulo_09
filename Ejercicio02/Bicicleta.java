public class Bicicleta extends Vehiculo{

    //Atributos
    private int pinones;
    private String nombre;

    //Constructor
    Bicicleta(int p, String n){
        super();
        this.pinones = p;
        this.nombre = n;
    }

    //Getter
    int getPinones(){
        return this.pinones;
    }

    String getNombre(){
        return this.nombre;
    }

    //Métodos
    public void hacerCaballito(){
        System.out.println("Mira que guapo el caballito");
    }
}