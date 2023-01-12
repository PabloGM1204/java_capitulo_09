public class Pinguino extends Ave{
    
    //Constructor
    Pinguino(){
        super();
    }

    Pinguino(Sexo s){
        super(s);
    }

    //Metodos
    public void nada(){
        System.out.println("Estoy nadando");
    }

    public void chulea(){
        System.out.println("Chuelo como nadie");
    }

    public void picotazo(){
        System.out.println("Toma picotazo");
    }
}