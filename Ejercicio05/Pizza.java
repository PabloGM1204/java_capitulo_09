public class Pizza{
    
    //Atributos
    private String tipo;
    private String tamaño;
    private boolean servida = true;

    //Atributos de clase
    private static int TotalPedidas = 0;
    private static int TotalServidas = 0;

    //Constructor
    Pizza(){
        this.tipo = "margarita";
        this.tamaño = "mediana";
        this.TotalPedidas++;
    }

    Pizza(String tip, String tam){
        this.tipo = tip;
        this.tamaño = tam;
        this.TotalPedidas++;
    }

    //Getter
    static int getTotalPedidas(){
        return TotalPedidas;
    }

    static int getTotalServidas(){
        return TotalServidas;
    }

    //Metodos

    public String toString(){
        return "pizza "+this.tipo+", "+this.tamaño+", "+((this.servida)?"perdida":"servida");
    }

    public void servir(){
        if(this.servida){
            this.TotalServidas++;
            this.servida = false;
        }else{
            System.out.println("Esa pisa ya se ha servido");
        }
    }
}