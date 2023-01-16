import java.util.Scanner;
public class PruebaGato{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Gato2[] cat = new Gato2[4];

        for(int i = 0; i<4; i++){
            cat[i] = new Gato2();
            System.out.println("¿El gato número "+(i+1)+" es de raza?");
            String r = sc.next();
            cat[i].setRaza(r);
            System.out.println("¿Cuantos años tiene?");
            int e = sc.nextInt();
            cat[i].setEdad(e);
        }

        for(int i = 0; i<4; i++){
            System.out.println("El gato "+(i+1)+" es de raza "+cat[i].getRaza()+" y tiene "+cat[i].getEdad()+" años.");
        }


    }
}