public class Lagarto extends Animal{
    
    //Atributos
    private String color;

    //Constructor
    Lagarto(){
        super();
        this.color = "verde";
    }

    Lagarto(Sexo s){
        super(s);
        this.color = "verde";
    }

    Lagarto(String c){
        super();
        this.color = c;
    }

    Lagarto(Sexo s, String c){
        super(s);
        this.color = c;
    }

    //Metodos

    public void camina(){
        System.out.println("Estoy caminando");
    }

    public void sacaLaLengua(){
        System.out.println("8----");
    }

    public void mueveLaCola(){
        System.out.println(">---__--");
    }
}