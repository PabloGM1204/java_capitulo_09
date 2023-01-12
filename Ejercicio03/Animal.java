public abstract class Animal{
    
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
    Sexo getSexo(){
        return this.sexo;
    }

    //Metodos
    public void duerme(){
        System.out.println("Zzzzzz");
    }

    public void come(String comida){
        System.out.println("Estoy comiendo "+comida);
    }
}