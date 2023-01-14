import java.text.DecimalFormat;
public class TarjetaDeRegalo{
    
    //Atributos
    private int num;
    private double saldo;

    //Constructor
    TarjetaDeRegalo(double s){
        this.num = (int)(Math.random()*(100000-9999+1)+9999);
        this.saldo = s;
    }

    //Getter
    double getSaldo(){
        return this.saldo;
    }

    int getNum(){
        return this.num;
    }

    //Metodos
    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Tarjeta nº "+this.getNum()+" - Saldo "+formatoEuros.format(this.getSaldo())+" €";
    }

    public void gasta(double g){
        if((this.getSaldo()-g)<0){
            System.out.println("No tienes suficiente saldo para gastar "+g+" €");
        }else{
            this.saldo -= g;
        }
    }

    public TarjetaDeRegalo fusionaCon(TarjetaDeRegalo tar){
        double salter = this.saldo + tar.getSaldo();
        this.saldo = 0;
        tar.saldo = 0;
        return new TarjetaDeRegalo(salter);
    }

}