public class Gato3{

    //Atributos
    private String raza;
    private int edad;

    //Constructor
    Gato3(String r, int e){
        this.raza = r;
        this.edad = e;
    }
    
    //Getter
    public String getRaza(){
        return this.raza;
    }

    public int getEdad(){
        return this.edad;
    }

    //Setter
    public void setRaza(String r){
        this.raza = r;
    }

    public void setEdad(int e){
        this.edad = e;
    }
}