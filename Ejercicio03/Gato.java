public class Gato extends Mamifero{
    
    //Atributos
    private String raza;

    //Constructor
    Gato(){
        super();
        this.raza = "siames";
    }

    Gato(Sexo s){
        super(s);
        this.raza = "siames";
    }

    Gato(String r){
        super();
        this.raza = r;
    }

    Gato(Sexo s, String r){
        super(s);
        this.raza = r;
    }

    //Metodos
    public void maulla(){
        System.out.println("Miaaauuu");
    }

    //@Override
    public void come(String c){
        if(c == "pescado"){
            System.out.println("Ñam Ñam que rico");
        }else{
            System.out.println("Esto no me gusta");
        }
    }

    public void peleaConOtroGato(Gato contrincante){
        if(this.getSexo() == Sexo.HEMBRA){
            System.out.println("No me quiero romper una uña");
        }else if(contrincante.getSexo() == Sexo.HEMBRA){
            System.out.println("No peleo contra mujeres");
        }else{
            System.out.println("Te va a caer una");
        }
    }

}