public class FichaDomino{
    
    //Atributos
    private int cara1;
    private int cara2;

    //Constructor
    FichaDomino(int c1, int c2){
        this.cara1 = c1;
        this.cara2 = c2;
    }

    //Metodo
    public String toString(){
        return "["+(this.cara1 == 0 ? " ": this.cara1)+"|"+(this.cara2 == 0 ? " ": this.cara2)+"]";
    }

    public String voltea(){
        int aux = this.cara1;
        this.cara1 = this.cara2;
        this.cara2 = aux;
        return this.toString();
    }

    public boolean encaja(FichaDomino enc){
        return (this.cara1 == enc.cara1) || (this.cara1 == enc.cara2) || (this.cara2 == enc.cara1) || (this.cara2 == enc.cara2);
    }

}