import java.util.Scanner;
public class Prueba{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        int km = 0;

        Bicicleta bike = new Bicicleta(5, "Montbicis");
        Coche c1 = new Coche("SEAT");

        do {
            System.out.println("VEHÍCULOS\n=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción(1-8)");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Cuantos kilometros has hecho: ");
                    km = sc.nextInt();
                    bike.recorrido(km);
                    break;
                case 2:
                    bike.hacerCaballito();
                    break;
                case 3:
                    System.out.print("Cuantos kilometros has hecho: ");
                    km = sc.nextInt();
                    c1.recorrido(km);
                    break;
                case 4:
                    c1.quemarRueda();
                    break;
                case 5:
                    System.out.println("Has recorrido con la bici "+bike.getKilometrosRecorridos()+" kms");
                    break;
                case 6:
                    System.out.println("Has recorrido con el coche "+c1.getKilometrosRecorridos()+" kms");
                    break;
                case 7:
                    System.out.println("Los kilometros totales son "+Vehiculo.getKilometrosTotales()+" kms");
                    break;
                case 8:
                    salir = false;
                    System.out.println("ADIOS");
                    break;
                default:
                System.out.println("Escriba bien su opcion");
                    break;
            }
        } while (!salir);
    }
}