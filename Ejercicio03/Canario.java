public class Canario extends Ave{
    
    //Constructor
    Canario(){
        super();
    }

    Canario(Sexo s){
        super(s);
    }

    //Metodos
    public void hacerRuido(){
        System.out.println("Hago ruido");
    }

    public void Pia(){
        System.out.println("PIO PIO");
    }

    public void mueveLasAlas(){
        System.out.println("Fiiumm Fiuum");
    }
}