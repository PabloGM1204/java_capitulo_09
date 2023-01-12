public class Perro extends Mamifero{
    
    //Atributos
    private String raza;

    //Constructor
    Perro(){
        super();
        this.raza = "labrador";
    }

    Perro(Sexo s){
        super(s);
        this.raza = "labrador";
    }

    Perro(String r){
        super();
        this.raza = r;
    }

    Perro(Sexo s, String r){
        super(s);
        this.raza = r;
    }

    //Metodos
    public void ladrar(){
        System.out.println("Guauu Guauuu");
    }

    public void caca(){
        System.out.println("  *");
        System.out.println("****");
        System.out.println("******");
    }

    public void patita(){
        System.out.println("Toma mi patita");
    }
}