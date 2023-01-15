public class Rectangualo{

    //Atributos
    private static int contadorRectangulo;

    //Atributos
    private int alt;
    private int anc;

    //Constructor
    Rectangualo(int alt, int anc){
        this.alt = alt;
        this.anc = anc;
        contadorRectangulo++;
    }

    //Getter
    static int getContadorRectangulo(){
        return contadorRectangulo;
    }

    //Metodos
    public String crearRectangulo(int alt, int anc){
        String cuadrado = "";
        for(int i = 0; i<alt; i++){
            for(int j = 0; j<anc; j++){
                cuadrado += "*";
            }
            cuadrado += '\n';
        }
        return cuadrado;
    }

    public String toString(){
        return crearRectangulo(this.alt, this.anc);
    }

}