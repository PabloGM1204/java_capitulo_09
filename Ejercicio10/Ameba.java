public class Ameba{

    //Atributo
    private int peso;

    //Constructor
    Ameba(){
        this.peso = 3;
    }

    //Getter
    int getPeso(){
        return this.peso;
    }

    //Metodos
    public void come(int c){
        this.peso += (c-1);
    }
    
    
    public void come(Ameba a){
        this.peso += (a.peso-1);
        a.peso = 0;
    }

    public String toString(){
        return "Soy una ameba y peso "+this.getPeso()+" gramos";
    }
}