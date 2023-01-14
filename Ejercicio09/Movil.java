import java.text.DecimalFormat;
public class Movil extends Terminal9{

    //Atributos
    private String tarifa;
    private double tarificado;

    //Constructor
    Movil(String n, String t){
        super(n);
        this.tarifa = t;
        this.tarificado = 0;
    }

    //Getter
    double getTarificado(){
        return this.tarificado;
    }

    String getTarifa(){
        return this.tarifa;
    }

    //Metodos
    public void llama(Movil m, int t){
        super.llama(m, t);
        double minutos = (double)t/60;
        switch (this.getTarifa()) {
            case "rata":
                this.tarificado += minutos*0.06;
                break;
            case "mono":
                this.tarificado += minutos*0.12;
                break;
            case "bisonte":
                this.tarificado += minutos*0.30;
                break;
            default:
                break;
        }
    }

    @Override
    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Nº "+this.getNumero()+" - "+this.getTiempo()+"s de conversación - tarificados "+formatoEuros.format(this.getTarificado())+" euros";
    }

}