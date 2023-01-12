public class Ave extends Animal{
    
    //Constructor
    Ave(){
        super();
    }

    Ave(Sexo s){
        super(s);
    }

    //Metodos
    public void ponerHuevo(){
        if(this.getSexo() == Sexo.MACHO){
            System.out.println("Soy macho por lo que no puedo");
        }else{
            System.out.println("Toma huevo...");
        }
    }

    public void vuela(){
        System.out.println("Estoy volando");
    }

    public void limpiate(){
        System.out.println("Me limpio");
    }

}