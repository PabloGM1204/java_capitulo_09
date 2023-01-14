public class Terminal{
    
    //Atributos
    private String numero;
    private int tiempo;

    //Constructor
    Terminal(String n){
        this.numero = n;
    }

    //Getter
    int getTiempo(){
        return this.tiempo;
    }

    //Metodos
    public String toString(){
        return "Nº "+this.numero+" - "+this.tiempo+"s de conversación";
    }

    public void llama(Terminal ter,int t){
        ter.tiempo += t;
        this.tiempo += t;
    }
}