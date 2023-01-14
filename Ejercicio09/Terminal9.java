public class Terminal9{
    
    //Atributos
    private String numero;
    private int tiempo;

    //Constructor
    Terminal9(){

    }

    Terminal9(String n){
        this.numero = n;
    }

    //Getter
    int getTiempo(){
        return this.tiempo;
    }

    String getNumero(){
        return this.numero;
    }

    //Metodos
    public String toString(){
        return "Nº "+this.getNumero()+" - "+this.getTiempo()+"s de conversación";
    }

    public void llama(Terminal9 ter,int t){
        ter.tiempo += t;
        this.tiempo += t;
    }
}