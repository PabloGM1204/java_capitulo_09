public class Piramide{

    //Atributos de clase
    private static int piramidesCreadas;

    //Atributos
    private int altura;

    //Constructor
    Piramide(int alt){
        this.altura = alt;
        this.piramidesCreadas++;
    }

    //Getter
    static int getPiramidesCreadas(){
        return piramidesCreadas;
    }

    //Metodos
    private String crearPiramide(int alt){
        int esp = alt-1;
        int lin = 1;
        String piramide = "";
        for(int i = 0; i<alt; i++){
            for(int j = 0; j<esp; j++){
                piramide += " ";
            }
            
            for(int j = 0; j<lin; j++){
                piramide += "*";
            }
            piramide += '\n';
            esp--;
            lin += 2;
        }
        return piramide;
    }

    public String toString(){
        return crearPiramide(this.altura);
    }
}