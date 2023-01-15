public class Incidencia{

    //Atributos de clase
    private static int numInci;
    private static int pendientes;
    
    //Atributos
    private int codigo;
    private int puesto;
    private String informacion;
    private boolean resuelto;
    private String resolucion;

    //Constructor
    Incidencia(int num, String info){
        this.puesto = num;
        this.informacion = info;
        this.codigo = ++numInci;
        this.resuelto = false;
        pendientes++;
    }

    //Getter
    static int getPendientes(){
        return pendientes;
    }

    //Metodos
    public void resuelve(String solu){
        this.resolucion = solu;
        this.resuelto = true;
        pendientes--;
    }

    public String toString(){
        return "Incidencia "+this.codigo+" - Puesto "+this.puesto+" - "+this.informacion+" - "+(this.resuelto?"Resuelta - "+this.resolucion:"Pendiente");
    }

}