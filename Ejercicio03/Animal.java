public class Animal{
    
    //Atributos
    private Sexo sexo;

    //Constructor
    public Animal () {
        this.sexo = Sexo.MACHO;
    }

    public Animal(Sexo s){
        this.sexo = s;
    }

    //Getter
    String getSexo(){
        return this.sexo;
    }
}