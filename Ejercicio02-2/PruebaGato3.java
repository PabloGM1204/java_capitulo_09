public class PruebaGato3{
    public static void main(String[] args) {
        
        Gato3[] cat = new Gato3[4];

        cat[0] = new Gato3("Gato 0", 0);
        cat[1] = new Gato3("Gato 1", 1);
        cat[2] = new Gato3("Gato 2", 2);
        cat[3] = new Gato3("Gato 3", 3);


        for(int i = 0; i<4; i++){
            System.out.println("El gato "+(i+1)+" es de raza "+cat[i].getRaza()+" y tiene "+cat[i].getEdad()+" años.");
        }


    }
}