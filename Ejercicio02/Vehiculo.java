public class Vehiculo {
    
    //Atributos de clase
    private static int vehiculosCreados;
    private static int kilometrosTotales;

    //Atributos de instancia
    private int kilometrosRecorridos;

    //Constructor
    Vehiculo(){
        this.kilometrosRecorridos = 0;
    }

    //Getter
    static int getKilometrosTotales(){
        return kilometrosTotales;
    }

    int getKilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }

    //Métodos
    public void recorrido(int km){
        this.kilometrosRecorridos += km;
        Vehiculo.kilometrosTotales += km;
    }
    
    


}
