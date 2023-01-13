public class Fraccion{

    //Atributos
    private int numerador;
    private int denominador;

    //Constructor
    Fraccion(int nume, int deno){
        this.numerador = nume;
        this.denominador = deno;
        if(this.denominador == 0){
            System.out.println("El denominador no puede ser 0");
        }else{
            System.out.println(this.numerador+"/"+this.denominador);
        }
    }

    //Getter
    int getNumerador(){
        return this.numerador;
    }

    int getDenominador(){
        return this.denominador;
    }

    //Metodos
    public Fraccion invertir(){
        return new Fraccion(this.denominador, this.numerador);
    }

    public void simplificar(){
        boolean salir = false;
        int cont = 2;
        do{
            if((this.numerador % cont  == 0) && (this.denominador % cont == 0) && (this.denominador > 0)){
                this.numerador /= cont;
                this.denominador /= cont;
                salir = true;
            }
            cont++;
        }while(!salir);
        System.out.println(this.numerador+"/"+this.denominador);
    }

    public Fraccion multiplicar(Fraccion multi){
        return new Fraccion((this.numerador * multi.getNumerador()), (this.denominador * multi.getDenominador()));
    }

    public Fraccion dividir(Fraccion divi){
        divi.invertir();
        return new Fraccion((this.numerador * divi.numerador), (this.denominador * divi.denominador));
    }
}