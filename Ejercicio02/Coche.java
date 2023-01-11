public class Coche extends Vehiculo{
    
    //Atributos
    private String marca;

    //Constructor
    Coche(String m){
        super();
        this.marca = m;
    }

    //Getter
    String getMarca(){
        return this.marca;
    }

    //Método
    public void quemarRueda(){
        System.out.println("Brmmmmmm Brmmmmmm");
    }
}