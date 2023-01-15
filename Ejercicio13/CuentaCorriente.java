import java.text.DecimalFormat;
public class CuentaCorriente{
    
    //Atributos 
    private String numCuenta = "";
    private double saldo;

    //Constructor   
    CuentaCorriente(){
        this.generaNumero();
        this.saldo = 0;
    }

    CuentaCorriente(double s){
        this.generaNumero();
        this.saldo = s;
    }


    private void generaNumero(){
        for(int i = 0; i<10; i++){
            numCuenta += (int)(Math.random()*10);
        }
    }
    //Metodos
    public void ingreso(double ing){
        this.saldo += ing;
    }

    public void cargo(double carg){
        this.saldo -= carg;
    }

    public void transferencia(CuentaCorriente t, double trans){
        t.saldo += trans;
        this.saldo -= trans;
    }

    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Número de cuenta: "+this.numCuenta+" Saldo: "+formatoEuros.format(this.saldo)+"€";
    }
}