public class Mamifero extends Animal{

    //Constructor
    Mamifero(){
        super();
    }

    Mamifero(Sexo s){
        super(s);
    }

    //Metodos
    public void camina(){
        System.out.println("Estoy caminando");
    }

    public void amamanta(){
        if(this.getSexo() == Sexo.MACHO){
            System.out.println("Lo siento, soy macho y no puedo amamantar");
        }else{
            System.out.println("Toma estate tranquilo");
        }
    }

    public void cuidaCrias(){
        System.out.println("Estoy cuidando de las crias");
    }
}